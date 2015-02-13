/* Class93_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class93_Sub3 extends Class93 {
	static IncomingOpcode aClass58_5493;
	static String aString5494 = null;
	int anInt5495;
	int anInt5496;

	public static void method912(int i) {
		do {
			try {
				aString5494 = null;
				aClass58_5493 = null;
				if (i == 58)
					break;
				method912(108);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uu.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final long method913(int i) {
		try {
			if (i != 58)
				aClass58_5493 = null;
			return OutputStream_Sub1.aClass240_36.method2924((byte) 53);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uu.B(" + i + ')');
		}
	}

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				aClass58_5493 = null;
			return Class47.aClass113_399;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uu.A(" + i + ')');
		}
	}

	Class93_Sub3(Class63 class63, Class110 class110, int i, int i_0_, int i_1_,
			int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(class63, class110, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		try {
			((Class93_Sub3) this).anInt5495 = i_7_;
			((Class93_Sub3) this).anInt5496 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uu.<init>("
					+ (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static {
		aClass58_5493 = new IncomingOpcode(58, -1);
	}
}
