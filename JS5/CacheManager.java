package org.codeusa.cache;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;

import org.codeusa.cache.stream.RSByteArrayInputStream;
import org.codeusa.cache.stream.RSInputStream;
import org.codeusa.net.message.Message;
import org.codeusa.net.message.MessageBuilder;
import org.codeusa.util.BufferUtils;

public class CacheManager {

	private static FileInformationTable[] informationTables;
	private static FileStore fs255;
	private static FileStore[] fileStores;
	private static Object[][][] archiveFiles;

	private static byte[] versionTable;

	public static void load(final String path) throws Exception {
		fs255 = new FileStore(255, path);

		final int cacheIndicies = fs255.length();

		informationTables = new FileInformationTable[cacheIndicies + 1];
		fileStores = new FileStore[cacheIndicies];
		archiveFiles = new Object[cacheIndicies][][];
		for (int i = 0; i < informationTables.length; i++) {
			final byte[] data = fs255.get(i);
			if (data != null) {
				informationTables[i] = FileInformationTable
						.createFileInformationTable(i, data);
				archiveFiles[i] = new Object[informationTables[i]
						.getEntryCount()][];
			}
		}
		for (int i = 0; i < fileStores.length; i++) {
			fileStores[i] = new FileStore(i, path);
		}
		final int length = cacheIndicies;
		final int size = (length * 74) + 3;
		final CRC32 crc = new CRC32();
		final ByteBuffer mainFileBuffer = ByteBuffer.allocate(size);
		mainFileBuffer.put((byte) 0).putInt(size - 5).put((byte) length);
		for (int i = 0; i < length; i++) {
			final byte[] file = fs255.get(i);
			if (file == null) {
				mainFileBuffer.putInt(0).putInt(0)
				.put(Whirlpool.whirlpool(new byte[0], 0, 0));
				continue;
			}
			crc.update(file);
			mainFileBuffer.putInt((int) crc.getValue())
			.putInt(informationTables[i].getRevision())
			.put(Whirlpool.whirlpool(file, 0, file.length));
			crc.reset();
		}
		final int bufferPosition = mainFileBuffer.position();
		mainFileBuffer.rewind();
		final byte[] mainFileData = new byte[bufferPosition];
		mainFileBuffer.get(mainFileData).rewind().position(bufferPosition);
		mainFileBuffer.put((byte) 10).put(
				Whirlpool.whirlpool(mainFileData, 5, mainFileData.length - 5)); // TODO
		// Fix
		// this

		versionTable = mainFileBuffer.array();
	}

	public static FileStore getCrc() {
		return fs255;
	}

	public static FileInformationTable getFIT(final int cache) {
		return informationTables[cache];
	}

	public static byte[] getByName(final int cache, final String name) {
		final int id = informationTables[cache].findName(name);
		return fileStores[cache].get(id);
	}

	public static int getArchiveName(final int cache, final String name) {
		final int id = informationTables[cache].findName(name);
		return id;
	}

	public static byte[] getFile(final int cache, final int id) {
		if ((cache == 255) && (id == 255)) {
			return versionTable;
		}
		if (cache == 255) {
			return fs255.get(id);
		}
		return fileStores[cache].get(id);
	}

	public static FileStore getFileStore(final int cache) {
		if (cache == 255) {
			return fs255;
		}
		return fileStores[cache];
	}

