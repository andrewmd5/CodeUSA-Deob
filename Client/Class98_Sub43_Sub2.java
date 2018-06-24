/* Class98_Sub43_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class98_Sub43_Sub2 extends Class98_Sub43 {
	static OutgoingOpcode aClass171_5906 = new OutgoingOpcode(49, 4);
	static Class88 aClass88_5907;
	static Class196 aClass196_5908 = new Class196("LOCAL", "", "local", 4);
	static float aFloat5909;
	static int anInt5910;

	@Override
	final void method1487(final int i) {
		do {
			try {
				if (i == -1128) {
					break;
				}
				aClass171_5906 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ria.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class98_Sub43_Sub2(final OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	@Override
	final void method1482(final OggPacket oggpacket, final boolean bool) {
		do {
			try {
				if (bool == false) {
					break;
				}
				anInt5910 = 86;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("ria.J(" + (oggpacket != null ? "{...}" : "null")
								+ ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public static void method1494(final int i) {
		do {
			try {
				aClass88_5907 = null;
				aClass171_5906 = null;
				aClass196_5908 = null;
				if (i == 4) {
					break;
				}
				aClass196_5908 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ria.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
