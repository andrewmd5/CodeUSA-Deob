package org.codeusa.cache.bzip;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class BZ2Decompressor {

	public static void decompress(final int slen, final int off,
			final byte[] in, final byte[] out) throws IOException {
		final byte in2[] = new byte[slen];
		System.arraycopy(in, off, in2, 0, slen);
		final DataInputStream ins = new DataInputStream(new CBZip2InputStream(
				new ByteArrayInputStream(in2), 0));
		try {
			ins.readFully(out);
		} finally {
			ins.close();
		}
	}
}