	public static boolean loadArchive(final int cache, int main)
			throws IOException {
		if (archiveFiles[cache].length < main) {
			main = archiveFiles[cache].length;
		}
		final int[] is_11_ = informationTables[cache].getEntry_sub_ptr()[main];
		boolean bool = true;
		final int count = informationTables[cache].getArchiveCount()[main];
		if (archiveFiles[cache][main] == null) {
			archiveFiles[cache][main] = new Object[informationTables[cache]
					.getEntry_real_sub_count()[main]];
		}
		final Object[] objects = archiveFiles[cache][main];
		for (int i_13_ = 0; i_13_ < count; i_13_++) {
			int i_14_;
			if (is_11_ != null) {
				i_14_ = is_11_[i_13_];
			} else {
				i_14_ = i_13_;
			}
			if (objects[i_14_] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		final byte[] is_16_ = fileStores[cache].get(main);
		byte[] data = null;
		try {
			data = new CacheContainer(is_16_).decompress();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		if (data == null) {
			return false;
		}
		if (count > 1) {
			int i_18_ = data.length;
			final int i_19_ = data[--i_18_] & 0xff;
			final RSInputStream stream = new RSInputStream(
					new RSByteArrayInputStream(data));
			i_18_ -= i_19_ * count * 4;
			stream.seek(i_18_);
			final int[] subWritePos = new int[count];
			for (int x = 0; i_19_ > x; x++) {
				int i_22_ = 0;
				for (int i = 0; i < count; i++) {
					i_22_ += stream.readInt();
					subWritePos[i] += i_22_;
				}
			}
			final byte[][] subData = new byte[count][];
			for (int i = 0; i < count; i++) {
				subData[i] = new byte[subWritePos[i]];
				subWritePos[i] = 0;
			}
			int readPos = 0;
			stream.seek(i_18_);
			for (int i = 0; i < i_19_; i++) {
				int i_28_ = 0;
				for (int subId = 0; subId < count; subId++) {
					i_28_ += stream.readInt();
					System.arraycopy(data, readPos, subData[subId],
							subWritePos[subId], i_28_);
					readPos += i_28_;
					subWritePos[subId] += i_28_;
				}
			}
			for (int i = 0; i < count; i++) {
				int i_31_;
				if (is_11_ != null) {
					i_31_ = is_11_[i];
				} else {
					i_31_ = i;
				}
				objects[i_31_] = subData[i];
			}
		} else {
			int i_32_;
			if (is_11_ != null) {
				i_32_ = is_11_[0];
			} else {
				i_32_ = 0;
			}
			objects[i_32_] = data;
		}
		archiveFiles[cache][main] = objects;
		return true;
	}

	public static Message generateFile(final int container, final int file,
			final int opcode) {
		final byte[] cacheFile = getFile(container, file);
		final int compression = cacheFile[0] & 0xFF;
		final int length = BufferUtils.readInt(1, cacheFile);
		int attributes = compression;
		if (opcode == 0) {
			attributes |= 0x80;
		}
		final MessageBuilder outBuffer = new MessageBuilder();
		outBuffer.writeByte((byte) container);
		outBuffer.writeShort((short) file);
		outBuffer.writeByte((byte) attributes);
		outBuffer.writeInt(length);
		final int realLength = compression != 0 ? length + 4 : length;
		for (int offset = 5; offset < (realLength + 5); offset++) {
			if ((outBuffer.position() % 512) == 0) {
				outBuffer.writeByte((byte) 255);
			}
			outBuffer.writeByte(cacheFile[offset]);
		}
		return outBuffer.toMessage();
	}

	public static byte[] getData(final int cache, int main, final int child)
			throws IOException {
		if (!loadArchive(cache, main)) {
			throw new IOException("Data not available");
		}
		if (archiveFiles[cache].length < main) {
			main = archiveFiles[cache].length;
		}
		return (byte[]) archiveFiles[cache][main][child];
	}

	public static int containerCount(final int cache) {
		return archiveFiles[cache].length;
	}

	public static int cacheCFCount(final int cache) {
		final int lastcontainer = containerCount(cache) - 1;
		return (256 * lastcontainer)
				+ getRealContainerChildCount(cache, lastcontainer);
	}

	public static int cacheCFCount2(final int cache) {
		final int lastcontainer = containerCount(cache) - 1;
		return (128 * lastcontainer)
				+ getRealContainerChildCount(cache, lastcontainer);
	}

	public static int getRealContainerChildCount(final int cache,
			final int lastcontainer) {
		return informationTables[cache].getEntry_real_sub_count()[lastcontainer];
	}

	public static int getContainerChildCount(final int cache,
			final int lastcontainer) {
		return informationTables[cache].getArchiveCount()[lastcontainer];
	}

}