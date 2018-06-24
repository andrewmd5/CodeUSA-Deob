/* Class98_Sub10_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub16 extends Class98_Sub10 {
	static Class29 aClass29_5620;
	static Class85 aClass85_5621 = new Class85(6, 3);

	public Class98_Sub10_Sub16() {
		super(1, true);
	}

	public static void method1051(boolean bool) {
		try {
			if (bool != false)
				method1052(-69, -23, -110, null, -114, 47, 46);
			aClass85_5621 = null;
			aClass29_5620 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ir.D(" + bool
					+ ')');
		}
	}

	static final AbstractModel method1052(int i, int i_0_, int i_1_, ha var_ha,
			int i_2_, int i_3_, int i_4_) {
		try {
			long l = (long) i_2_;
			AbstractModel abstractModel = ((AbstractModel) Class246_Sub4_Sub1.aClass79_6170
					.method802(-126, l));
			int i_5_ = 2055;
			if (abstractModel == null) {
				Model model = RSModelLoader.createModel(0, -9252,
						Class76_Sub9.aClass207_3787, i_2_);
				if (model == null)
					return null;
				if ((((Model) model).version ^ 0xffffffff) > -14)
					model.method2592(13746, 2);
				abstractModel = var_ha.method1790(model, i_5_,
						Class98_Sub10_Sub13.anInt5600, 64, 768);
				Class246_Sub4_Sub1.aClass79_6170.method805(l, abstractModel,
						(byte) -80);
			}
			abstractModel = abstractModel.method2341((byte) 2, i_5_, true);
			if (i_0_ != 0)
				abstractModel.a(i_0_);
			if (i_1_ != 0)
				abstractModel.FA(i_1_);
			if ((i ^ 0xffffffff) != -1)
				abstractModel.VA(i);
			if (i_3_ < 68)
				method1052(80, 14, 63, null, -118, 89, 104);
			if (i_4_ != 0)
				abstractModel.H(0, i_4_, 0);
			return abstractModel;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ir.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final int[] method990(int i, int i_6_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_6_);
			if (i != 255)
				aClass85_5621 = null;
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
				int[][] is_7_ = this.method994(i_6_, 24431, 0);
				int[] is_8_ = is_7_[0];
				int[] is_9_ = is_7_[1];
				int[] is_10_ = is_7_[2];
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_11_++)
					is[i_11_] = (is_8_[i_11_] + (is_9_[i_11_] - -is_10_[i_11_])) / 3;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ir.G(" + i + ','
					+ i_6_ + ')');
		}
	}
}
