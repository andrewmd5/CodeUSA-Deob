/* Class268_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class268_Sub2 extends Class268 {
	private boolean aBoolean5162 = false;
	private byte[] aByteArray5163;
	private AudioFormat anAudioFormat5164;
	private int anInt5165;
	private SourceDataLine aSourceDataLine5166;
	static Class aClass5167;

	@Override
	final void method3259() throws LineUnavailableException {
		do {
			try {
				aSourceDataLine5166.flush();
				if (!aBoolean5162) {
					break;
				}
				aSourceDataLine5166.close();
				aSourceDataLine5166 = null;
				final DataLine.Info info = (new DataLine.Info(
						(aClass5167 == null ? (aClass5167 = method3264("javax.sound.sampled.SourceDataLine"))
								: aClass5167), anAudioFormat5164,
						anInt5165 << (!Class151_Sub7.aBoolean5007 ? 1 : 2)));
				aSourceDataLine5166 = (SourceDataLine) AudioSystem
						.getLine(info);
				aSourceDataLine5166.open();
				aSourceDataLine5166.start();
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final int method3258() {
		int i;
		try {
			i = anInt5165
					- (aSourceDataLine5166.available() >> (!Class151_Sub7.aBoolean5007 ? 1
							: 2));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	@Override
	final void method3257() {
		int i = 256;
		if (Class151_Sub7.aBoolean5007) {
			i <<= 1;
		}
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = anIntArray2005[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0) {
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			}
			aByteArray5163[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray5163[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine5166.write(aByteArray5163, 0, i << 1);
	}

	@Override
	final void method3253(final Component component) {
		try {
			final Mixer.Info[] infos = AudioSystem.getMixerInfo();
			if (infos != null) {
				final Mixer.Info[] infos_2_ = infos;
				for (int i = 0; i < infos_2_.length; i++) {
					final Mixer.Info info = infos_2_[i];
					if (null != info) {
						final String string = info.getName();
						if (null != string
								&& (string.toLowerCase().indexOf("soundmax") ^ 0xffffffff) <= -1) {
							aBoolean5162 = true;
						}
					}
				}
			}
			anAudioFormat5164 = new AudioFormat(Class64_Sub15.anInt3678, 16,
					!Class151_Sub7.aBoolean5007 ? 1 : 2, true, false);
			aByteArray5163 = new byte[256 << (Class151_Sub7.aBoolean5007 ? 2
					: 1)];
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method3250(final int i) throws LineUnavailableException {
		try {
			try {
				final DataLine.Info info = (new DataLine.Info(
						(aClass5167 == null ? (aClass5167 = method3264("javax.sound.sampled.SourceDataLine"))
								: aClass5167), anAudioFormat5164,
						i << (!Class151_Sub7.aBoolean5007 ? 1 : 2)));
				aSourceDataLine5166 = (SourceDataLine) AudioSystem
						.getLine(info);
				aSourceDataLine5166.open();
				aSourceDataLine5166.start();
				anInt5165 = i;
			} catch (final LineUnavailableException lineunavailableexception) {
				if ((Class98_Sub50.method1670((byte) 116, i) ^ 0xffffffff) != -2) {
					method3250(Class48.method453(423660257, i));
				} else {
					aSourceDataLine5166 = null;
					throw lineunavailableexception;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method3262() {
		try {
			if (null != aSourceDataLine5166) {
				aSourceDataLine5166.close();
				aSourceDataLine5166 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static Class method3264(final String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
		return var_class;
	}
}
