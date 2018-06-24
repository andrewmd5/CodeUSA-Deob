/* Class98_Sub46_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub8 extends Class98_Sub46 {
	boolean aBoolean5983;
	boolean aBoolean5984;
	String aString5985;
	int anInt5986;
	long aLong5987;
	int anInt5988;
	boolean aBoolean5989;
	int anInt5990;
	long aLong5991;
	String aString5992;
	int anInt5993;
	String aString5994;
	int anInt5995;
	static IncomingOpcode aClass58_5996 = new IncomingOpcode(30, -1);

	public static void method1552(final boolean bool) {
		do {
			try {
				aClass58_5996 = null;
				if (bool == true) {
					break;
				}
				aClass58_5996 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "em.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class98_Sub46_Sub8(final String string, final String string_0_,
			final int i, final int i_1_, final int i_2_, final long l,
			final int i_3_, final int i_4_, final boolean bool,
			final boolean bool_5_, final long l_6_, final boolean bool_7_) {
		try {
			aLong5991 = l_6_;
			anInt5988 = i_2_;
			anInt5986 = i;
			anInt5993 = i_4_;
			aString5992 = string_0_;
			anInt5990 = i_1_;
			aBoolean5983 = bool_5_;
			aBoolean5984 = bool;
			aBoolean5989 = bool_7_;
			aLong5987 = l;
			anInt5995 = i_3_;
			aString5994 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("em.<init>(" + (string != null ? "{...}" : "null") + ','
							+ (string_0_ != null ? "{...}" : "null") + ',' + i
							+ ',' + i_1_ + ',' + i_2_ + ',' + l + ',' + i_3_
							+ ',' + i_4_ + ',' + bool + ',' + bool_5_ + ','
							+ l_6_ + ',' + bool_7_ + ')'));
		}
	}
}
