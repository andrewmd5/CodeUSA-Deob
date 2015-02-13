package org.codeusa.cache.bzip;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPDecompressor {

	public static void decompress(final int slen, final int off,
			final byte[] in, final byte[] out) throws IOException {
		final byte in2[] = new byte[slen];
		System.arraycopy(in, off, in2, 0, slen);
		final DataInputStream ins = new DataInputStream(new GZIPInputStream(
				new ByteArrayInputStream(in2)));
		try {
			ins.readFully(out);
		} finally {
			ins.close();
		}
	}
}