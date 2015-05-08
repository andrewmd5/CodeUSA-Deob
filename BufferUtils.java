package org.codeusa.util;

import java.nio.ByteBuffer;

import org.jboss.netty.buffer.ChannelBuffer;


public class BufferUtils {

	private static final char[] CHARACTERS = { '\u20ac', '\0', '\u201a',
			'\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6',
			'\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0',
			'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013',
			'\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0',
			'\u017e', '\u0178' };

	public static void writeRS2String(ChannelBuffer buffer, String string) {
		buffer.writeBytes(string.getBytes());
		buffer.writeByte((byte) 0);
	}

	public static void writeRS2String(ByteBuffer buffer, String string) {
		buffer.put(string.getBytes());
		buffer.put((byte) 0);
	}

	public static String readRS2String(ChannelBuffer buffer) {
		final StringBuilder sb = new StringBuilder();
		byte b;
		while (buffer.readable() && (b = buffer.readByte()) != 0) {
			sb.append((char) b);
		}
		return sb.toString();
	}

	public static String readRS2String(ByteBuffer buffer) {
		final StringBuilder sb = new StringBuilder();
		byte b;
		while (buffer.remaining() > 0 && (b = buffer.get()) != 0) {
			sb.append((char) b);
		}
		return sb.toString();
	}

	public static int readSmart(ByteBuffer buf) {
		final int peek = buf.get(buf.position()) & 0xFF;
		if (peek < 128) {
			return buf.get();
		} else {
			return (buf.getShort() & 0xFFFF) - 32768;
		}
	}

	public static int readSmart(ChannelBuffer buf) {
		final int peek = buf.getByte(buf.readerIndex()) & 0xFF;
		if (peek < 128) {
			return buf.readByte();
		} else {
			return (buf.readShort() & 0xFFFF) - 32768;
		}
	}

	public static int getMediumInt(ByteBuffer buffer) {
		return (buffer.get() & 0xFF) << 16 | (buffer.get() & 0xFF) << 8
				| buffer.get() & 0xFF;
	}

	public static int readSmart2(ByteBuffer buffer) {
		int i_26_ = 0;
		int i_27_;
		for (i_27_ = readSmart(buffer); i_27_ == 32767; i_27_ = readSmart(buffer)) {
			i_26_ += 32767;
		}
		i_26_ += i_27_;
		return i_26_;
	}

	public static void writeInt(int val, int index, byte[] buffer) {
		buffer[index++] = (byte) (val >> 24);
		buffer[index++] = (byte) (val >> 16);
		buffer[index++] = (byte) (val >> 8);
		buffer[index++] = (byte) val;
	}

	public static void writeSmart(ChannelBuffer buffer, int val) {
		if (val >= 128) {
			buffer.writeShort(val + 32768);
		} else {
			buffer.writeByte((byte) val);
		}
	}

	public static int readInt(int index, byte[] buffer) {
		return (buffer[index++] & 0xff) << 24 | (buffer[index++] & 0xff) << 16
				| (buffer[index++] & 0xff) << 8 | buffer[index++] & 0xff;
	}

	public static char getCPCharacter(ByteBuffer buffer) {
		int read = buffer.get() & 0xff;
		if (read == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x"
					+ Integer.toString(read, 16) + " provided");
		}
		if (read >= 128 && read < 160) {
			char cpChar = CHARACTERS[read - 128];
			if (cpChar == '\0') {
				cpChar = '?';
			}
			read = cpChar;
		}
		return (char) read;
	}


	public static String getJagexString(ByteBuffer buffer) {
		final StringBuilder sb = new StringBuilder();
		int b;
		buffer.get();
		while (buffer.remaining() > 0 && (b = buffer.get() & 0xFF) != 0) {
			if (b >= 128 && b < 160) {
				int roar = CHARACTERS[b - 128];
				if (roar == 0) {
					roar = 63;
				}
				b = roar;
			}
			sb.append((char) b);
		}
		return sb.toString();
	}

}
