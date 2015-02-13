package org.codeusa.cache.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RSRandomAccessFile extends RandomAccessFile {

	public RSRandomAccessFile(final String name, final String mode)
			throws FileNotFoundException {
		super(name, mode);
	}

	public RSRandomAccessFile(final File file, final String mode)
			throws FileNotFoundException {
		super(file, mode);
	}

	public int read24BitInt() throws IOException {
		int i = readByte() << 16;
		i += readByte() << 8;
		return i + readByte();
	}

	public void write24BitInt(final int i) throws IOException {
		writeByte(i >> 16);
		writeByte(i >> 8);
		writeByte(i);
	}
}