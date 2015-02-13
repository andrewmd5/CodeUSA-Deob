package org.codeusa.cache;

import java.io.IOException;

import org.codeusa.cache.bzip.BZ2Decompressor;
import org.codeusa.cache.bzip.GZIPDecompressor;
import org.codeusa.util.BufferUtils;

public class CacheContainer {

	private final byte[] bytes;
	private final int length;
	private final byte compression;
	private int decompressedLength;

	public CacheContainer(final byte[] bytes) throws IOException {
		this.bytes = bytes;
		compression = bytes[0];
		length = BufferUtils.readInt(1, bytes);
		if (compression != 0) {
			decompressedLength = BufferUtils.readInt(5, bytes);
		} else {
			decompressedLength = length;
		}
	}

	public byte[] decompress() throws Exception {
		final byte[] data = new byte[decompressedLength];
		switch (compression) {
		case 0:
			System.arraycopy(bytes, 5, data, 0, decompressedLength);
			break;
		case 1:
			BZ2Decompressor.decompress(length, 9, bytes, data);
			break;
		default:
			GZIPDecompressor.decompress(length, 9, bytes, data);
			break;
		}
		return data;
	}

}