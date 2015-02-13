package org.codeusa.cache.format;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;

public class MusicHints {

	private final static HashMap<Integer, String> musicHints = new HashMap<Integer, String>();
	private final static String PACKED_PATH = "data/musics/packedMusicHints.mh";
	private final static String UNPACKED_PATH = "data/musics/unpackedMusicHints.txt";

	public static final void init() {
		if (new File(PACKED_PATH).exists()) {
			loadPackedItemExamines();
		} else {
			loadUnpackedItemExamines();
		}
	}

	public static final String getHint(final int musicId) {
		final String hint = musicHints.get(musicId);
		if (hint == null) {
			return "somewhere.";
		}
		return hint;
	}

	private static void loadPackedItemExamines() {
		try {
			final RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
			final FileChannel channel = in.getChannel();
			final ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0,
					channel.size());
			while (buffer.hasRemaining()) {
				musicHints.put(buffer.getShort() & 0xffff,
						readAlexString(buffer));
			}
			channel.close();
			in.close();
		} catch (final Throwable e) {
			// Logger.handle(e);
		}
	}

	private static void loadUnpackedItemExamines() {
		// Logger.log("MusicHints", "Packing music hints...");
		try {
			final BufferedReader in = new BufferedReader(new FileReader(
					UNPACKED_PATH));
			final DataOutputStream out = new DataOutputStream(
					new FileOutputStream(PACKED_PATH));
			while (true) {
				final String line = in.readLine();
				if (line == null) {
					break;
				}
				if (line.startsWith("//")) {
					continue;
				}
				final String[] splitedLine = line.split(" - ", 2);
				if (splitedLine.length < 2) {
					throw new RuntimeException(
							"Invalid list for music hints line: " + line);
				}
				final int musicId = Integer.valueOf(splitedLine[0]);
				if (splitedLine[1].length() > 255) {
					continue;
				}
				out.writeShort(musicId);
				writeAlexString(out, splitedLine[1]);
				musicHints.put(musicId, splitedLine[1]);
			}
			in.close();
			out.flush();
			out.close();
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	public static String readAlexString(final ByteBuffer buffer) {
		final int count = buffer.get() & 0xff;
		final byte[] bytes = new byte[count];
		buffer.get(bytes, 0, count);
		return new String(bytes);
	}

	public static void writeAlexString(final DataOutputStream out,
			final String string) throws IOException {
		final byte[] bytes = string.getBytes();
		out.writeByte(bytes.length);
		out.write(bytes);
	}
}
