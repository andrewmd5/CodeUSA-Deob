/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends Class256 {
	IDirect3DVertexDeclaration anIDirect3DVertexDeclaration5155;

	dxVertexLayout(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class49[] class49s) {
		try {
			final VertexElementCollection vertexelementcollection = new VertexElementCollection(
					var_ha_Sub3_Sub1.aJaa6108);
			int i = 0;
			for (int i_0_ = 0; class49s.length > i_0_; i_0_++) {
				int i_1_ = 0;
				final Class49 class49 = class49s[i_0_];
				for (int i_2_ = 0; i_2_ < class49.method480((byte) -105); i_2_++) {
					final Class169 class169 = class49.method479(i_2_,
							(byte) -98);
					if (Class169.aClass169_1294 == class169) {
						vertexelementcollection.addElement(i_0_, 2, 0, 0, 0,
								i_1_);
					} else if (class169 == Class169.aClass169_1297) {
						vertexelementcollection.addElement(i_0_, 2, 0, 3, 0,
								i_1_);
					} else if (class169 != Class169.aClass169_1298) {
						if (class169 == Class169.aClass169_1299) {
							vertexelementcollection.addElement(i_0_, 0, 0, 5,
									i++, i_1_);
						} else if (class169 != Class169.aClass169_1301) {
							if (class169 != Class169.aClass169_1302) {
								if (class169 == Class169.aClass169_1303) {
									vertexelementcollection.addElement(i_0_, 3,
											0, 5, i++, i_1_);
								}
							} else {
								vertexelementcollection.addElement(i_0_, 2, 0,
										5, i++, i_1_);
							}
						} else {
							vertexelementcollection.addElement(i_0_, 1, 0, 5,
									i++, i_1_);
						}
					} else {
						vertexelementcollection.addElement(i_0_, 4, 0, 10, 0,
								i_1_);
					}
					i_1_ += class169.anInt1295;
				}
			}
			vertexelementcollection.finish();
			anIDirect3DVertexDeclaration5155 = var_ha_Sub3_Sub1.anIDirect3DDevice6098
					.a(vertexelementcollection, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
