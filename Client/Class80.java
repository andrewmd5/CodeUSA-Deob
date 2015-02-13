/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.kg;

final class Class80 implements Interface2_Impl1 {
	IDirect3DVertexBuffer anIDirect3DVertexBuffer5337;
	private byte aByte5338;
	private int anInt5339;
	private boolean aBoolean5340;
	private int anInt5341;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_5342;
	private boolean aBoolean5343 = false;

	final int method810(final byte i) {
		byte i_0_;
		try {
			if (i != -22) {
				method810((byte) -72);
			}
			i_0_ = aByte5338;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	@Override
	public final boolean method73(final byte i, final int i_1_, final int i_2_,
			final Source source) {
		boolean bool;
		try {
			if (method74(-20279, i_2_, i_1_)) {
				return (anIDirect3DVertexBuffer5337.a(source, 0, 0, anInt5339,
						!aBoolean5340 ? 0 : 8192));
			}
			if (i >= -79) {
				return false;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final boolean method74(final int i, final int i_3_, final int i_4_) {
		boolean bool;
		try {
			anInt5339 = i_4_;
			if (i != -20279) {
				method73((byte) 73, 31, -108, null);
			}
			aByte5338 = (byte) i_3_;
			if (anInt5341 < anInt5339) {
				int i_5_ = 8;
				int i_6_;
				if (aBoolean5340) {
					i_6_ = 0;
					i_5_ |= 0x200;
				} else {
					i_6_ = 1;
				}
				if (null != anIDirect3DVertexBuffer5337) {
					anIDirect3DVertexBuffer5337.b(119);
				}
				anIDirect3DVertexBuffer5337 = (aHa_Sub3_Sub1_5342.anIDirect3DDevice6098
						.a(anInt5339, i_5_, 0, i_6_,
								anIDirect3DVertexBuffer5337));
				anInt5341 = anInt5339;
			}
			if (null != anIDirect3DVertexBuffer5337) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final Buffer method75(boolean bool, final byte i) {
		Buffer buffer;
		try {
			if (null == anIDirect3DVertexBuffer5337) {
				return null;
			}
			if (i != 27) {
				method74(118, -74, 74);
			}
			bool &= aBoolean5340;
			if (!aBoolean5343
					&& kg.a(-21593, (anIDirect3DVertexBuffer5337.Lock(0,
							anInt5341, bool ? 8192 : 0,
							(aHa_Sub3_Sub1_5342.aGeometryBuffer6086))))) {
				aBoolean5343 = true;
				return aHa_Sub3_Sub1_5342.aGeometryBuffer6086;
			}
			buffer = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return buffer;
	}

	@Override
	public final int method2(final int i) {
		int i_7_;
		try {
			if (i != 200) {
				method2(44);
			}
			i_7_ = anInt5339;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_7_;
	}

	@Override
	public final boolean method71(final int i) {
		boolean bool;
		try {
			if (aBoolean5343
					&& kg.a(-21593, anIDirect3DVertexBuffer5337.Unlock())) {
				aBoolean5343 = false;
				return true;
			}
			if (i != 13623) {
				aHa_Sub3_Sub1_5342 = null;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final void method72(final boolean bool) {
		try {
			if (bool) {
				method74(-75, -93, 67);
			}
			if (null != anIDirect3DVertexBuffer5337) {
				anIDirect3DVertexBuffer5337.b(112);
				anIDirect3DVertexBuffer5337 = null;
			}
			anInt5339 = 0;
			anInt5341 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class80(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final boolean bool) {
		try {
			aBoolean5340 = bool;
			aHa_Sub3_Sub1_5342 = var_ha_Sub3_Sub1;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
