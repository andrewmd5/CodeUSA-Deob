/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
//render
final class Class62 {
	int anInt483;
	int anInt484;
	long aLong485;
	static Class164 aClass164_486 = new Class164(4);
	static Class264 aClass264_487;
	String aString488;
	String aString489;
	static int anInt490 = 0;

	public static void method543(final int i) {
		do {
			try {
				aClass164_486 = null;
				aClass264_487 = null;
				if (i == 0) {
					break;
				}
				aClass264_487 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eca.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method544(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_, final int i_9_,
			final int i_10_) {
		do {
			try {
				if (Class85.method837(i_1_, 48)) {
					do {
						if (Class64_Sub13.aClass293ArrayArray3674[i_1_] == null) {
							client.method104(
									(Class159.aClass293ArrayArray1252[i_1_]),
									-1, i_10_, i_0_, i_2_, i_4_, i_5_, i_9_,
									i_6_, i_7_, i, i_8_);
							if (!client.aBoolean3553) {
								break;
							}
						}
						client.method104(
								(Class64_Sub13.aClass293ArrayArray3674[i_1_]),
								-1, i_10_, i_0_, i_2_, i_4_, i_5_, i_9_, i_6_,
								i_7_, i, i_8_);
					} while (false);
					if (i_3_ == 0) {
						break;
					}
					method543(-60);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("eca.B(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
						+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	Class62(final int i, final String string, final int i_11_,
			final String string_12_, final long l) {
		try {
			aString488 = string_12_;
			aString489 = string;
			anInt484 = i;
			aLong485 = l;
			anInt483 = i_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("eca.<init>(" + i + ','
							+ (string != null ? "{...}" : "null") + ',' + i_11_
							+ ',' + (string_12_ != null ? "{...}" : "null")
							+ ',' + l + ')'));
		}
	}
}
