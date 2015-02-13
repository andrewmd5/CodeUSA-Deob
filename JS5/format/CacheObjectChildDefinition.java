package org.codeusa.cache.format;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;

public class CacheObjectChildDefinition {

	public int anInt3737;
	public int anInt3742;
	public int anInt3743;

	public static final Map<Integer, CacheObjectChildDefinition> CHILDS = new HashMap<Integer, CacheObjectChildDefinition>();

	private final void decode(final ByteBuffer buffer, final int i) {
		if (i == 1) {
			anInt3737 = buffer.getShort() & 0xFFFF;
			anInt3743 = buffer.get() & 0xFF;
			anInt3742 = buffer.get() & 0xFF;
		}
	}

	public void decode(final ByteBuffer buffer) {
		for (;;) {
			final int i = buffer.get() & 0xFF;
			if (i == 0) {
				break;
			}
			decode(buffer, i);
		}
	}

	public static final CacheObjectChildDefinition valueOf(final int i)
			throws IOException {
		CacheObjectChildDefinition child = CHILDS.get(i);
		if (child != null) {
			return child;
		}
		final byte[] data = CacheManager.getData(
				CacheConstants.OBJECTDEF_IDX_ID, i & 0x3ff, i >>> 10);
		child = new CacheObjectChildDefinition();
		if (data != null) {
			child.decode(ByteBuffer.wrap(data));
		}
		CHILDS.put(i, child);
		return child;
	}

}
