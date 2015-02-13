package org.codeusa.cache.stream;

import java.io.ByteArrayInputStream;

public class RSByteArrayInputStream extends ByteArrayInputStream {

	public RSByteArrayInputStream(final byte[] buf) {
		super(buf);
	}

	public RSByteArrayInputStream(final byte[] buf, final int offset,
			final int length) {
		super(buf, offset, length);
	}

	public void seek(final int i) {
		pos = i;
	}

	public int position() {
		return pos;
	}

	public byte[] getBytes() {
		return this.buf;
	}
}