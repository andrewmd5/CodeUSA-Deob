package org.codeusa.cache.stream;

public class ByteInputStream {

	public byte[] buffer;
	public int pos;

	public ByteInputStream(final byte[] data) {
		buffer = data;
		pos = 0;
	}

	public int readSmart2() {
		int i = 0;
		int i_33_ = readSmart();
		while (i_33_ == 32767) {
			i_33_ = readSmart();
			i += 32767;
		}
		i += i_33_;
		return i;
	}

	public int readSmart() {
		final int i = buffer[pos] & 0xff;
		if (i >= 128) {
			return readUShort() - 32768;
		}
		return readUByte();
	}

	public int readUShort() {
		pos += 2;
		return ((buffer[pos - 2] & 0xff) << 8) | (buffer[pos - 1] & 0xff);
	}

	public int readByte() {
		return buffer[pos++];
	}

	public int readUByte() {
		return buffer[pos++] & 0xff;
	}
}