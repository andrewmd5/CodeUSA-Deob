/* Class98_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class98_Sub40 extends Class98 {
	static Class164 aClass164_4190 = new Class164(3);
	short aShort4191;
	static Class88 aClass88_4192;
	static OutgoingOpcode aClass171_4193 = new OutgoingOpcode(12, 0);
	static int anInt4194;
	static Class98_Sub46_Sub10 aClass98_Sub46_Sub10_4195;
	static int anInt4196;
	static int anInt4197;
	static Class207 aClass207_4198;

	static final Class52 method1469(int i, ByteBuffer class98_sub22) {
		try {
			int i_0_ = class98_sub22.readUnsignedByte((byte) -105);
			Class63 class63 = (Class98_Sub46_Sub13_Sub1.method1595(i + 123)[class98_sub22
					.readUnsignedByte((byte) 79)]);
			Class110 class110 = (Class331.method3723(256)[class98_sub22
					.readUnsignedByte((byte) -127)]);
			int i_1_ = class98_sub22.readUShort(false);
			int i_2_ = class98_sub22.readUShort(false);
			int i_3_ = class98_sub22.readUnsignedShort((byte) 127);
			int i_4_ = class98_sub22.readUnsignedShort((byte) 127);
			int i_5_ = class98_sub22.readInt(-2);
			int i_6_ = class98_sub22.readInt(-2);
			int i_7_ = class98_sub22.readInt(-2);
			boolean bool = (class98_sub22.readUnsignedByte((byte) 96) ^ 0xffffffff) == i;
			return new Class52(i_0_, class63, class110, i_1_, i_2_, i_3_, i_4_,
					i_5_, i_6_, i_7_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qd.D(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub40() {
		/* empty */
	}

	static final void method1470(int i) {
		try {
			Class3.anImage74 = null;
			if (i != 3796)
				aClass164_4190 = null;
			Class98_Sub10_Sub7.aFont5576 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qd.B(" + i + ')');
		}
	}

	static final String method1471(int i, long l) {
		try {
			Class149.aCalendar1200.setTime(new Date(l));
			int i_8_ = Class149.aCalendar1200.get(7);
			if (i != 5090)
				method1473(null, -92, null, 85, 126, null);
			int i_9_ = Class149.aCalendar1200.get(5);
			int i_10_ = Class149.aCalendar1200.get(2);
			int i_11_ = Class149.aCalendar1200.get(1);
			int i_12_ = Class149.aCalendar1200.get(11);
			int i_13_ = Class149.aCalendar1200.get(12);
			int i_14_ = Class149.aCalendar1200.get(13);
			return (Class32.aStringArray304[-1 + i_8_] + ", " + i_9_ / 10
					+ i_9_ % 10 + "-"
					+ Class98_Sub10_Sub4.aStringArray5550[i_10_] + "-" + i_11_
					+ " " + i_12_ / 10 + i_12_ % 10 + ":" + i_13_ / 10 + i_13_
					% 10 + ":" + i_14_ / 10 + i_14_ % 10 + " GMT");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qd.A(" + i + ','
					+ l + ')');
		}
	}

	public static void method1472(int i) {
		try {
			aClass164_4190 = null;
			aClass98_Sub46_Sub10_4195 = null;
			aClass88_4192 = null;
			if (i != -1)
				aClass164_4190 = null;
			aClass171_4193 = null;
			aClass207_4198 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qd.E(" + i + ')');
		}
	}

	Class98_Sub40(short i) {
		try {
			((Class98_Sub40) this).aShort4191 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qd.<init>(" + i
					+ ')');
		}
	}

	static final boolean method1473(Class24 class24, int i,
			Class98_Sub47 class98_sub47, int i_15_, int i_16_, ha var_ha) {
		try {
			int i_17_ = 2147483647;
			int i_18_ = -2147483648;
			int i_19_ = 2147483647;
			int i_20_ = -2147483648;
			if (((Class24) class24).anIntArray265 != null) {
				i_17_ = (((-Class278.anInt2086 + Class278.anInt2093)
						* (((Class24) class24).anInt244
								+ ((Class98_Sub47) class98_sub47).anInt4272 - Class278.anInt2091) / (-Class278.anInt2091 + Class278.anInt2074)) + Class278.anInt2086);
				i_20_ = (Class278.anInt2094 + -((((Class24) class24).anInt248 + (((Class98_Sub47) class98_sub47).anInt4267 - Class278.anInt2090))
						* (Class278.anInt2094 - Class278.anInt2077) / (Class278.anInt2083 + -Class278.anInt2090)));
				i_18_ = ((((Class98_Sub47) class98_sub47).anInt4272 + (((Class24) class24).anInt247 + -Class278.anInt2091))
						* (Class278.anInt2093 + -Class278.anInt2086) / (Class278.anInt2074 + -Class278.anInt2091))
						+ Class278.anInt2086;
				i_19_ = (-((((Class24) class24).anInt262 + (((Class98_Sub47) class98_sub47).anInt4267 - Class278.anInt2090))
						* (Class278.anInt2094 - Class278.anInt2077) / (-Class278.anInt2090 + Class278.anInt2083)) + Class278.anInt2094);
			}
			Class332 class332 = null;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = 0;
			if (((Class24) class24).anInt245 != -1) {
				if (((Class98_Sub47) class98_sub47).aBoolean4275
						&& ((Class24) class24).anInt225 != -1)
					class332 = class24.method287((byte) 92, var_ha, true);
				else
					class332 = class24.method287((byte) 92, var_ha, false);
				if (class332 != null) {
					i_21_ = (((Class98_Sub47) class98_sub47).anInt4266 - (1 + class332
							.method3737() >> -1309311967));
					if (i_21_ < i_17_)
						i_17_ = i_21_;
					i_22_ = (((Class98_Sub47) class98_sub47).anInt4266 - -(class332
							.method3737() - -1 >> -1382798303));
					if (i_18_ < i_22_)
						i_18_ = i_22_;
					i_23_ = (((Class98_Sub47) class98_sub47).anInt4271 + -(1 + class332
							.method3749() >> 682299937));
					if ((i_19_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff))
						i_19_ = i_23_;
					i_24_ = (((Class98_Sub47) class98_sub47).anInt4271 - -(1 + class332
							.method3749() >> -261887423));
					if ((i_24_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
						i_20_ = i_24_;
				}
			}
			Class326 class326 = null;
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			if (i_16_ != 15924)
				method1469(-104, null);
			int i_28_ = 0;
			int i_29_ = 0;
			int i_30_ = 0;
			int i_31_ = 0;
			int i_32_ = 0;
			if (((Class24) class24).aString263 != null) {
				class326 = Class105.method1718(((Class24) class24).anInt264,
						5466);
				if (class326 != null) {
					i_25_ = (Class98_Sub46_Sub2_Sub2.aClass197_6296.method2675(
							((Class24) class24).aString263,
							SurfaceSkin.aStringArray335, null, null, -1));
					i_26_ = (((-Class278.anInt2086 + Class278.anInt2093)
							* ((Class24) class24).anInt235 / (-Class278.anInt2091 + Class278.anInt2074)) + ((Class98_Sub47) class98_sub47).anInt4266);
					i_27_ = (((Class98_Sub47) class98_sub47).anInt4271 + -(((Class24) class24).anInt252
							* (-Class278.anInt2077 + Class278.anInt2094) / (-Class278.anInt2090 + Class278.anInt2083)));
					if (class332 != null)
						i_27_ -= ((class332.method3749() >> 1059165249) + class326
								.method3705() * i_25_);
					else
						i_27_ -= class326.method3704() * i_25_ / 2;
					for (int i_33_ = 0; i_25_ > i_33_; i_33_++) {
						String string = SurfaceSkin.aStringArray335[i_33_];
						if ((i_33_ ^ 0xffffffff) > (i_25_ + -1 ^ 0xffffffff))
							string = string.substring(0, -4 + string.length());
						int i_34_ = class326.method3701(string);
						if (i_28_ < i_34_)
							i_28_ = i_34_;
					}
					i_29_ = i_26_ + (-(i_28_ / 2) + i_15_);
					if ((i_29_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
						i_17_ = i_29_;
					i_30_ = i_15_ + (i_28_ / 2 + i_26_);
					i_31_ = i + i_27_;
					if ((i_18_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff))
						i_18_ = i_30_;
					i_32_ = i + (i_25_ * class326.method3705() + i_27_);
					if ((i_19_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff))
						i_19_ = i_31_;
					if ((i_32_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
						i_20_ = i_32_;
				}
			}
			if (Class278.anInt2086 > i_18_ || i_17_ > Class278.anInt2093
					|| Class278.anInt2077 > i_20_ || i_19_ > Class278.anInt2094)
				return true;
			Class278.method3314(var_ha, class98_sub47, class24);
			if (class332 != null) {
				if ((Class64_Sub25.anInt3711 ^ 0xffffffff) < -1
						&& (((Class98_Sub5_Sub2.anInt5536 ^ 0xffffffff) != 0 && (((Class98_Sub47) class98_sub47).anInt4268 == Class98_Sub5_Sub2.anInt5536)) || ((Class256.anInt1945 ^ 0xffffffff) != 0 && ((((Class24) class24).anInt246 ^ 0xffffffff) == (Class256.anInt1945 ^ 0xffffffff))))) {
					int i_35_;
					if (Class287.anInt2186 <= 50)
						i_35_ = Class287.anInt2186 * 2;
					else
						i_35_ = 200 + -(Class287.anInt2186 * 2);
					int i_36_ = 0xffff00 | i_35_ << -702181928;
					var_ha.method1757(class332.method3734() / 2 + 7,
							(((Class98_Sub47) class98_sub47).anInt4271), i_36_,
							85, (((Class98_Sub47) class98_sub47).anInt4266));
					var_ha.method1757(class332.method3734() / 2 - -5,
							(((Class98_Sub47) class98_sub47).anInt4271), i_36_,
							117, (((Class98_Sub47) class98_sub47).anInt4266));
					var_ha.method1757(class332.method3734() / 2 + 3,
							(((Class98_Sub47) class98_sub47).anInt4271), i_36_,
							92, (((Class98_Sub47) class98_sub47).anInt4266));
					var_ha.method1757(class332.method3734() / 2 - -1,
							(((Class98_Sub47) class98_sub47).anInt4271), i_36_,
							37, (((Class98_Sub47) class98_sub47).anInt4266));
					var_ha.method1757(class332.method3734() / 2,
							(((Class98_Sub47) class98_sub47).anInt4271), i_36_,
							95, (((Class98_Sub47) class98_sub47).anInt4266));
				}
				class332.method3735(
						(((Class98_Sub47) class98_sub47).anInt4266 - (class332
								.method3737() >> 160193697)),
						(((Class98_Sub47) class98_sub47).anInt4271 - (class332
								.method3749() >> -277635711)));
			}
			if (((Class24) class24).aString263 != null && class326 != null)
				Class126.method2217((byte) 12, class98_sub47, i_28_, var_ha,
						class326, i_27_, class24, i_25_, i_26_);
			if (((Class24) class24).anInt245 != -1
					|| ((Class24) class24).aString263 != null) {
				Class98_Sub23 class98_sub23 = new Class98_Sub23(class98_sub47);
				((Class98_Sub23) class98_sub23).anInt4000 = i_24_;
				((Class98_Sub23) class98_sub23).anInt4005 = i_31_;
				((Class98_Sub23) class98_sub23).anInt3999 = i_23_;
				((Class98_Sub23) class98_sub23).anInt4004 = i_32_;
				((Class98_Sub23) class98_sub23).anInt4003 = i_29_;
				((Class98_Sub23) class98_sub23).anInt4002 = i_30_;
				((Class98_Sub23) class98_sub23).anInt3996 = i_21_;
				((Class98_Sub23) class98_sub23).anInt4006 = i_22_;
				Class8.aClass148_110.method2419(class98_sub23, i_16_ ^ ~0x6f9a);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("qd.C(" + (class24 != null ? "{...}" : "null") + ',' + i
							+ ',' + (class98_sub47 != null ? "{...}" : "null")
							+ ',' + i_15_ + ',' + i_16_ + ','
							+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}
}
