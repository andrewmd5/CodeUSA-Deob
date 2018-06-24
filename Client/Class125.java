/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.kg;

final class Class125 implements Interface2_Impl2 {
	private Class162 aClass162_5344;
	private int anInt5345;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_5346;
	private boolean aBoolean5347;
	private boolean aBoolean5348 = false;
	private int anInt5349;
	IDirect3DIndexBuffer anIDirect3DIndexBuffer5350;

	@Override
	public final Buffer method78(boolean bool, final int i) {
		Buffer buffer;
		try {
			if (anIDirect3DIndexBuffer5350 == null) {
				return null;
			}
			bool &= aBoolean5347;
			if (!aBoolean5348
					&& kg.a(-21593, (anIDirect3DIndexBuffer5350.Lock(0,
							anInt5345, bool ? 8192 : 0,
							(aHa_Sub3_Sub1_5346.aGeometryBuffer6086))))) {
				aBoolean5348 = true;
				return aHa_Sub3_Sub1_5346.aGeometryBuffer6086;
			}
			if (i > -79) {
				anInt5349 = -35;
			}
			buffer = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return buffer;
	}

	@Override
	public final int method2(final int i) {
		int i_0_;
		try {
			if (i != 200) {
				return -80;
			}
			i_0_ = anInt5349;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	@Override
	public final Class162 method77(final int i) {
		Class162 class162;
		try {
			if (i != -15448) {
				method2(-126);
			}
			class162 = aClass162_5344;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class162;
	}

	@Override
	public final void method72(final boolean bool) {
		try {
			if (bool) {
				method2(71);
			}
			if (null != anIDirect3DIndexBuffer5350) {
				anIDirect3DIndexBuffer5350.b(31);
				anIDirect3DIndexBuffer5350 = null;
			}
			anInt5345 = 0;
			anInt5349 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final boolean method79(final byte i) {
		boolean bool;
		try {
			if (aBoolean5348
					&& kg.a(-21593, anIDirect3DIndexBuffer5350.Unlock())) {
				aBoolean5348 = false;
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final void method76(final int i, final int i_2_) {
		do {
			try {
				anInt5349 = i * aClass162_5344.anInt1263;
				if (anInt5349 > anInt5345) {
					int i_3_ = 8;
					int i_4_;
					if (!aBoolean5347) {
						i_4_ = 1;
					} else {
						i_4_ = 0;
						i_3_ |= 0x200;
					}
					if (anIDirect3DIndexBuffer5350 != null) {
						anIDirect3DIndexBuffer5350.b(i_2_ + -20747);
					}
					anIDirect3DIndexBuffer5350 = (aHa_Sub3_Sub1_5346.anIDirect3DDevice6098
							.a(anInt5349,
									i_3_,
									(aClass162_5344 == Class162.aClass162_1267 ? 101
											: 102), i_4_,
									anIDirect3DIndexBuffer5350));
					anInt5345 = anInt5349;
				}
				if (i_2_ == 20779) {
					break;
				}
				method78(true, 102);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class125(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class162 class162,
			final boolean bool) {
		try {
			aClass162_5344 = class162;
			aHa_Sub3_Sub1_5346 = var_ha_Sub3_Sub1;
			aBoolean5347 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
