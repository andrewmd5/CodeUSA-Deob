package org.codeusa.cache.format;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.codeusa.cache.CacheManager;
import org.codeusa.cache.stream.RSByteBuffer;

public class BodyDefinition {

	/**
	 * The parts data.
	 */
	public int[] partsData;

	/**
	 * Something to do with weapon display.
	 */
	public int somethingWithWeaponDisplay;

	/**
	 * Contains weapon data.
	 */
	public int[] weaponData;

	/**
	 * Contains shield data.
	 */
	public int[] shieldData;

	/**
	 * Something to do with shield display.
	 */
	public int somethingWithShieldDisplay;

	/**
	 * Constructs a new {@code BodyData} {@code Object}.
	 */
	public BodyDefinition() {
		this.partsData = new int[0];
		this.somethingWithWeaponDisplay = -1;
		this.somethingWithShieldDisplay = -1;
	}

	/**
	 * Parses body data from the given buffer.
	 *
	 * @param buffer
	 *            The buffer.
	 */
	private void parse(final RSByteBuffer buffer) {
		for (;;) {
			byte opcode;
			try {
				opcode = (byte) buffer.readUnsignedByte();
			} catch (final IOException e) {
				e.printStackTrace();
				opcode = 0;
			}
			if (opcode == 0) {
				break;
			}
			this.parse(opcode, buffer);
		}
	}

	/**
	 * Parses the current opcode.
	 *
	 * @param opcode
	 *            The opcode.
	 * @param buffer
	 *            The buffer to parse from.
	 */
	private void parse(final byte opcode, final RSByteBuffer buffer) {
		try {
			if (opcode == 1) {
				final int length = buffer.readUnsignedByte();
				this.partsData = new int[length];
				for (int i = 0; i < this.partsData.length; i++) {
					this.partsData[i] = buffer.readUnsignedByte();
				}
			} else if (opcode == 3) {
				this.somethingWithShieldDisplay = buffer.readUnsignedByte();
			} else if (opcode == 4) {
				this.somethingWithWeaponDisplay = buffer.readUnsignedByte();
			} else if (opcode == 5) {
				final int length = buffer.readUnsignedByte();
				this.shieldData = new int[length];
				for (int i = 0; i < this.shieldData.length; i++) {
					this.shieldData[i] = buffer.readUnsignedByte();
				}
			} else if (opcode == 6) {
				final int length = buffer.readUnsignedByte();
				this.weaponData = new int[length];
				for (int i = 0; i < this.weaponData.length; i++) {
					this.weaponData[i] = buffer.readUnsignedByte();
				}
			} else {
				throw new Exception("Unknown opcode:" + opcode);
			}
		} catch (final Throwable t) {
			t.printStackTrace();
		}
	}

	/**
	 * Reads body data from the cache.
	 *
	 * @return The body data object, or null if it failed.
	 */
	public static BodyDefinition read() {
		final BodyDefinition data = new BodyDefinition();
		try {
			final byte[] buff = CacheManager.getData(28, 6, 0);
			final RSByteBuffer reader = new RSByteBuffer(
					new ByteArrayInputStream(buff));
			data.parse(reader);
			reader.close();
			return data;
		} catch (final Exception exception) {
			/**
			 * There shouldn't be any fails.
			 */
			exception.printStackTrace();
			return null;
		}
	}
}