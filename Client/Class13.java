/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class Class13 {
	static IncomingOpcode aClass58_161 = new IncomingOpcode(15, -2);
	private Class207 aClass207_162;
	private final Class79 aClass79_163 = new Class79(64);
	static OutgoingOpcode aClass171_164 = new OutgoingOpcode(58, 8);

	static final Class48 method217(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (i != 5) {
				aClass171_164 = null;
			}
			final long l = (i_1_ * 76724863L ^ (986053L * i_0_
					^ (67481L * i_4_ ^ 97549L * i_5_ ^ i_3_ * 475427L) ^ i_2_ * 32147369L));
			Class48 class48 = (Class48) Class123.aClass79_1010.method802(-122,
					l);
			if (class48 != null) {
				return class48;
			}
			class48 = Class98_Sub37.aHa4185.method1803(i_4_, i_5_, i_3_, i_0_,
					i_2_, i_1_);
			Class123.aClass79_1010.method805(l, class48, (byte) -80);
			return class48;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("at.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	final void method218(final boolean bool) {
		try {
			synchronized (aClass79_163) {
				aClass79_163.method806((byte) 96);
			}
			if (bool != true) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "at.H(" + bool
					+ ')');
		}
	}

	public static void method219(final boolean bool) {
		try {
			if (bool == true) {
				aClass171_164 = null;
				aClass58_161 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "at.D(" + bool
					+ ')');
		}
	}

	final Class220 method220(final int i, final int i_6_) {
		try {
			if (i_6_ != -11180) {
				aClass207_162 = null;
			}
			Class220 class220;
			synchronized (aClass79_163) {
				class220 = (Class220) aClass79_163.method802(-127, i);
			}
			if (class220 != null) {
				return class220;
			}
			byte[] is;
			synchronized (aClass207_162) {
				is = aClass207_162.method2745(i, 35, false);
			}
			class220 = new Class220();
			if (is != null) {
				class220.method2816((byte) -113, new ByteBuffer(is));
			}
			class220.method2819(-9639);
			synchronized (aClass79_163) {
				aClass79_163.method805(i, class220, (byte) -80);
			}
			return class220;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "at.E(" + i + ','
					+ i_6_ + ')');
		}
	}

	final void method221(final byte i) {
		try {
			if (i != 68) {
				method219(false);
			}
			synchronized (aClass79_163) {
				aClass79_163.method794(93);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "at.G(" + i + ')');
		}
	}

	static final String method222(Throwable throwable, final byte i)
			throws IOException {
		try {
			String string;
			if (!(throwable instanceof RuntimeException_Sub1)) {
				string = "";
			} else {
				final RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
				throwable = (runtimeexception_sub1.aThrowable3199);
				string = (runtimeexception_sub1.aString3202) + " | ";
			}
			final StringWriter stringwriter = new StringWriter();
			final PrintWriter printwriter = new PrintWriter(stringwriter);
			if (i != -24) {
				aClass58_161 = null;
			}
			throwable.printStackTrace(printwriter);
			printwriter.close();
			final String string_7_ = stringwriter.toString();
			final BufferedReader bufferedreader = new BufferedReader(
					new StringReader(string_7_));
			final String string_8_ = bufferedreader.readLine();
			for (;;) {
				final String string_9_ = bufferedreader.readLine();
				if (string_9_ == null) {
					break;
				}
				final int i_10_ = string_9_.indexOf('(');
				final int i_11_ = string_9_.indexOf(')', i_10_ - -1);
				String string_12_;
				if (i_10_ != -1) {
					string_12_ = string_9_.substring(0, i_10_);
				} else {
					string_12_ = string_9_;
				}
				string_12_ = string_12_.trim();
				string_12_ = string_12_.substring(1 + string_12_
						.lastIndexOf(' '));
				string_12_ = string_12_.substring(1 + string_12_
						.lastIndexOf('\t'));
				string += string_12_;
				if (i_10_ != -1 && i_11_ != -1) {
					final int i_13_ = string_9_.indexOf(".java:", i_10_);
					if ((i_13_ ^ 0xffffffff) <= -1) {
						string += string_9_.substring(5 + i_13_, i_11_);
					}
				}
				string += ' ';
			}
			string += "| " + string_8_;
			return string;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method223(final int i, final int i_14_) {
		try {
			synchronized (aClass79_163) {
				aClass79_163.method800((byte) 62, i_14_);
			}
			if (i != 32) {
				aClass171_164 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "at.C(" + i + ','
					+ i_14_ + ')');
		}
	}

	static final boolean method224(final int i, final int i_15_, final int i_16_) {
		try {
			if (i != 8) {
				aClass171_164 = null;
			}
			if (!Class349.method3842(i_16_, i_15_, -18021)
					&& !Class98_Sub27.method1292(i_16_, (byte) 117, i_15_)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("at.F(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class13(final Class279 class279, final int i, final Class207 class207) {
		do {
			try {
				aClass207_162 = class207;
				if (aClass207_162 == null) {
					break;
				}
				aClass207_162.method2761(0, 35);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("at.<init>("
						+ (class279 != null ? "{...}" : "null") + ',' + i + ','
						+ (class207 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
