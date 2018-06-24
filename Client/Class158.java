/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

import com.ms.com.ComFailException;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;

public final class Class158 implements Interface11 {
	private int anInt3361;
	private final DSCursors[] aDSCursorsArray3362 = new DSCursors[2];
	private int anInt3363;
	private final int[] anIntArray3364;
	private WaveFormatEx aWaveFormatEx3365;
	private final int[] anIntArray3366 = new int[2];
	private int[] anIntArray3367;
	private DirectSound aDirectSound3368;
	private int anInt3369;
	private final DSBufferDesc[] aDSBufferDescArray3370;
	private final DirectSoundBuffer[] aDirectSoundBufferArray3371 = new DirectSoundBuffer[2];
	private final boolean[] aBooleanArray3372 = new boolean[2];
	private final byte[][] aByteArrayArray3373 = new byte[2][];

	@Override
	public final void method32(final int i, final boolean bool, final int i_0_)
			throws Exception {
		try {
			if ((anInt3363 ^ 0xffffffff) == -1
					|| aDirectSoundBufferArray3371[i_0_] != null) {
				throw new IllegalStateException();
			}
			final int i_1_ = 65536 * anInt3369;
			if (aByteArrayArray3373[i_0_] == null
					|| i_1_ != aByteArrayArray3373[i_0_].length) {
				aByteArrayArray3373[i_0_] = new byte[i_1_];
				aDSBufferDescArray3370[i_0_].bufferBytes = i_1_;
			}
			aDirectSoundBufferArray3371[i_0_] = aDirectSound3368
					.createSoundBuffer((aDSBufferDescArray3370[i_0_]),
							aWaveFormatEx3365);
			aBooleanArray3372[i_0_] = bool;
			anIntArray3364[i_0_] = 0;
			anIntArray3366[i_0_] = i;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void method31(final int i, final int i_2_) {
		do {
			try {
				if (i < 84) {
					method34((byte) -82, -40);
				}
				if (aDirectSoundBufferArray3371[i_2_] == null) {
					break;
				}
				try {
					aDirectSoundBufferArray3371[i_2_].stop();
				} catch (final com.ms.com.ComFailException comfailexception) {
					/* empty */
				}
				aDirectSoundBufferArray3371[i_2_] = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	public final int method34(final byte i, final int i_3_) {
		try {
			if (!aBooleanArray3372[i_3_]) {
				return 0;
			}
			aDirectSoundBufferArray3371[i_3_]
					.getCurrentPosition(aDSCursorsArray3362[i_3_]);
			final int i_4_ = aDSCursorsArray3362[i_3_].write / anInt3369;
			int i_6_ = anIntArray3364[i_3_] - i_4_ & 0xffff;
			if (anIntArray3366[i_3_] < i_6_) {
				for (int i_7_ = -anIntArray3364[i_3_] + i_4_ & 0xffff; i_7_ > 0; i_7_ -= 256) {
					method33(i_3_, anIntArray3367);
				}
				i_6_ = -i_4_ + anIntArray3364[i_3_] & 0xffff;
			}
			return i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void method33(final int i, final int[] is) {
		final int i_8_ = is.length;
		if (i_8_ != 256 * anInt3361) {
			throw new IllegalArgumentException();
		}
		final int i_9_ = anIntArray3364[i] * anInt3369;
		for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
			int i_11_ = is[i_10_];
			if ((i_11_ + 8388608 & ~0xffffff) != 0) {
				i_11_ = 0x7fffff ^ i_11_ >> 31;
			}
			aByteArrayArray3373[i][i_9_ + i_10_ * 2] = (byte) (i_11_ >> 8);
			aByteArrayArray3373[i][i_9_ + i_10_ * 2 + 1] = (byte) (i_11_ >> 16);
		}
		aDirectSoundBufferArray3371[i].writeBuffer(i_9_, i_8_ * 2,
				aByteArrayArray3373[i], 0);
		anIntArray3364[i] = anIntArray3364[i] + i_8_ / anInt3361 & 0xffff;
		if (!aBooleanArray3372[i]) {
			aDirectSoundBufferArray3371[i].play(1);
			aBooleanArray3372[i] = true;
		}
	}

	@Override
	public final void method29(final boolean bool, final int i,
			final Component component, final int i_12_) throws Exception {
		try {
			if (anInt3363 == 0) {
				if (i_12_ < 8000 || i_12_ > 48000) {
					throw new IllegalArgumentException();
				}
				anInt3369 = bool ? 4 : 2;
				anInt3361 = !bool ? 1 : 2;
				anIntArray3367 = new int[anInt3361 * 256];
				aDirectSound3368.initialize(null);
				aDirectSound3368.setCooperativeLevel(component, 2);
				for (int i_13_ = 0; i_13_ < 2; i_13_++) {
					aDSBufferDescArray3370[i_13_].flags = 16384;
				}
				aWaveFormatEx3365.bitsPerSample = 16;
				aWaveFormatEx3365.channels = anInt3361;
				aWaveFormatEx3365.formatTag = 1;
				aWaveFormatEx3365.avgBytesPerSec = i_12_ * anInt3369;
				aWaveFormatEx3365.blockAlign = anInt3369;
				aWaveFormatEx3365.samplesPerSec = i_12_;
				anInt3363 = i_12_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void method30(final int i, final byte i_15_) {
		do {
			try {
				try {
					aDirectSoundBufferArray3371[i].stop();
				} catch (final ComFailException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				aBooleanArray3372[i] = false;
				aDirectSoundBufferArray3371[i].setCurrentPosition(0);
				anIntArray3364[i] = 0;
				if (i_15_ < -117) {
					break;
				}
				aDirectSound3368 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	public Class158() throws Exception {
		aDSBufferDescArray3370 = new DSBufferDesc[2];
		anIntArray3364 = new int[2];
		try {
			aDirectSound3368 = new DirectSound();
			aWaveFormatEx3365 = new WaveFormatEx();
			for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
				aDSBufferDescArray3370[i] = new DSBufferDesc();
			}
			for (int i = 0; i < 2; i++) {
				aDSCursorsArray3362[i] = new DSCursors();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
