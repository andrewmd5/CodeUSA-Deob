/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 implements Runnable {
	private final Class98_Sub5[] aClass98_Sub5Array1345 = new Class98_Sub5[8];
	private long aLong1346;
	private final int[] anIntArray1347 = new int[3];
	private volatile boolean aBoolean1348;
	private volatile boolean aBoolean1349 = true;
	private Class245 aClass245_1350;
	private final ha aHa1351;
	private volatile boolean aBoolean1352;
	private final int anInt1353;

	@Override
	public final void run() {
		while (aBoolean1348) {
			method2567();
		}
	}

	final void method2561() {
		aBoolean1349 = true;
		synchronized (this) {
			notify();
		}
	}

	final long method2562() {
		return aLong1346;
	}

	final boolean method2563() {
		if (aClass245_1350 != null
				&& (aBoolean1352 || !aClass245_1350.method2959(124))) {
			return false;
		}
		return true;
	}

	final void method2564(final Class245 class245) {
		if (aClass245_1350 != null) {
			aClass245_1350.method2957(null, false);
		}
		aClass245_1350 = class245;
		if (aClass245_1350 != null) {
			aClass245_1350.method2957(this, false);
		}
	}

	final void method2565() {
		aBoolean1349 = false;
		aBoolean1348 = false;
		synchronized (this) {
			notify();
		}
	}

	final void method2566() {
		aBoolean1349 = false;
		synchronized (this) {
			notify();
		}
	}

	private final void method2567() {
		aHa1351.method1807(anInt1353);
		while (!aBoolean1349 && aBoolean1348) {
			if (aClass245_1350 != null && !aClass245_1350.method2959(114)) {
				aBoolean1352 = true;
				final Class246 class246 = aClass245_1350.method2956(0);
				if (class246 instanceof Class246_Sub3) {
					final Class246_Sub3 class246_sub3 = (Class246_Sub3) class246;
					if (class246_sub3.aBoolean5078) {
						class246_sub3.method2988(Class98_Sub10_Sub30.aHa5709,
								116);
					} else {
						Class289.method3407(class246_sub3,
								aClass98_Sub5Array1345);
						if (Class284_Sub1.aClass43_5177 != null) {
							Class284_Sub1.aClass43_5177.method411((byte) 53,
									class246_sub3.anInt5080,
									aClass245_1350.aString1866, -256,
									-16777216, class246_sub3.anInt5085);
						}
					}
				} else {
					final int i = (((Class246_Sub10) class246).anInt5151);
					if (i >= 1 && i <= 4) {
						final s var_s = Class78.aSArray594[i - 1];
						for (int i_0_ = 0; i_0_ < Class259.anInt1959
								+ Class259.anInt1959; i_0_++) {
							for (int i_1_ = 0; (i_1_ < Class259.anInt1959
									+ Class259.anInt1959); i_1_++) {
								if (Class34.aBooleanArrayArrayArray325[i - 1][i_0_][i_1_]) {
									final int i_2_ = (Class241.anInt1845
											- Class259.anInt1959 + i_0_);
									final int i_3_ = (Class64_Sub26.anInt3714
											- Class259.anInt1959 + i_1_);
									if (i_2_ >= 0 && i_2_ < var_s.anInt2203
											&& i_3_ >= 0
											&& i_3_ < var_s.anInt2204) {
										Class98_Sub10_Sub30.aHa5709
												.H(i_2_ << Class151_Sub8.anInt5015,
														var_s.method3420(i_3_,
																-12639, i_2_),
														i_3_ << Class151_Sub8.anInt5015,
														anIntArray1347);
										if (Class200
												.method2692(anIntArray1347[0]) == anInt1353 - 1) {
											var_s.method3425(i_2_, i_3_);
										}
									}
								}
							}
						}
					}
				}
			} else {
				aBoolean1352 = false;
				aLong1346 = Class376.aClass142_3174.method2308((byte) 69);
				synchronized (this) {
					try {
						this.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		}
		aHa1351.method1774(anInt1353);
		while (aBoolean1349 && aBoolean1348) {
			synchronized (this) {
				try {
					this.wait();
				} catch (final InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	Class174(final int i, final ha var_ha) {
		aBoolean1348 = true;
		aBoolean1352 = false;
		anInt1353 = i;
		aHa1351 = var_ha;
	}
}
