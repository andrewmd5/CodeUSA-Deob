import java.text.NumberFormat;

/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
//model
final class Model {
	short[] textureTriangleNIndex;
	int[] anIntArray1386;
	int version = 12;
	byte[] textureRenderTypes;
	int[] particleDirectionX;
	int[] particleDirectionZ;
	int numTriangles;
	short[] triangleViewspaceZ;
	
	short[] triangleViewspaceX;
	short[] aShortArray1394;
	int[] triangleSkinValues;
	int numTextureTriangles;
	int[] anIntArray1397;
	SurfaceSkin[] surfaceSkins;
	byte[] particleLifespanY;
	int[] verticesY;
	static boolean aBoolean1401 = false;
	byte[] trianglePriorities;
	short[] textureTrianglePIndex;
	int[] particleDirectionY;
	static int anInt1405 = 0;
	int maxDepth;
	int numVertices = 0;
	short[] aShortArray1408;
	short[] faceTexture;
	short[] triangleViewspaceY;
	byte[] faceAlpha;
	int[] particleLifespanZ;
	Surface[] surfaces;
	byte[] faceRenderType;
	short[] colorValues;
	short[] originalColorValues;
	int[] verticesX;
	int[] vertexSkins;
	int[] verticesZ;
	VertexNormal[] isolatedVertexNormals;
	byte[] textureCoords;
	short[] textureTriangleMIndex;
	byte aByte1422;
	byte[] particleLifespanX;

	 
	 
	public void changeColour(int orig, int newId) {
		if (GameClient.isCrashing) {
			return;
		}
		for (int i = 0; i < colorValues.length; i++){
		
			if (colorValues[i] == orig) {
				colorValues[i] = (short) newId;
			}
		}
	}


	private final void readOldModel(final byte[] is, final int i) {
		do {
			try {
				boolean bool = false;
				boolean bool_0_ = false;
				final ByteBuffer class98_sub22 = new ByteBuffer(is);
				final ByteBuffer class98_sub22_1_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_2_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_3_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_4_ = new ByteBuffer(is);
				class98_sub22.position = -18 + is.length;
				numVertices = class98_sub22.readUnsignedShort((byte) 127);
				numTriangles = class98_sub22.readUnsignedShort((byte) 127);
				numTextureTriangles = class98_sub22.readUnsignedByte((byte) -104);
				final int i_5_ = class98_sub22.readUnsignedByte((byte) -106);
				final int i_6_ = class98_sub22.readUnsignedByte((byte) 113);
				final int i_7_ = class98_sub22.readUnsignedByte((byte) -106);
				final int i_8_ = class98_sub22.readUnsignedByte((byte) -119);
				final int i_9_ = class98_sub22.readUnsignedByte((byte) -8);
				final int i_10_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_11_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_12_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_13_ = class98_sub22.readUnsignedShort((byte) 127);
				int i_14_ = 0;
				final int i_15_ = i_14_;
				i_14_ += numVertices;
				final int i_16_ = i_14_;
				i_14_ += numTriangles;
				final int i_17_ = i_14_;
				if (i_6_ == 255) {
					i_14_ += numTriangles;
				}
				final int i_18_ = i_14_;
				if ((i_8_ ^ 0xffffffff) == -2) {
					i_14_ += numTriangles;
				}
				final int i_19_ = i_14_;
				if (i_5_ == 1) {
					i_14_ += numTriangles;
				}
				final int i_20_ = i_14_;
				if ((i_9_ ^ 0xffffffff) == -2) {
					i_14_ += numVertices;
				}
				final int i_21_ = i_14_;
				if (i_7_ == 1) {
					i_14_ += numTriangles;
				}
				final int i_22_ = i_14_;
				i_14_ += i_13_;
				final int i_23_ = i_14_;
				i_14_ += 2 * numTriangles;
				final int i_24_ = i_14_;
				i_14_ += numTextureTriangles * 6;
				final int i_25_ = i_14_;
				i_14_ += i_10_;
				final int i_26_ = i_14_;
				i_14_ += i_11_;
				final int i_27_ = i_14_;
				verticesX = new int[numVertices];
				if (i_7_ == 1) {
					faceAlpha = new byte[numTriangles];
				}
				if (numTextureTriangles > 0) {
					textureTriangleMIndex = new short[numTextureTriangles];
					textureTriangleNIndex = new short[numTextureTriangles];
					textureTrianglePIndex = new short[numTextureTriangles];
					textureRenderTypes = new byte[numTextureTriangles];
				}
				if (i_5_ == 1) {
					faceRenderType = new byte[numTriangles];
					textureCoords = new byte[numTriangles];
					faceTexture = new short[numTriangles];
				}
				colorValues = new short[numTriangles];
				verticesZ = new int[numVertices];
				verticesY = new int[numVertices];
				triangleViewspaceY = new short[numTriangles];
				i_14_ += i_12_;
				triangleViewspaceZ = new short[numTriangles];
				class98_sub22.position = i_15_;
				triangleViewspaceX = new short[numTriangles];
				if ((i_8_ ^ 0xffffffff) == -2) {
					triangleSkinValues = new int[numTriangles];
				}
				if ((i_6_ ^ 0xffffffff) == -256) {
					trianglePriorities = new byte[numTriangles];
				} else {
					aByte1422 = (byte) i_6_;
				}
				if (i_9_ == 1) {
					vertexSkins = new int[numVertices];
				}
				class98_sub22_1_.position = i_25_;
				class98_sub22_2_.position = i_26_;
				class98_sub22_3_.position = i_27_;
				class98_sub22_4_.position = i_20_;
				int i_28_ = 0;
				int i_29_ = 0;
				int i_30_ = 0;
				for (int i_31_ = 0; numVertices > i_31_; i_31_++) {
					final int i_32_ = class98_sub22.readUnsignedByte((byte) 20);
					int i_33_ = 0;
					if ((i_32_ & 0x1 ^ 0xffffffff) != -1) {
						i_33_ = class98_sub22_1_.method1239(40);
					}
					int i_34_ = 0;
					if ((i_32_ & 0x2 ^ 0xffffffff) != -1) {
						i_34_ = class98_sub22_2_.method1239(-122);
					}
					int i_35_ = 0;
					if ((0x4 & i_32_ ^ 0xffffffff) != -1) {
						i_35_ = class98_sub22_3_.method1239(i ^ ~0x31);
					}
					verticesX[i_31_] = i_33_ + i_28_;
					verticesY[i_31_] = i_34_ + i_29_;
					verticesZ[i_31_] = i_30_ + i_35_;
					i_29_ = verticesY[i_31_];
					i_30_ = verticesZ[i_31_];
					i_28_ = verticesX[i_31_];
					if ((i_9_ ^ 0xffffffff) == -2) {
						vertexSkins[i_31_] = class98_sub22_4_
								.readUnsignedByte((byte) -127);
					}
				}
				class98_sub22.position = i_23_;
				class98_sub22_1_.position = i_19_;
				class98_sub22_2_.position = i_17_;
				class98_sub22_3_.position = i_21_;
				class98_sub22_4_.position = i_18_;
				for (int i_36_ = 0; i_36_ < numTriangles; i_36_++) {
					colorValues[i_36_] = (short) class98_sub22
							.readUnsignedShort((byte) 127);
					if ((i_5_ ^ 0xffffffff) == -2) {
						final int i_37_ = class98_sub22_1_
								.readUnsignedByte((byte) -105);
						if ((i_37_ & 0x1 ^ 0xffffffff) != -2) {
							faceRenderType[i_36_] = (byte) 0;
						} else {
							bool = true;
							faceRenderType[i_36_] = (byte) 1;
						}
						if ((0x2 & i_37_) != 2) {
							textureCoords[i_36_] = (byte) -1;
							faceTexture[i_36_] = (short) -1;
						} else {
							textureCoords[i_36_] = (byte) (i_37_ >> -870827966);
							faceTexture[i_36_] = colorValues[i_36_];
							colorValues[i_36_] = (short) 127;
							if (faceTexture[i_36_] != -1) {
								bool_0_ = true;
							}
						}
					}
					if ((i_6_ ^ 0xffffffff) == -256) {
						trianglePriorities[i_36_] = class98_sub22_2_
								.readSignedByte((byte) -19);
					}
					if (i_7_ == 1) {
						faceAlpha[i_36_] = class98_sub22_3_
								.readSignedByte((byte) -19);
					}
					if ((i_8_ ^ 0xffffffff) == -2) {
						triangleSkinValues[i_36_] = class98_sub22_4_
								.readUnsignedByte((byte) 39);
					}
				}
				maxDepth = i;
				class98_sub22.position = i_22_;
				class98_sub22_1_.position = i_16_;
				short i_38_ = 0;
				short i_39_ = 0;
				short i_40_ = 0;
				int i_41_ = 0;
				for (int i_42_ = 0; numTriangles > i_42_; i_42_++) {
					final int i_43_ = class98_sub22_1_
							.readUnsignedByte((byte) 32);
					if ((i_43_ ^ 0xffffffff) == -2) {
						i_38_ = (short) (class98_sub22.method1239(-96) + i_41_);
						i_41_ = i_38_;
						i_39_ = (short) (class98_sub22.method1239(105) + i_41_);
						i_41_ = i_39_;
						i_40_ = (short) (class98_sub22.method1239(i + -104) + i_41_);
						triangleViewspaceX[i_42_] = i_38_;
						i_41_ = i_40_;
						triangleViewspaceY[i_42_] = i_39_;
						triangleViewspaceZ[i_42_] = i_40_;
						if ((maxDepth ^ 0xffffffff) > (i_38_ ^ 0xffffffff)) {
							maxDepth = i_38_;
						}
						if (i_39_ > maxDepth) {
							maxDepth = i_39_;
						}
						if ((maxDepth ^ 0xffffffff) > (i_40_ ^ 0xffffffff)) {
							maxDepth = i_40_;
						}
					}
					if (i_43_ == 2) {
						i_39_ = i_40_;
						i_40_ = (short) (i_41_ + class98_sub22.method1239(120));
						triangleViewspaceX[i_42_] = i_38_;
						i_41_ = i_40_;
						triangleViewspaceY[i_42_] = i_39_;
						triangleViewspaceZ[i_42_] = i_40_;
						if (i_40_ > maxDepth) {
							maxDepth = i_40_;
						}
					}
					if ((i_43_ ^ 0xffffffff) == -4) {
						i_38_ = i_40_;
						i_40_ = (short) (class98_sub22.method1239(39) + i_41_);
						triangleViewspaceX[i_42_] = i_38_;
						i_41_ = i_40_;
						triangleViewspaceY[i_42_] = i_39_;
						triangleViewspaceZ[i_42_] = i_40_;
						if (i_40_ > maxDepth) {
							maxDepth = i_40_;
						}
					}
					if (i_43_ == 4) {
						final short i_44_ = i_38_;
						i_38_ = i_39_;
						i_39_ = i_44_;
						i_40_ = (short) (class98_sub22.method1239(116) + i_41_);
						triangleViewspaceX[i_42_] = i_38_;
						i_41_ = i_40_;
						triangleViewspaceY[i_42_] = i_39_;
						triangleViewspaceZ[i_42_] = i_40_;
						if (maxDepth < i_40_) {
							maxDepth = i_40_;
						}
					}
				}
				class98_sub22.position = i_24_;
				maxDepth++;
				for (int i_45_ = 0; numTextureTriangles > i_45_; i_45_++) {
					textureRenderTypes[i_45_] = (byte) 0;
					textureTrianglePIndex[i_45_] = (short) class98_sub22
							.readUnsignedShort((byte) 127);
					textureTriangleMIndex[i_45_] = (short) class98_sub22
							.readUnsignedShort((byte) 127);
					textureTriangleNIndex[i_45_] = (short) class98_sub22
							.readUnsignedShort((byte) 127);
				}
				if (textureCoords != null) {
					boolean bool_46_ = false;
					for (int i_47_ = 0; ((i_47_ ^ 0xffffffff) > (numTriangles ^ 0xffffffff)); i_47_++) {
						final int i_48_ = 0xff & textureCoords[i_47_];
						if ((i_48_ ^ 0xffffffff) != -256) {
							if (((0xffff & textureTrianglePIndex[i_48_]) != triangleViewspaceX[i_47_])
									|| ((0xffff & (textureTriangleMIndex[i_48_])) != (triangleViewspaceY[i_47_]))
									|| ((triangleViewspaceZ[i_47_] ^ 0xffffffff) != ((textureTriangleNIndex[i_48_]) & 0xffff ^ 0xffffffff))) {
								bool_46_ = true;
							} else {
								textureCoords[i_47_] = (byte) -1;
							}
						}
					}
					if (!bool_46_) {
						textureCoords = null;
					}
				}
				if (!bool) {
					faceRenderType = null;
				}
				if (bool_0_) {
					break;
				}
				faceTexture = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lv.H("
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final float method2588(final float f, final int i, final int i_49_,
			final float f_50_, final float f_51_) {
		try {
			if (i_49_ != -24576) {
				method2588(-0.72166127F, 92, -119, -1.0185089F, -1.6095228F);
			}
			final float[] fs = Class48_Sub2_Sub1.aFloatArrayArray5522[i];
			return fs[2] * f_51_ + (f * fs[0] + fs[1] * f_50_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.D(" + f + ','
					+ i + ',' + i_49_ + ',' + f_50_ + ',' + f_51_ + ')'));
		}
	}

	private final void readNewModel(final byte[] is, final int i) {
		do {
			try {
				final ByteBuffer class98_sub22 = new ByteBuffer(is);
				final ByteBuffer class98_sub22_52_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_53_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_54_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_55_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_56_ = new ByteBuffer(is);
				final ByteBuffer class98_sub22_57_ = new ByteBuffer(is);
				class98_sub22.position = is.length - 23;
				numVertices = class98_sub22.readUnsignedShort((byte) 127);
				numTriangles = class98_sub22.readUnsignedShort((byte) 127);
				numTextureTriangles = class98_sub22.readUnsignedByte((byte) 7);
				final int modelFlag = class98_sub22.readUnsignedByte((byte) -111);
				final boolean hasFillAttributes = (modelFlag & i) == 1;
				final boolean bool_59_ = (0x2 & modelFlag ^ 0xffffffff) == -3;
				final boolean bool_60_ = (modelFlag & 0x4) == 4;
				final boolean bool_61_ = (modelFlag & 0x8 ^ 0xffffffff) == -9;
				if (bool_61_) {
					class98_sub22.position -= 7;
					version = class98_sub22.readUnsignedByte((byte) -118);
					class98_sub22.position += 6;
				}
				final int i_62_ = class98_sub22.readUnsignedByte((byte) 42);
				final int i_63_ = class98_sub22.readUnsignedByte((byte) 66);
				final int i_64_ = class98_sub22.readUnsignedByte((byte) -118);
				final int i_65_ = class98_sub22.readUnsignedByte((byte) -112);
				final int i_66_ = class98_sub22.readUnsignedByte((byte) -126);
				final int i_67_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_68_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_69_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_70_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_71_ = class98_sub22.readUnsignedShort((byte) 127);
				int i_72_ = 0;
				int i_73_ = 0;
				int i_74_ = 0;
				if (numTextureTriangles > 0) {
					class98_sub22.position = 0;
					textureRenderTypes = new byte[numTextureTriangles];
					for (int i_75_ = 0; i_75_ < numTextureTriangles; i_75_++) {
						final byte i_76_ = (textureRenderTypes[i_75_] = class98_sub22
								.readSignedByte((byte) -19));
						if ((i_76_ ^ 0xffffffff) == -3) {
							i_74_++;
						}
						if ((i_76_ ^ 0xffffffff) == -1) {
							i_72_++;
						}
						if ((i_76_ ^ 0xffffffff) <= -2 && i_76_ <= 3) {
							i_73_++;
						}
					}
				}
				int i_77_ = numTextureTriangles;
				final int i_78_ = i_77_;
				i_77_ += numVertices;
				final int i_79_ = i_77_;
				if (hasFillAttributes) {
					i_77_ += numTriangles;
				}
				final int i_80_ = i_77_;
				i_77_ += numTriangles;
				final int i_81_ = i_77_;
				if (i_62_ == 255) {
					i_77_ += numTriangles;
				}
				final int i_82_ = i_77_;
				if (i_64_ == 1) {
					i_77_ += numTriangles;
				}
				final int i_83_ = i_77_;
				if (i_66_ == 1) {
					i_77_ += numVertices;
				}
				final int i_84_ = i_77_;
				if (i_63_ == 1) {
					i_77_ += numTriangles;
				}
				final int i_85_ = i_77_;
				i_77_ += i_70_;
				final int i_86_ = i_77_;
				if (i_65_ == 1) {
					i_77_ += 2 * numTriangles;
				}
				final int i_87_ = i_77_;
				i_77_ += i_71_;
				final int i_88_ = i_77_;
				i_77_ += 2 * numTriangles;
				final int i_89_ = i_77_;
				i_77_ += i_67_;
				final int i_90_ = i_77_;
				i_77_ += i_68_;
				final int i_91_ = i_77_;
				i_77_ += i_69_;
				final int i_92_ = i_77_;
				i_77_ += i_72_ * 6;
				final int i_93_ = i_77_;
				i_77_ += i_73_ * 6;
				int i_94_ = 6;
				if ((version ^ 0xffffffff) != -15) {
					if ((version ^ 0xffffffff) <= -16) {
						i_94_ = 9;
					}
				} else {
					i_94_ = 7;
				}
				final int i_95_ = i_77_;
				i_77_ += i_73_ * i_94_;
				final int i_96_ = i_77_;
				i_77_ += i_73_;
				final int i_97_ = i_77_;
				i_77_ += i_73_;
				final int i_98_ = i_77_;
				i_77_ += 2 * i_74_ + i_73_;
				triangleViewspaceY = new short[numTriangles];
				triangleViewspaceX = new short[numTriangles];
				final int i_99_ = i_77_;
				if ((i_64_ ^ 0xffffffff) == -2) {
					triangleSkinValues = new int[numTriangles];
				}
				if (hasFillAttributes) {
					faceRenderType = new byte[numTriangles];
				}
				if ((i_63_ ^ 0xffffffff) == -2) {
					faceAlpha = new byte[numTriangles];
				}
				class98_sub22.position = i_78_;
				if ((numTextureTriangles ^ 0xffffffff) < -1) {
					if ((i_73_ ^ 0xffffffff) < -1) {
						particleLifespanZ = new int[i_73_];
						particleDirectionX = new int[i_73_];
						particleLifespanX = new byte[i_73_];
						particleLifespanY = new byte[i_73_];
						particleDirectionY = new int[i_73_];
						particleDirectionZ = new int[i_73_];
					}
					if ((i_74_ ^ 0xffffffff) < -1) {
						anIntArray1397 = new int[i_74_];
						anIntArray1386 = new int[i_74_];
					}
					textureTrianglePIndex = new short[numTextureTriangles];
					textureTriangleMIndex = new short[numTextureTriangles];
					textureTriangleNIndex = new short[numTextureTriangles];
				}
				verticesX = new int[numVertices];
				if (i_65_ == 1) {
					faceTexture = new short[numTriangles];
				}
				triangleViewspaceZ = new short[numTriangles];
				colorValues = new short[numTriangles];
				if ((i_62_ ^ 0xffffffff) == -256) {
					trianglePriorities = new byte[numTriangles];
				} else {
					aByte1422 = (byte) i_62_;
				}
				verticesY = new int[numVertices];
				verticesZ = new int[numVertices];
				if (i_65_ == 1 && (numTextureTriangles ^ 0xffffffff) < -1) {
					textureCoords = new byte[numTriangles];
				}
				if ((i_66_ ^ 0xffffffff) == -2) {
					vertexSkins = new int[numVertices];
				}
				class98_sub22_52_.position = i_89_;
				class98_sub22_53_.position = i_90_;
				class98_sub22_54_.position = i_91_;
				class98_sub22_55_.position = i_83_;
				int i_100_ = 0;
				int i_101_ = 0;
				int i_102_ = 0;
				for (int i_103_ = 0; ((numVertices ^ 0xffffffff) < (i_103_ ^ 0xffffffff)); i_103_++) {
					final int i_104_ = class98_sub22
							.readUnsignedByte((byte) 50);
					int i_105_ = 0;
					if ((0x1 & i_104_ ^ 0xffffffff) != -1) {
						i_105_ = class98_sub22_52_.method1239(i + -65);
					}
					int i_106_ = 0;
					if ((i_104_ & 0x2 ^ 0xffffffff) != -1) {
						i_106_ = class98_sub22_53_.method1239(-111);
					}
					int i_107_ = 0;
					if ((0x4 & i_104_) != 0) {
						i_107_ = class98_sub22_54_.method1239(56);
					}
					verticesX[i_103_] = i_100_ + i_105_;
					verticesY[i_103_] = i_101_ + i_106_;
					verticesZ[i_103_] = i_102_ - -i_107_;
					i_101_ = verticesY[i_103_];
					i_102_ = verticesZ[i_103_];
					i_100_ = verticesX[i_103_];
					if ((i_66_ ^ 0xffffffff) == -2) {
						vertexSkins[i_103_] = class98_sub22_55_
								.readUnsignedByte((byte) 63);
					}
				}
				class98_sub22.position = i_88_;
				class98_sub22_52_.position = i_79_;
				class98_sub22_53_.position = i_81_;
				class98_sub22_54_.position = i_84_;
				class98_sub22_55_.position = i_82_;
				class98_sub22_56_.position = i_86_;
				class98_sub22_57_.position = i_87_;
				for (int i_108_ = 0; numTriangles > i_108_; i_108_++) {
					colorValues[i_108_] = (short) class98_sub22
							.readUnsignedShort((byte) 127);
					if (hasFillAttributes) {
						faceRenderType[i_108_] = class98_sub22_52_
								.readSignedByte((byte) -19);
					}
					if (i_62_ == 255) {
						trianglePriorities[i_108_] = class98_sub22_53_
								.readSignedByte((byte) -19);
					}
					if ((i_63_ ^ 0xffffffff) == -2) {
						faceAlpha[i_108_] = class98_sub22_54_
								.readSignedByte((byte) -19);
					}
					if (i_64_ == 1) {
						triangleSkinValues[i_108_] = class98_sub22_55_
								.readUnsignedByte((byte) 9);
					}
					if (i_65_ == 1) {
						faceTexture[i_108_] = (short) (class98_sub22_56_
								.readUnsignedShort((byte) 127) + -1);
					}
					if (textureCoords != null) {
						if (faceTexture[i_108_] == -1) {
							textureCoords[i_108_] = (byte) -1;
						} else {
							textureCoords[i_108_] = (byte) (class98_sub22_57_
									.readUnsignedByte((byte) -120) + -1);
						}
					}
				}
				maxDepth = -1;
				class98_sub22.position = i_85_;
				class98_sub22_52_.position = i_80_;
				short i_109_ = 0;
				short i_110_ = 0;
				short i_111_ = 0;
				int i_112_ = 0;
				for (int i_113_ = 0; i_113_ < numTriangles; i_113_++) {
					final int i_114_ = class98_sub22_52_
							.readUnsignedByte((byte) -118);
					if ((i_114_ ^ 0xffffffff) == -2) {
						i_109_ = (short) (i_112_ + class98_sub22.method1239(44));
						i_112_ = i_109_;
						i_110_ = (short) (class98_sub22.method1239(i ^ 0x44) + i_112_);
						i_112_ = i_110_;
						i_111_ = (short) (class98_sub22.method1239(i + -99) + i_112_);
						i_112_ = i_111_;
						triangleViewspaceX[i_113_] = i_109_;
						triangleViewspaceY[i_113_] = i_110_;
						triangleViewspaceZ[i_113_] = i_111_;
						if (i_109_ > maxDepth) {
							maxDepth = i_109_;
						}
						if (maxDepth < i_110_) {
							maxDepth = i_110_;
						}
						if (i_111_ > maxDepth) {
							maxDepth = i_111_;
						}
					}
					if ((i_114_ ^ 0xffffffff) == -3) {
						i_110_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22
								.method1239(-78));
						triangleViewspaceX[i_113_] = i_109_;
						i_112_ = i_111_;
						triangleViewspaceY[i_113_] = i_110_;
						triangleViewspaceZ[i_113_] = i_111_;
						if ((i_111_ ^ 0xffffffff) < (maxDepth ^ 0xffffffff)) {
							maxDepth = i_111_;
						}
					}
					if ((i_114_ ^ 0xffffffff) == -4) {
						i_109_ = i_111_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(74));
						i_112_ = i_111_;
						triangleViewspaceX[i_113_] = i_109_;
						triangleViewspaceY[i_113_] = i_110_;
						triangleViewspaceZ[i_113_] = i_111_;
						if ((maxDepth ^ 0xffffffff) > (i_111_ ^ 0xffffffff)) {
							maxDepth = i_111_;
						}
					}
					if ((i_114_ ^ 0xffffffff) == -5) {
						final short i_115_ = i_109_;
						i_109_ = i_110_;
						i_110_ = i_115_;
						i_111_ = (short) (i_112_ + class98_sub22.method1239(i
								+ -87));
						triangleViewspaceX[i_113_] = i_109_;
						i_112_ = i_111_;
						triangleViewspaceY[i_113_] = i_110_;
						triangleViewspaceZ[i_113_] = i_111_;
						if ((maxDepth ^ 0xffffffff) > (i_111_ ^ 0xffffffff)) {
							maxDepth = i_111_;
						}
					}
				}
				maxDepth++;
				class98_sub22.position = i_92_;
				class98_sub22_52_.position = i_93_;
				class98_sub22_53_.position = i_95_;
				class98_sub22_54_.position = i_96_;
				class98_sub22_55_.position = i_97_;
				class98_sub22_56_.position = i_98_;
				for (int i_116_ = 0; numTextureTriangles > i_116_; i_116_++) {
					final int i_117_ = textureRenderTypes[i_116_] & 0xff;
					if ((i_117_ ^ 0xffffffff) == -1) {
						textureTrianglePIndex[i_116_] = (short) class98_sub22
								.readUnsignedShort((byte) 127);
						textureTriangleMIndex[i_116_] = (short) class98_sub22
								.readUnsignedShort((byte) 127);
						textureTriangleNIndex[i_116_] = (short) class98_sub22
								.readUnsignedShort((byte) 127);
					}
					if (i_117_ == 1) {
						textureTrianglePIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleMIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleNIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						if (version < 15) {
							particleDirectionX[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
							if (version >= 14) {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readMediumInt(-127);
							} else {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readUnsignedShort((byte) 127);
							}
							particleDirectionZ[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
						} else {
							particleDirectionX[i_116_] = class98_sub22_53_
									.readMediumInt(i + -129);
							particleDirectionY[i_116_] = class98_sub22_53_
									.readMediumInt(-127);
							particleDirectionZ[i_116_] = (class98_sub22_53_
									.readMediumInt(Class369.method3953(i, -125)));
						}
						particleLifespanX[i_116_] = class98_sub22_54_
								.readSignedByte((byte) -19);
						particleLifespanY[i_116_] = class98_sub22_55_
								.readSignedByte((byte) -19);
						particleLifespanZ[i_116_] = class98_sub22_56_
								.readSignedByte((byte) -19);
					}
					if (i_117_ == 2) {
						textureTrianglePIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleMIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleNIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						if ((version ^ 0xffffffff) <= -16) {
							particleDirectionX[i_116_] = (class98_sub22_53_
									.readMediumInt(Class369.method3953(i, -124)));
							particleDirectionY[i_116_] = class98_sub22_53_
									.readMediumInt(-126);
							particleDirectionZ[i_116_] = class98_sub22_53_
									.readMediumInt(-128);
						} else {
							particleDirectionX[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
							if (version < 14) {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readUnsignedShort((byte) 127);
							} else {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readMediumInt(-127);
							}
							particleDirectionZ[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
						}
						particleLifespanX[i_116_] = class98_sub22_54_
								.readSignedByte((byte) -19);
						particleLifespanY[i_116_] = class98_sub22_55_
								.readSignedByte((byte) -19);
						particleLifespanZ[i_116_] = class98_sub22_56_
								.readSignedByte((byte) -19);
						anIntArray1397[i_116_] = class98_sub22_56_
								.readSignedByte((byte) -19);
						anIntArray1386[i_116_] = class98_sub22_56_
								.readSignedByte((byte) -19);
					}
					if (i_117_ == 3) {
						textureTrianglePIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleMIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						textureTriangleNIndex[i_116_] = (short) class98_sub22_52_
								.readUnsignedShort((byte) 127);
						if (version < 15) {
							particleDirectionX[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
							if ((version ^ 0xffffffff) > -15) {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readUnsignedShort((byte) 127);
							} else {
								particleDirectionY[i_116_] = class98_sub22_53_
										.readMediumInt(-123);
							}
							particleDirectionZ[i_116_] = class98_sub22_53_
									.readUnsignedShort((byte) 127);
						} else {
							particleDirectionX[i_116_] = class98_sub22_53_
									.readMediumInt(i + -126);
							particleDirectionY[i_116_] = class98_sub22_53_
									.readMediumInt(-123);
							particleDirectionZ[i_116_] = class98_sub22_53_
									.readMediumInt(-123);
						}
						particleLifespanX[i_116_] = class98_sub22_54_
								.readSignedByte((byte) -19);
						particleLifespanY[i_116_] = class98_sub22_55_
								.readSignedByte((byte) -19);
						particleLifespanZ[i_116_] = class98_sub22_56_
								.readSignedByte((byte) -19);
					}
				}
				class98_sub22.position = i_99_;
				if (bool_59_) {
					final int i_118_ = class98_sub22
							.readUnsignedByte((byte) -119);
					if ((i_118_ ^ 0xffffffff) < -1) {
						surfaces = new Surface[i_118_];
						for (int i_119_ = 0; (i_118_ ^ 0xffffffff) < (i_119_ ^ 0xffffffff); i_119_++) {
							final int i_120_ = class98_sub22
									.readUnsignedShort((byte) 127);
							final int i_121_ = class98_sub22
									.readUnsignedShort((byte) 127);
							byte i_122_;
							if ((i_62_ ^ 0xffffffff) != -256) {
								i_122_ = (byte) i_62_;
							} else {
								i_122_ = trianglePriorities[i_121_];
							}
							surfaces[i_119_] = new Surface(i_120_,
									(triangleViewspaceX[i_121_]),
									(triangleViewspaceY[i_121_]),
									(triangleViewspaceZ[i_121_]), i_122_);
						}
					}
					final int i_123_ = class98_sub22
							.readUnsignedByte((byte) 113);
					if (i_123_ > 0) {
						surfaceSkins = new SurfaceSkin[i_123_];
						for (int i_124_ = 0; (i_123_ ^ 0xffffffff) < (i_124_ ^ 0xffffffff); i_124_++) {
							final int i_125_ = class98_sub22
									.readUnsignedShort((byte) 127);
							final int i_126_ = class98_sub22
									.readUnsignedShort((byte) 127);
							surfaceSkins[i_124_] = new SurfaceSkin(i_125_,
									i_126_);
						}
					}
				}
				if (!bool_60_) {
					break;
				}
				final int i_127_ = class98_sub22.readUnsignedByte((byte) 6);
				if ((i_127_ ^ 0xffffffff) >= -1) {
					break;
				}
				isolatedVertexNormals = new VertexNormal[i_127_];
				for (int i_128_ = 0; (i_127_ ^ 0xffffffff) < (i_128_ ^ 0xffffffff); i_128_++) {
					final int i_129_ = class98_sub22.readUnsignedShort((byte) 127);
					final int i_130_ = class98_sub22.readUnsignedShort((byte) 127);
					final int i_131_ = class98_sub22
							.readUnsignedByte((byte) 18);
					final byte i_132_ = class98_sub22
							.readSignedByte((byte) -19);
					isolatedVertexNormals[i_128_] = new VertexNormal(i_129_, i_130_,
							i_131_, i_132_);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lv.E("
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2590(final short i, final byte i_133_, final short i_134_) {
		try {
			if (faceTexture != null) {
				for (int i_136_ = 0; i_136_ < numTriangles; i_136_++) {
					if ((i_134_ ^ 0xffffffff) == (faceTexture[i_136_] ^ 0xffffffff)) {
						faceTexture[i_136_] = i;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.C(" + i + ','
					+ i_133_ + ',' + i_134_ + ')'));
		}
	}
//i tihnk thts all so what now
	//copy paste model ehader from my model viewer
	//u will ahve tho change the bytebuffer shit because ur client uses some random parameters sometimes
	//mind doing it lol //what do you need im going to download that model viewer
	//dfanskdjskdjlhfkasjd
	final int[][] method2591(final byte i) {
		try {
			final int[] is = new int[256];
			int i_137_ = 0;
			for (int i_138_ = 0; ((i_138_ ^ 0xffffffff) > (numTriangles ^ 0xffffffff)); i_138_++) {
				final int i_139_ = triangleSkinValues[i_138_];
				if ((i_139_ ^ 0xffffffff) <= -1) {
					if ((i_139_ ^ 0xffffffff) < (i_137_ ^ 0xffffffff)) {
						i_137_ = i_139_;
					}
					is[i_139_]++;
				}
			}
			final int[][] is_140_ = new int[1 + i_137_][];
			if (i <= 96) {
				return null;
			}
			for (int i_141_ = 0; i_137_ >= i_141_; i_141_++) {
				is_140_[i_141_] = new int[is[i_141_]];
				is[i_141_] = 0;
			}
			for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (numTriangles ^ 0xffffffff)); i_142_++) {
				final int i_143_ = triangleSkinValues[i_142_];
				if ((i_143_ ^ 0xffffffff) <= -1) {
					is_140_[i_143_][is[i_143_]++] = i_142_;
				}
			}
			return is_140_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lv.J(" + i + ')');
		}
	}

	final void method2592(final int i, final int i_144_) {
		do {
			try {
				if (i != 13746) {
					method2596(-114);
				}
				for (int i_145_ = 0; numVertices > i_145_; i_145_++) {
					verticesX[i_145_] <<= i_144_;
					verticesY[i_145_] <<= i_144_;
					verticesZ[i_145_] <<= i_144_;
				}
				if ((numTextureTriangles ^ 0xffffffff) >= -1 || particleDirectionX == null) {
					break;
				}
				for (int i_146_ = 0; ((particleDirectionX.length ^ 0xffffffff) < (i_146_ ^ 0xffffffff)); i_146_++) {
					particleDirectionX[i_146_] <<= i_144_;
					particleDirectionY[i_146_] <<= i_144_;
					if (textureRenderTypes[i_146_] != 1) {
						particleDirectionZ[i_146_] <<= i_144_;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lv.L(" + i
						+ ',' + i_144_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2593(final int i, final short i_147_, final short i_148_) {
		try {
			for (int i_149_ = i; numTriangles > i_149_; i_149_++) {
				if ((i_147_ ^ 0xffffffff) == (colorValues[i_149_] ^ 0xffffffff)) {
					colorValues[i_149_] = i_148_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.A(" + i + ','
					+ i_147_ + ',' + i_148_ + ')'));
		}
	}

	final int method2594(final byte i, final short i_150_, final short i_151_,
			final byte i_152_, final boolean bool, final int i_153_,
			final int i_154_, final byte i_155_, final int i_156_) {
		try {
			triangleViewspaceX[numTriangles] = (short) i_154_;
			triangleViewspaceY[numTriangles] = (short) i_156_;
			triangleViewspaceZ[numTriangles] = (short) i_153_;
			faceRenderType[numTriangles] = i;
			textureCoords[numTriangles] = i_155_;
			colorValues[numTriangles] = i_150_;
			faceAlpha[numTriangles] = i_152_;
			if (bool != false) {
				particleDirectionZ = null;
			}
			faceTexture[numTriangles] = i_151_;
			return numTriangles++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("lv.F(" + i + ',' + i_150_ + ',' + i_151_ + ',' + i_152_
							+ ',' + bool + ',' + i_153_ + ',' + i_154_ + ','
							+ i_155_ + ',' + i_156_ + ')'));
		}
	}

	final int[][] method2595(final int i, final boolean bool) {
		try {
			if (i < 17) {
				method2594((byte) -59, (short) -115, (short) -111, (byte) -111,
						true, -58, 126, (byte) -114, -57);
			}
			final int[] is = new int[256];
			int i_157_ = 0;
			final int i_158_ = (!bool ? maxDepth : numVertices);
			for (int i_159_ = 0; (i_158_ ^ 0xffffffff) < (i_159_ ^ 0xffffffff); i_159_++) {
				final int i_160_ = vertexSkins[i_159_];
				if (i_160_ >= 0) {
					if ((i_157_ ^ 0xffffffff) > (i_160_ ^ 0xffffffff)) {
						i_157_ = i_160_;
					}
					is[i_160_]++;
				}
			}
			final int[][] is_161_ = new int[i_157_ + 1][];
			for (int i_162_ = 0; i_157_ >= i_162_; i_162_++) {
				is_161_[i_162_] = new int[is[i_162_]];
				is[i_162_] = 0;
			}
			for (int i_163_ = 0; i_158_ > i_163_; i_163_++) {
				final int i_164_ = vertexSkins[i_163_];
				if ((i_164_ ^ 0xffffffff) <= -1) {
					is_161_[i_164_][is[i_164_]++] = i_163_;
				}
			}
			return is_161_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lv.B(" + i + ','
					+ bool + ')');
		}
	}

	final int[][] method2596(final int i) {
		try {
			final int[] is = new int[256];
			int i_165_ = 0;
			for (int i_166_ = 0; ((isolatedVertexNormals.length ^ 0xffffffff) < (i_166_ ^ 0xffffffff)); i_166_++) {
				final int i_167_ = (isolatedVertexNormals[i_166_].anInt908);
				if ((i_167_ ^ 0xffffffff) <= -1) {
					if (i_165_ < i_167_) {
						i_165_ = i_167_;
					}
					is[i_167_]++;
				}
			}
			final int[][] is_168_ = new int[i_165_ + 1][];
			for (int i_169_ = 0; (i_169_ ^ 0xffffffff) >= (i_165_ ^ 0xffffffff); i_169_++) {
				is_168_[i_169_] = new int[is[i_169_]];
				is[i_169_] = 0;
			}
			int i_170_ = 0;
			if (i != 21517) {
				verticesZ = null;
			}
			for (/**/; ((i_170_ ^ 0xffffffff) > (isolatedVertexNormals.length ^ 0xffffffff)); i_170_++) {
				final int i_171_ = (isolatedVertexNormals[i_170_].anInt908);
				if (i_171_ >= 0) {
					is_168_[i_171_][is[i_171_]++] = i_170_;
				}
			}
			return is_168_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lv.G(" + i + ')');
		}
	}

	final void method2597(final int i, final int i_172_, final byte i_173_,
			final int i_174_) {
		do {
			try {
				for (int i_175_ = 0; i_175_ < numVertices; i_175_++) {
					verticesX[i_175_] += i_172_;
					verticesY[i_175_] += i_174_;
					verticesZ[i_175_] += i;
				}
				if (i_173_ >= 54) {
					break;
				}
				method2595(105, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lv.O(" + i
						+ ',' + i_172_ + ',' + i_173_ + ',' + i_174_ + ')'));
			}
			break;
		} while (false);
	}

	private final int method2598(final Model class178_176_, final int i,
			final short i_177_, final int i_178_) {
		try {
			final int i_179_ = class178_176_.verticesX[i];
			final int i_180_ = class178_176_.verticesY[i];
			final int i_181_ = class178_176_.verticesZ[i];
			for (int i_182_ = i_178_; ((numVertices ^ 0xffffffff) < (i_182_ ^ 0xffffffff)); i_182_++) {
				if (verticesX[i_182_] == i_179_
						&& verticesY[i_182_] == i_180_
						&& verticesZ[i_182_] == i_181_) {
					aShortArray1408[i_182_] = (short) Class41.method366(
							(aShortArray1408[i_182_]), i_177_);
					return i_182_;
				}
			}
			verticesX[numVertices] = i_179_;
			verticesY[numVertices] = i_180_;
			verticesZ[numVertices] = i_181_;
			aShortArray1408[numVertices] = i_177_;
			vertexSkins[numVertices] = (class178_176_.vertexSkins != null ? class178_176_.vertexSkins[i]
					: -1);
			return numVertices++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.M("
					+ (class178_176_ != null ? "{...}" : "null") + ',' + i
					+ ',' + i_177_ + ',' + i_178_ + ')'));
		}
	}

	final int method2599(final int i, final int i_183_, final int i_184_,
			final int i_185_) {
		try {
			for (int i_186_ = 0; numVertices > i_186_; i_186_++) {
				if (((i_183_ ^ 0xffffffff) == (verticesX[i_186_] ^ 0xffffffff))
						&& ((verticesY[i_186_] ^ 0xffffffff) == (i_184_ ^ 0xffffffff))
						&& i_185_ == verticesZ[i_186_]) {
					return i_186_;
				}
			}
			verticesX[numVertices] = i_183_;
			verticesY[numVertices] = i_184_;
			verticesZ[numVertices] = i_185_;
			maxDepth = numVertices + 1;
			if (i != 14418) {
				method2598(null, -77, (short) 58, 51);
			}
			return numVertices++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.N(" + i + ','
					+ i_183_ + ',' + i_184_ + ',' + i_185_ + ')'));
		}
	}

	final void method2600(final int i, final int i_187_, final byte i_188_,
			final int i_189_) {
		do {
			try {
				if ((i ^ 0xffffffff) != -1) {
					final int i_190_ = Class284_Sub2_Sub2.anIntArray6200[i];
					final int i_191_ = Class284_Sub2_Sub2.anIntArray6202[i];
					for (int i_192_ = 0; i_192_ < numVertices; i_192_++) {
						final int i_193_ = (((i_191_ * verticesX[i_192_]) + (verticesY[i_192_] * i_190_)) >> -455896722);
						verticesY[i_192_] = (-(verticesX[i_192_] * i_190_) + (verticesY[i_192_] * i_191_)) >> 1929293742;
						verticesX[i_192_] = i_193_;
					}
				}
				if ((i_187_ ^ 0xffffffff) != -1) {
					final int i_195_ = Class284_Sub2_Sub2.anIntArray6200[i_187_];
					final int i_196_ = Class284_Sub2_Sub2.anIntArray6202[i_187_];
					for (int i_197_ = 0; numVertices > i_197_; i_197_++) {
						final int i_198_ = (((verticesY[i_197_] * i_196_) + -(i_195_ * (verticesZ[i_197_]))) >> 324877006);
						verticesZ[i_197_] = ((verticesY[i_197_] * i_195_) + (verticesZ[i_197_] * i_196_)) >> -2137564178;
						verticesY[i_197_] = i_198_;
					}
				}
				if (i_189_ == 0) {
					break;
				}
				final int i_199_ = Class284_Sub2_Sub2.anIntArray6200[i_189_];
				final int i_200_ = Class284_Sub2_Sub2.anIntArray6202[i_189_];
				for (int i_201_ = 0; ((i_201_ ^ 0xffffffff) > (numVertices ^ 0xffffffff)); i_201_++) {
					final int i_202_ = ((i_199_ * verticesZ[i_201_] + (i_200_ * verticesX[i_201_])) >> 616678414);
					verticesZ[i_201_] = (verticesZ[i_201_] * i_200_ - i_199_
							* (verticesX[i_201_])) >> -1745229234;
					verticesX[i_201_] = i_202_;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lv.I(" + i
						+ ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ')'));
			}
			break;
		} while (false);
	}

	final byte method2601(final byte i, final byte i_203_, final short i_204_,
			final short i_205_, final short i_206_, final short i_207_,
			final short i_208_, final byte i_209_, final short i_210_,
			final byte i_211_) {
		try {
			if (numTextureTriangles >= 255) {
				throw new IllegalStateException();
			}
			textureRenderTypes[numTextureTriangles] = (byte) 3;
			textureTrianglePIndex[numTextureTriangles] = i_205_;
			textureTriangleMIndex[numTextureTriangles] = i_210_;
			textureTriangleNIndex[numTextureTriangles] = i_204_;
			particleDirectionX[numTextureTriangles] = i_208_;
			particleDirectionY[numTextureTriangles] = i_207_;
			particleDirectionZ[numTextureTriangles] = i_206_;
			particleLifespanX[numTextureTriangles] = i_211_;
			particleLifespanY[numTextureTriangles] = i;
			particleLifespanZ[numTextureTriangles] = i_203_;
			if (i_209_ <= 116) {
				return (byte) -112;
			}
			return (byte) numTextureTriangles++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.K(" + i + ','
					+ i_203_ + ',' + i_204_ + ',' + i_205_ + ',' + i_206_ + ','
					+ i_207_ + ',' + i_208_ + ',' + i_209_ + ',' + i_210_ + ','
					+ i_211_ + ')'));
		}
	}

	public Model() {
		numTriangles = 0;
		aByte1422 = (byte) 0;
		maxDepth = 0;
		numTextureTriangles = 0;
	}

    private boolean usesNewerHeader(byte[] data)
    {
        return (data[0] == 1 || data[0] == 0);
    }

    private boolean usesNewHeader(byte[] data)
    {
        return data[data.length - 2] == -1 && data[data.length - 1] == -1;
    }	
	
	Model(final byte[] is) {
		numTriangles = 0;
		aByte1422 = (byte) 0;
		maxDepth = 0;
		numTextureTriangles = 0;
		try {
		/*	if (is[-1 + is.length] == -1 && is[is.length + -2] == -1) {
				readNewModel(is, 1); //okay
			} else {
				readOldModel(is, -1);
			}*/
			
			
	          if (usesNewerHeader(is) && !usesNewHeader(is))
	            {
	                if (is[0] == 1) {
	                	  decodeNewModel(is);
	                } else if (is[0] == 0) {
	                	decodeOldModel(is);
	                }
	            }
	            else
	            {
	                if (usesNewHeader(is)) {
	                	readNewModel(is, 1);
	                } else {
	                	readOldModel(is, -1);
	                }
	            }
			
		//	originalColorValues = colorValues;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lv.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}//try loading a new model //oka

    void decodeNewModel(byte[] modelData)
    {
        ByteBuffer footer = new ByteBuffer(modelData);
        ByteBuffer drawTypes = new ByteBuffer(modelData);
        ByteBuffer priorities = new ByteBuffer(modelData);
        ByteBuffer alphas = new ByteBuffer(modelData);
        ByteBuffer trianglesAndVertices = new ByteBuffer(modelData);
        ByteBuffer textures = new ByteBuffer(modelData);
        ByteBuffer textureCoordinates = new ByteBuffer(modelData);

        int i = footer.readUnsignedByte((byte) -104);
        if (i != 1)
            System.out.println(i);
        else
        {
            footer.readUnsignedByte((byte) -104);// dummy read in
            version = footer.readUnsignedByte((byte) -104);// version now reads here instead

            footer.position = (modelData.length - 26);
            numVertices = footer.readUnsignedShort((byte) 127);
            numTriangles = footer.readUnsignedShort((byte) 127);
            numTextureTriangles = footer.readUnsignedShort((byte) 127);
            int footerFlags = footer.readUnsignedByte((byte) -104);
            boolean hasFillAttributes = (footerFlags & 0x1) == 1;
            boolean hasSurfaceEffects = (footerFlags & 0x2) == 2;
            boolean hasVertexNormals = (footerFlags & 0x4) == 4;
            boolean hasManyVertices = (footerFlags & 0x10) == 16;
            boolean hasManyTriangles = (footerFlags & 0x20) == 32;
            boolean hasManyVertexNormals = (footerFlags & 0x40) == 64;
            int modelPriority = footer.readUnsignedByte((byte) -104);
            int modelAlpha = footer.readUnsignedByte((byte) -104);
            int modelSkinValue = footer.readUnsignedByte((byte) -104);
            int modelTexture = footer.readUnsignedByte((byte) -104);
            int modelSkins = footer.readUnsignedByte((byte) -104);
            int modelVerticesX = footer.readUnsignedShort((byte) 127);
            int modelVerticesY = footer.readUnsignedShort((byte) 127);
            int modelVerticesZ = footer.readUnsignedShort((byte) 127);
            int modelVertexPoint = footer.readUnsignedShort((byte) 127);
            int modelTextureCoordinates = footer.readUnsignedShort((byte) 127);
            int vertices = footer.readUnsignedShort((byte) 127);
            int triangles = footer.readUnsignedShort((byte) 127);
            if (!hasManyVertices)
            {
                if (modelSkins == 1)
                    vertices = numVertices;
                else
                    vertices = 0;
            }
            if (!hasManyTriangles)
            {
                if (modelSkinValue == 1)
                    triangles = numTriangles;
                else
                    triangles = 0;
            }
            int textureAmount = 0;
            int particleAmount = 0;
            int particleColor = 0;
            if (numTextureTriangles > 0)
            {
                textureRenderTypes = new byte[numTextureTriangles];
                footer.position = 3;
                for (int triangleTextureIndex = 0; triangleTextureIndex < numTextureTriangles; triangleTextureIndex++)
                {
                    byte type = (textureRenderTypes[triangleTextureIndex] = (byte)footer
                            .readSignedByte((byte) -19));
                    if (type == 0)
                        textureAmount++;
                    if (type >= 1 && type <= 3)
                        particleAmount++;
                    if (type == 2)
                        particleColor++;
                }
            }
            int pos = 3 + numTextureTriangles;// now it adds 3 to starting pos
            int vertexModOffset = pos;
            pos += numVertices;
            int triangleDrawTypeBasePos = pos;
            if (hasFillAttributes)
                pos += numTriangles;
            int triMeshLinkOffset = pos;
            pos += numTriangles;
            int facePriorityBasePos = pos;
            if (modelPriority == 255)
                pos += numTriangles;
            int triangleBasePos = pos;
            pos += triangles;
            int verticesBasePos = pos;
            pos += vertices;
            int alphaBasePos = pos;
            if (modelAlpha == 1)
                pos += numTriangles;
            int triangleVertexPointOffset = pos;
            pos += modelVertexPoint;
            int textureBasePos = pos;
            if (modelTexture == 1)
                pos += numTriangles * 2;
            int textureCoordBasePos = pos;
            pos += modelTextureCoordinates;
            int triangleColourOrTextureBasePos = pos;
            pos += numTriangles * 2;
            int vertexXPos = pos;
            pos += modelVerticesX;
            int vertexYPos = pos;
            pos += modelVerticesY;
            int vertexZPos = pos;
            pos += modelVerticesZ;
            int textureInfoBasePos = pos;
            pos += textureAmount * 6;
            int particleInfoBasePos = pos;
            pos += particleAmount * 6;
            int modelVersionType = 6;
            if (version == 14)
                modelVersionType = 7;
            else if (version >= 15)
                modelVersionType = 9;
            int i_93_ = pos;
            pos += particleAmount * modelVersionType;
            int i_94_ = pos;
            pos += particleAmount;
            int i_95_ = pos;
            pos += particleAmount;
            int i_96_ = pos;
            pos += particleAmount + particleColor * 2;
            int footerPosition = pos;
            verticesX = new int[numVertices];
            verticesY = new int[numVertices];
            verticesZ = new int[numVertices];
            triangleViewspaceX = new short[numTriangles];
            triangleViewspaceY = new short[numTriangles];
            triangleViewspaceZ = new short[numTriangles];
            if (modelSkins == 1)
                vertexSkins = new int[numVertices];
            if (hasFillAttributes)
                faceRenderType = new byte[numTriangles];
            if (modelPriority == 255)
                trianglePriorities = new byte[numTriangles];
            else
            	aByte1422 = (byte)modelPriority;
            if (modelAlpha == 1)
                faceAlpha = new byte[numTriangles];
            if (modelSkinValue == 1)
                triangleSkinValues = new int[numTriangles];
            if (modelTexture == 1)
                faceTexture = new short[numTriangles];
            if (modelTexture == 1 && numTextureTriangles > 0)
                textureCoords = new byte[numTriangles];
            colorValues = new short[numTriangles];
            if (numTextureTriangles > 0)
            {
                textureTrianglePIndex = new short[numTextureTriangles];
                textureTriangleMIndex = new short[numTextureTriangles];
                textureTriangleNIndex = new short[numTextureTriangles];
                if (particleAmount > 0)
                {
                    particleDirectionX = new int[particleAmount];
                    particleDirectionY = new int[particleAmount];
                    particleDirectionZ = new int[particleAmount];
                    particleLifespanX = new byte[particleAmount];
                    particleLifespanY = new byte[particleAmount];
                    particleLifespanZ = new int[particleAmount];
                }
                if (particleColor > 0)
                {
                    anIntArray1397 = new int[particleColor];
                    anIntArray1386 = new int[particleColor];
                }
            }
            footer.position = vertexModOffset;
            drawTypes.position = vertexXPos;
            priorities.position = vertexYPos;
            alphas.position = vertexZPos;
            trianglesAndVertices.position = verticesBasePos;
            int vertexX = 0;
            int vertexY = 0;
            int vertexZ = 0;
            for (int point = 0; point < numVertices; point++)
            {
                int vertexFlags = footer.readUnsignedByte((byte) -104);
                int vertexXOffset = 0;
                if ((vertexFlags & 0x1) != 0)
                    vertexXOffset = drawTypes.method1239(40);
                int vertexYOffset = 0;
                if ((vertexFlags & 0x2) != 0)
                    vertexYOffset = priorities.method1239(40);
                int vertexZOffset = 0;
                if ((vertexFlags & 0x4) != 0)
                    vertexZOffset = alphas.method1239(40);
                verticesX[point] = vertexX + vertexXOffset;
                verticesY[point] = vertexY + vertexYOffset;
                verticesZ[point] = vertexZ + vertexZOffset;
                vertexX = verticesX[point];
                vertexY = verticesY[point];
                vertexZ = verticesZ[point];
                if (modelSkins == 1)
                {
                    if (hasManyVertices)
                        vertexSkins[point] = trianglesAndVertices.readSpecialSmart();
                    else
                    {
                        vertexSkins[point] = trianglesAndVertices
                                .readUnsignedByte((byte) -104);
                        if (vertexSkins[point] == 255)
                            vertexSkins[point] = -1;
                    }
                }
            }
            footer.position = triangleColourOrTextureBasePos;
            drawTypes.position = triangleDrawTypeBasePos;
            priorities.position = facePriorityBasePos;
            alphas.position = alphaBasePos;
            trianglesAndVertices.position = triangleBasePos;
            textures.position = textureBasePos;
            textureCoordinates.position = textureCoordBasePos;
            for (int i_106_ = 0; i_106_ < numTriangles; i_106_++)
            {
                colorValues[i_106_] = (short)footer.readUnsignedShort((byte) 127);
                if (hasFillAttributes)
                    faceRenderType[i_106_] = (byte)drawTypes.readSignedByte((byte) -19);
                if (modelPriority == 255)
                    trianglePriorities[i_106_] = (byte)priorities.readSignedByte((byte) -19);
                if (modelAlpha == 1)
                    faceAlpha[i_106_] = (byte)alphas.readSignedByte((byte) -19);
                if (modelSkinValue == 1)
                {
                    if (hasManyTriangles)
                        triangleSkinValues[i_106_] = trianglesAndVertices
                                .readSpecialSmart();
                    else
                    {
                        triangleSkinValues[i_106_] = trianglesAndVertices
                                .readUnsignedByte((byte) -104);
                        if (triangleSkinValues[i_106_] == 255)
                            triangleSkinValues[i_106_] = -1;
                    }
                }
                if (modelTexture == 1)
                    faceTexture[i_106_] = (short)(textures.readUnsignedShort((byte) 127) - 1);
                if (textureCoords != null)
                {
                    if (faceTexture[i_106_] != -1)
                    {
                        if (version >= 16)
                            textureCoords[i_106_] = (byte)(textureCoordinates
                                    .readSmart() - 1);
                        else
                            textureCoords[i_106_] = (byte)(textureCoordinates
                                    .readUnsignedByte((byte) -104) - 1);
                    }
                    else
                        textureCoords[i_106_] = (short)-1;
                }
            }
            maxDepth = -1;
            footer.position = triangleVertexPointOffset;
            drawTypes.position = triMeshLinkOffset;
            calculateMaxDepth(footer, drawTypes);
            footer.position = textureInfoBasePos;
            drawTypes.position = particleInfoBasePos;
            priorities.position = i_93_;
            alphas.position = i_94_;
            trianglesAndVertices.position = i_95_;
            textures.position = i_96_;
            decodeTexturedTriangles(footer, drawTypes, priorities, alphas,
                    trianglesAndVertices, textures);
            footer.position = footerPosition;
                if (hasSurfaceEffects)
                {
                    int faceAmount = footer.readUnsignedByte((byte) -104);
                    if (faceAmount > 0)
                    {
                        surfaces = new Surface[faceAmount];
                        for (int face = 0; face < faceAmount; face++)
                        {
                            int faceId = footer.readUnsignedShort((byte) 127);
                            int point = footer.readUnsignedShort((byte) 127);
                            byte pri;
                            if (modelPriority == 255)
                                pri = trianglePriorities[point];
                            else
                                pri = (byte)modelPriority;
                            surfaces[face] = new Surface(faceId, 
                                    triangleViewspaceX[point],
                                    triangleViewspaceY[point],
                                    triangleViewspaceZ[point], (byte)pri);
                        }
                    }
                    int skinAmount = footer.readUnsignedByte((byte) -104);
                    if (skinAmount > 0)
                    {
                        surfaceSkins = new SurfaceSkin[skinAmount];
                        for (int face = 0; face < skinAmount; face++)
                        {
                            int skin = footer.readUnsignedShort((byte) 127);
                            int point = footer.readUnsignedShort((byte) 127);
                            surfaceSkins[face] = new SurfaceSkin(skin, point);
                        }
                    }
                }
                if (hasVertexNormals)
                {
                    int vertexNormalAmount = footer.readUnsignedByte((byte) -104);
                    if (vertexNormalAmount > 0)
                    {
                        isolatedVertexNormals = new VertexNormal[vertexNormalAmount];
                        for (int vertex = 0; vertex < vertexNormalAmount; vertex++)
                        {
                            int x = footer.readUnsignedShort((byte) 127);
                            int y = footer.readUnsignedShort((byte) 127);
                            int z;
                            if (hasManyVertexNormals)
                                z = footer.readSpecialSmart();
                            else
                            {
                                z = footer.readUnsignedByte((byte) -104);
                                if (z == 255)
                                    z = -1;
                            }
                            byte divisor = (byte)footer.readSignedByte((byte) -19);
                            isolatedVertexNormals[vertex] = new VertexNormal(x,
                                    y, z, (byte)divisor);
                        }
                    }
                }
        }
        faceTexture = null;
    }

    void decodeTexturedTriangles(ByteBuffer class219_sub41,
            ByteBuffer class219_sub41_244_,
            ByteBuffer class219_sub41_245_,
            ByteBuffer class219_sub41_246_,
            ByteBuffer class219_sub41_247_,
            ByteBuffer class219_sub41_248_)
    {
        for (int i = 0; i < numTextureTriangles; i++)
        {
            int type = textureRenderTypes[i] & 0xff;
            if (type == 0)
            {
                textureTrianglePIndex[i] = (short)class219_sub41
                        .readUnsignedShort((byte) 127);
                textureTriangleMIndex[i] = (short)class219_sub41
                        .readUnsignedShort((byte) 127);
                textureTriangleNIndex[i] = (short)class219_sub41
                        .readUnsignedShort((byte) 127);
            }
            if (type == 1)
            {
                textureTrianglePIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleMIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleNIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                if (version < 15)
                {
                    particleDirectionX[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                    if (version < 14)
                        particleDirectionY[i] = class219_sub41_245_
                                .readUnsignedShort((byte) 127);
                    else
                        particleDirectionY[i] = class219_sub41_245_
                                .readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                }
                else
                {
                    particleDirectionX[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionY[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_.readMediumInt(-123);
                }
                particleLifespanX[i] = (byte)class219_sub41_246_.readSignedByte((byte) -19);
                particleLifespanY[i] = (byte)class219_sub41_247_.readSignedByte((byte) -19);
                particleLifespanZ[i] = class219_sub41_248_.readSignedByte((byte) -19);
            }
            if (type == 2)
            {
                textureTrianglePIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleMIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleNIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                if (version < 15)
                {
                    particleDirectionX[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                    if (version < 14)
                        particleDirectionY[i] = class219_sub41_245_
                                .readUnsignedShort((byte) 127);
                    else
                        particleDirectionY[i] = class219_sub41_245_
                                .readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                }
                else
                {
                    particleDirectionX[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionY[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_.readMediumInt(-123);
                }
                particleLifespanX[i] = (byte)class219_sub41_246_.readSignedByte((byte) -19);
                particleLifespanY[i] = (byte)class219_sub41_247_.readSignedByte((byte) -19);
                particleLifespanZ[i] = class219_sub41_248_.readSignedByte((byte) -19);
                anIntArray1397[i] = class219_sub41_248_.readSignedByte((byte) -19);
                anIntArray1386[i] = class219_sub41_248_.readSignedByte((byte) -19);
            }
            if (type == 3)
            {
                textureTrianglePIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleMIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                textureTriangleNIndex[i] = (short)class219_sub41_244_
                        .readUnsignedShort((byte) 127);
                if (version < 15)
                {
                    particleDirectionX[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                    if (version < 14)
                        particleDirectionY[i] = class219_sub41_245_
                                .readUnsignedShort((byte) 127);
                    else
                        particleDirectionY[i] = class219_sub41_245_
                                .readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_
                            .readUnsignedShort((byte) 127);
                }
                else
                {
                    particleDirectionX[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionY[i] = class219_sub41_245_.readMediumInt(-123);
                    particleDirectionZ[i] = class219_sub41_245_.readMediumInt(-123);
                }
                particleLifespanX[i] = (byte)class219_sub41_246_.readSignedByte((byte) -19);
                particleLifespanY[i] = (byte)class219_sub41_247_.readSignedByte((byte) -19);
                particleLifespanZ[i] = class219_sub41_248_.readSignedByte((byte) -19);
            }
        }
    }

    void calculateMaxDepth(ByteBuffer class219_sub41,
            ByteBuffer class219_sub41_122_)
    {
        short functionX = 0;
        short functionY = 0;
        short functionZ = 0;
        int previousZView = 0;
        for (int tri = 0; tri < numTriangles; tri++)
        {
            int i_127_ = class219_sub41_122_.readUnsignedByte((byte) -104);
            if (i_127_ == 1)
            {
                functionX = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionX;
                functionY = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionY;
                functionZ = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionZ;
                triangleViewspaceX[tri] = functionX;
                triangleViewspaceY[tri] = functionY;
                triangleViewspaceZ[tri] = functionZ;
                if (functionX > maxDepth)
                    maxDepth = functionX;
                if (functionY > maxDepth)
                    maxDepth = functionY;
                if (functionZ > maxDepth)
                    maxDepth = functionZ;
            }
            if (i_127_ == 2)
            {
                functionY = functionZ;
                functionZ = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionZ;
                triangleViewspaceX[tri] = functionX;
                triangleViewspaceY[tri] = functionY;
                triangleViewspaceZ[tri] = functionZ;
                if (functionZ > maxDepth)
                    maxDepth = functionZ;
            }
            if (i_127_ == 3)
            {
                functionX = functionZ;
                functionZ = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionZ;
                triangleViewspaceX[tri] = functionX;
                triangleViewspaceY[tri] = functionY;
                triangleViewspaceZ[tri] = functionZ;
                if (functionZ > maxDepth)
                    maxDepth = functionZ;
            }
            if (i_127_ == 4)
            {
                short i_128_ = functionX;
                functionX = functionY;
                functionY = i_128_;
                functionZ = (short)(class219_sub41.method1239(120) + previousZView);
                previousZView = functionZ;
                triangleViewspaceX[tri] = functionX;
                triangleViewspaceY[tri] = functionY;
                triangleViewspaceZ[tri] = functionZ;
                if (functionZ > maxDepth)
                    maxDepth = functionZ;
            }
        }
        maxDepth++;
    }

    void decodeOldModel(byte[] instream)
    {
        boolean bool1 = false;
        boolean bool_136_ = false;
        ByteBuffer footer = new ByteBuffer(instream);
        ByteBuffer class219_sub41_137_ = new ByteBuffer(instream);
        ByteBuffer class219_sub41_138_ = new ByteBuffer(instream);
        ByteBuffer class219_sub41_139_ = new ByteBuffer(instream);
        ByteBuffer class219_sub41_140_ = new ByteBuffer(instream);
        int i = footer.readUnsignedByte((byte) -104);
        if (i != 0)
            System.out.println(i);
        else
        {
            footer.position = (instream.length - 18);
            numVertices = footer.readUnsignedShort((byte) 127);
            numTriangles = footer.readUnsignedShort((byte) 127);
            numTextureTriangles = footer.readUnsignedByte((byte) -104);
            int useTexturesFlag = footer.readUnsignedByte((byte) -104);
            int useTrianglePrioritiesFlag = footer.readUnsignedByte((byte) -104);
            int useTransparencyFlag = footer.readUnsignedByte((byte) -104);
            int useTriangleSkinningFlag = footer.readUnsignedByte((byte) -104);
            int useVertexSkinningFlag = footer.readUnsignedByte((byte) -104);
            int xDataLength = footer.readUnsignedShort((byte) 127);
            int yDataLength = footer.readUnsignedShort((byte) 127);
            int zDataLength = footer.readUnsignedShort((byte) 127);
            int triangleDataLength = footer.readUnsignedShort((byte) 127);
            int i_150_ = 0;
            int i_151_ = i_150_;
            i_150_ += numVertices;
            int i_152_ = i_150_;
            i_150_ += numTriangles;
            int i_153_ = i_150_;
            if (useTrianglePrioritiesFlag == 255)
                i_150_ += numTriangles;
            int i_154_ = i_150_;
            if (useTriangleSkinningFlag == 1)
                i_150_ += numTriangles;
            int i_155_ = i_150_;
            if (useTexturesFlag == 1)
                i_150_ += numTriangles;
            int i_156_ = i_150_;
            if (useVertexSkinningFlag == 1)
                i_150_ += numVertices;
            int i_157_ = i_150_;
            if (useTransparencyFlag == 1)
                i_150_ += numTriangles;
            int i_158_ = i_150_;
            i_150_ += triangleDataLength;
            int i_159_ = i_150_;
            i_150_ += numTriangles * 2;
            int i_160_ = i_150_;
            i_150_ += numTextureTriangles * 6;
            int i_161_ = i_150_;
            i_150_ += xDataLength;
            int i_162_ = i_150_;
            i_150_ += yDataLength;
            int i_163_ = i_150_;
            i_150_ += zDataLength;
            verticesX = new int[numVertices];
            verticesY = new int[numVertices];
            verticesZ = new int[numVertices];
            triangleViewspaceX = new short[numTriangles];
            triangleViewspaceY = new short[numTriangles];
            triangleViewspaceZ = new short[numTriangles];
            if (numTextureTriangles > 0)
            {
                textureRenderTypes = new byte[numTextureTriangles];
                textureTrianglePIndex = new short[numTextureTriangles];
                textureTriangleMIndex = new short[numTextureTriangles];
                textureTriangleNIndex = new short[numTextureTriangles];
            }
            if (useVertexSkinningFlag == 1)
                vertexSkins = new int[numVertices];
            if (useTexturesFlag == 1)
            {
                faceRenderType = new byte[numTriangles];
                textureCoords = new byte[numTriangles];
                faceTexture = new short[numTriangles];
            }
            if (useTrianglePrioritiesFlag == 255)
                trianglePriorities = new byte[numTriangles];
            else
            	aByte1422 = (byte)useTrianglePrioritiesFlag;
            if (useTransparencyFlag == 1)
                faceAlpha = new byte[numTriangles];
            if (useTriangleSkinningFlag == 1)
                triangleSkinValues = new int[numTriangles];
            colorValues = new short[numTriangles];
            footer.position = i_151_;
            class219_sub41_137_.position = i_161_;
            class219_sub41_138_.position = i_162_;
            class219_sub41_139_.position = i_163_;
            class219_sub41_140_.position = i_156_;
            int i_164_ = 0;
            int i_165_ = 0;
            int i_166_ = 0;
            for (int i_167_ = 0; i_167_ < numVertices; i_167_++)
            {
                int i_168_ = footer.readUnsignedByte((byte) -104);
                int i_169_ = 0;
                if ((i_168_ & 0x1) != 0)
                    i_169_ = class219_sub41_137_.method1239(40);
                int i_170_ = 0;
                if ((i_168_ & 0x2) != 0)
                    i_170_ = class219_sub41_138_.method1239(40);
                int i_171_ = 0;
                if ((i_168_ & 0x4) != 0)
                    i_171_ = class219_sub41_139_.method1239(40);
                verticesX[i_167_] = i_164_ + i_169_;
                verticesY[i_167_] = i_165_ + i_170_;
                verticesZ[i_167_] = i_166_ + i_171_;
                i_164_ = verticesX[i_167_];
                i_165_ = verticesY[i_167_];
                i_166_ = verticesZ[i_167_];
                if (useVertexSkinningFlag == 1)
                    vertexSkins[i_167_] = class219_sub41_140_.readUnsignedByte((byte) -104);
            }
            footer.position = i_159_;
            class219_sub41_137_.position = i_155_;
            class219_sub41_138_.position = i_153_;
            class219_sub41_139_.position = i_157_;
            class219_sub41_140_.position = i_154_;
            for (int i_172_ = 0; i_172_ < numTriangles; i_172_++)
            {
                colorValues[i_172_] = (short)footer.readUnsignedShort((byte) 127);
               
                if (useTexturesFlag == 1)
                {
                    int i_173_ = class219_sub41_137_.readUnsignedByte((byte) -104);
                    if ((i_173_ & 0x1) == 1)
                    {
                        faceRenderType[i_172_] = (byte)1;
                        bool1 = true;
                    }
                    else
                        faceRenderType[i_172_] = (byte)0;
                    if ((i_173_ & 0x2) == 2)
                    {
                        textureCoords[i_172_] = (byte)(i_173_ >> 2);
                        faceTexture[i_172_] = colorValues[i_172_];
                        colorValues[i_172_] = (short)127;
                        if (faceTexture[i_172_] != -1)
                            bool_136_ = true;
                    }
                    else
                    {
                        textureCoords[i_172_] = (short)-1;
                        faceTexture[i_172_] = (short)-1;
                    }
                }
                if (useTrianglePrioritiesFlag == 255)
                    trianglePriorities[i_172_] = (byte)class219_sub41_138_
                            .readSignedByte((byte) -19);
                if (useTransparencyFlag == 1)
                    faceAlpha[i_172_] = (byte)class219_sub41_139_.readSignedByte((byte) -19);
                if (useTriangleSkinningFlag == 1)
                    triangleSkinValues[i_172_] = class219_sub41_140_
                            .readUnsignedByte((byte) -104);
            }
            maxDepth = -1;
            footer.position = i_158_;
            class219_sub41_137_.position = i_152_;
            short i_174_ = 0;
            short i_175_ = 0;
            short i_176_ = 0;
            int i_177_ = 0;
            for (int i_178_ = 0; i_178_ < numTriangles; i_178_++)
            {
                int i_179_ = class219_sub41_137_.readUnsignedByte((byte) -104);
                if (i_179_ == 1)
                {
                    i_174_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_174_;
                    i_175_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_175_;
                    i_176_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_176_;
                    triangleViewspaceX[i_178_] = i_174_;
                    triangleViewspaceY[i_178_] = i_175_;
                    triangleViewspaceZ[i_178_] = i_176_;
                    if (i_174_ > maxDepth)
                        maxDepth = i_174_;
                    if (i_175_ > maxDepth)
                        maxDepth = i_175_;
                    if (i_176_ > maxDepth)
                        maxDepth = i_176_;
                }
                if (i_179_ == 2)
                {
                    i_175_ = i_176_;
                    i_176_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_176_;
                    triangleViewspaceX[i_178_] = i_174_;
                    triangleViewspaceY[i_178_] = i_175_;
                    triangleViewspaceZ[i_178_] = i_176_;
                    if (i_176_ > maxDepth)
                        maxDepth = i_176_;
                }
                if (i_179_ == 3)
                {
                    i_174_ = i_176_;
                    i_176_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_176_;
                    triangleViewspaceX[i_178_] = i_174_;
                    triangleViewspaceY[i_178_] = i_175_;
                    triangleViewspaceZ[i_178_] = i_176_;
                    if (i_176_ > maxDepth)
                        maxDepth = i_176_;
                }
                if (i_179_ == 4)
                {
                    short i_180_ = i_174_;
                    i_174_ = i_175_;
                    i_175_ = i_180_;
                    i_176_ = (short)(footer.method1239(120) + i_177_);
                    i_177_ = i_176_;
                    triangleViewspaceX[i_178_] = i_174_;
                    triangleViewspaceY[i_178_] = i_175_;
                    triangleViewspaceZ[i_178_] = i_176_;
                    if (i_176_ > maxDepth)
                        maxDepth = i_176_;
                }
            }
            maxDepth++;
            footer.position = i_160_;
            for (int i_181_ = 0; i_181_ < numTextureTriangles; i_181_++)
            {
                textureRenderTypes[i_181_] = (byte)0;
                textureTrianglePIndex[i_181_] = (short)footer
                        .readUnsignedShort((byte) 127);
                textureTriangleMIndex[i_181_] = (short)footer
                        .readUnsignedShort((byte) 127);
                textureTriangleNIndex[i_181_] = (short)footer
                        .readUnsignedShort((byte) 127);
            }
            if (textureCoords != null)
            {
                boolean bool_182_ = false;
                for (int i_183_ = 0; i_183_ < numTriangles; i_183_++)
                {
                    int i_184_ = textureCoords[i_183_] & 0xff;
                    if (i_184_ != 255)
                    {
                        if (((textureTrianglePIndex[i_184_] & 0xffff) == triangleViewspaceX[i_183_])
                                && ((textureTriangleMIndex[i_184_] & 0xffff) == triangleViewspaceY[i_183_])
                                && ((textureTriangleNIndex[i_184_] & 0xffff) == triangleViewspaceZ[i_183_]))
                            textureCoords[i_183_] = (short)-1;
                        else
                            bool_182_ = true;
                    }
                }
                if (!bool_182_)
                    textureCoords = null;
            }
            if (!bool_136_)
                faceTexture = null;
            if (!bool1)
                faceRenderType = null;
        }
    }


	Model(final int i, final int i_212_, final int i_213_) {
		numTriangles = 0;
		aByte1422 = (byte) 0;
		maxDepth = 0;
		numTextureTriangles = 0;
		try {
			textureCoords = new byte[i_212_];
			verticesX = new int[i];
			trianglePriorities = new byte[i_212_];
			verticesZ = new int[i];
			verticesY = new int[i];
			faceRenderType = new byte[i_212_];
			triangleSkinValues = new int[i_212_];
			colorValues = new short[i_212_];
			triangleViewspaceY = new short[i_212_];
			triangleViewspaceX = new short[i_212_];
			vertexSkins = new int[i];
			faceAlpha = new byte[i_212_];
			if (i_213_ > 0) {
				particleLifespanY = new byte[i_213_];
				particleLifespanX = new byte[i_213_];
				particleLifespanZ = new int[i_213_];
				textureTriangleNIndex = new short[i_213_];
				anIntArray1386 = new int[i_213_];
				particleDirectionZ = new int[i_213_];
				anIntArray1397 = new int[i_213_];
				textureRenderTypes = new byte[i_213_];
				particleDirectionY = new int[i_213_];
				textureTriangleMIndex = new short[i_213_];
				particleDirectionX = new int[i_213_];
				textureTrianglePIndex = new short[i_213_];
			}
			faceTexture = new short[i_212_];
			triangleViewspaceZ = new short[i_212_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.<init>(" + i
					+ ',' + i_212_ + ',' + i_213_ + ')'));
		}
	}

	Model(final Model[] class178s, final int i) {
		numTriangles = 0;
		aByte1422 = (byte) 0;
		maxDepth = 0;
		numTextureTriangles = 0;
		try {
			numVertices = 0;
			numTriangles = 0;
			numTextureTriangles = 0;
			int i_214_ = 0;
			int i_215_ = 0;
			int i_216_ = 0;
			boolean bool = false;
			boolean bool_217_ = false;
			boolean bool_218_ = false;
			boolean bool_219_ = false;
			boolean bool_220_ = false;
			aByte1422 = (byte) -1;
			boolean bool_221_ = false;
			for (int i_222_ = 0; i_222_ < i; i_222_++) {
				final Model class178_223_ = class178s[i_222_];
				if (class178_223_ != null) {
					numTriangles += class178_223_.numTriangles;
					numVertices += class178_223_.numVertices;
					numTextureTriangles += class178_223_.numTextureTriangles;
					if (class178_223_.surfaces != null) {
						i_214_ += (class178_223_.surfaces).length;
					}
					if (class178_223_.isolatedVertexNormals != null) {
						i_216_ += (class178_223_.isolatedVertexNormals).length;
					}
					bool = bool | (class178_223_.faceRenderType != null);
					if (class178_223_.surfaceSkins != null) {
						i_215_ += (class178_223_.surfaceSkins).length;
					}
					bool_220_ = bool_220_
							| (class178_223_.faceTexture) != null;
					bool_219_ = bool_219_
							| (class178_223_.textureCoords) != null;
					bool_218_ = bool_218_
							| (class178_223_.faceAlpha) != null;
					if (class178_223_.trianglePriorities != null) {
						bool_217_ = true;
					} else {
						if ((aByte1422 ^ 0xffffffff) == 0) {
							aByte1422 = class178_223_.aByte1422;
						}
						if ((aByte1422 ^ 0xffffffff) != (class178_223_.aByte1422 ^ 0xffffffff)) {
							bool_217_ = true;
						}
					}
					bool_221_ = bool_221_
							| (class178_223_.triangleSkinValues) != null;
				}
			}
			triangleViewspaceY = new short[numTriangles];
			triangleViewspaceZ = new short[numTriangles];
			verticesZ = new int[numVertices];
			if (bool_221_) {
				triangleSkinValues = new int[numTriangles];
			}
			verticesY = new int[numVertices];
			if ((i_215_ ^ 0xffffffff) < -1) {
				surfaceSkins = new SurfaceSkin[i_215_];
			}
			if (bool_218_) {
				faceAlpha = new byte[numTriangles];
			}
			vertexSkins = new int[numVertices];
			aShortArray1394 = new short[numTriangles];
			if (bool_220_) {
				faceTexture = new short[numTriangles];
			}
			if (bool_217_) {
				trianglePriorities = new byte[numTriangles];
			}
			if ((numTextureTriangles ^ 0xffffffff) < -1) {
				textureTrianglePIndex = new short[numTextureTriangles];
				textureRenderTypes = new byte[numTextureTriangles];
				particleLifespanY = new byte[numTextureTriangles];
				particleDirectionZ = new int[numTextureTriangles];
				particleLifespanX = new byte[numTextureTriangles];
				textureTriangleNIndex = new short[numTextureTriangles];
				anIntArray1386 = new int[numTextureTriangles];
				anIntArray1397 = new int[numTextureTriangles];
				textureTriangleMIndex = new short[numTextureTriangles];
				particleLifespanZ = new int[numTextureTriangles];
				particleDirectionX = new int[numTextureTriangles];
				particleDirectionY = new int[numTextureTriangles];
			}
			if (i_214_ > 0) {
				surfaces = new Surface[i_214_];
			}
			if (bool_219_) {
				textureCoords = new byte[numTriangles];
			}
			aShortArray1408 = new short[numVertices];
			verticesX = new int[numVertices];
			colorValues = new short[numTriangles];
			if (bool) {
				faceRenderType = new byte[numTriangles];
			}
			triangleViewspaceX = new short[numTriangles];
			if (i_216_ > 0) {
				isolatedVertexNormals = new VertexNormal[i_216_];
			}
			numVertices = 0;
			numTextureTriangles = 0;
			i_214_ = 0;
			i_216_ = 0;
			numTriangles = 0;
			i_215_ = 0;
			for (int i_224_ = 0; i > i_224_; i_224_++) {
				final short i_225_ = (short) (1 << i_224_);
				final Model class178_226_ = class178s[i_224_];
				if (class178_226_ != null) {
					if (class178_226_.isolatedVertexNormals != null) {
						for (int i_227_ = 0; (((class178_226_.isolatedVertexNormals).length ^ 0xffffffff) < (i_227_ ^ 0xffffffff)); i_227_++) {
							final VertexNormal vertexNormal = (class178_226_.isolatedVertexNormals[i_227_]);
							isolatedVertexNormals[i_216_++] = vertexNormal.method1719(
									((numTriangles) + (vertexNormal.anInt906)), -125);
						}
					}
					for (int i_228_ = 0; ((i_228_ ^ 0xffffffff) > (class178_226_.numTriangles ^ 0xffffffff)); i_228_++) {
						if (bool && (class178_226_.faceRenderType != null)) {
							faceRenderType[(numTriangles)] = (class178_226_.faceRenderType[i_228_]);
						}
						if (bool_217_) {
							if (class178_226_.trianglePriorities != null) {
								trianglePriorities[numTriangles] = (class178_226_.trianglePriorities[i_228_]);
							} else {
								trianglePriorities[numTriangles] = class178_226_.aByte1422;
							}
						}
						if (bool_218_ && (class178_226_.faceAlpha != null)) {
							faceAlpha[(numTriangles)] = (class178_226_.faceAlpha[i_228_]);
						}
						if (bool_220_) {
							if (class178_226_.faceTexture == null) {
								faceTexture[numTriangles] = (short) -1;
							} else {
								faceTexture[numTriangles] = (class178_226_.faceTexture[i_228_]);
							}
						}
						if (bool_221_) {
							if (class178_226_.triangleSkinValues != null) {
								triangleSkinValues[numTriangles] = (class178_226_.triangleSkinValues[i_228_]);
							} else {
								triangleSkinValues[numTriangles] = -1;
							}
						}
						triangleViewspaceX[(numTriangles)] = (short) method2598(
								class178_226_,
								(class178_226_.triangleViewspaceX[i_228_]),
								i_225_, 0);
						triangleViewspaceY[(numTriangles)] = (short) method2598(
								class178_226_,
								(class178_226_.triangleViewspaceY[i_228_]),
								i_225_, 0);
						triangleViewspaceZ[(numTriangles)] = (short) method2598(
								class178_226_,
								(class178_226_.triangleViewspaceZ[i_228_]),
								i_225_, 0);
						aShortArray1394[(numTriangles)] = i_225_;
						colorValues[(numTriangles)] = (class178_226_.colorValues[i_228_]);
						numTriangles++;
					}
					if (class178_226_.surfaces != null) {
						for (int i_229_ = 0; ((class178_226_.surfaces).length > i_229_); i_229_++) {
							final int i_230_ = method2598(
									class178_226_,
									((class178_226_.surfaces[i_229_]).anInt666),
									i_225_, 0);
							final int i_231_ = method2598(
									class178_226_,
									((class178_226_.surfaces[i_229_]).anInt661),
									i_225_, 0);
							final int i_232_ = method2598(
									class178_226_,
									((class178_226_.surfaces[i_229_]).anInt674),
									i_225_, 0);
							surfaces[i_214_] = class178_226_.surfaces[i_229_]
									.method857(i_230_, true, i_232_, i_231_);
							i_214_++;
						}
					}
					if (class178_226_.surfaceSkins != null) {
						for (int i_233_ = 0; ((i_233_ ^ 0xffffffff) > ((class178_226_.surfaceSkins).length ^ 0xffffffff)); i_233_++) {
							final int i_234_ = method2598(
									class178_226_,
									((class178_226_.surfaceSkins[i_233_]).anInt327),
									i_225_, 0);
							surfaceSkins[i_215_] = class178_226_.surfaceSkins[i_233_]
									.method336(-1854, i_234_);
							i_215_++;
						}
					}
				}
			}
			int i_235_ = 0;
			maxDepth = numVertices;
			for (int i_236_ = 0; i > i_236_; i_236_++) {
				final short i_237_ = (short) (1 << i_236_);
				final Model class178_238_ = class178s[i_236_];
				if (class178_238_ != null) {
					for (int i_239_ = 0; class178_238_.numTriangles > i_239_; i_239_++) {
						if (bool_219_) {
							textureCoords[i_235_++] = (byte) (((class178_238_.textureCoords) != null && (class178_238_.textureCoords[i_239_]) != -1) ? ((class178_238_.textureCoords[i_239_]) + numTextureTriangles)
									: -1);
						}
					}
					for (int i_240_ = 0; i_240_ < class178_238_.numTextureTriangles; i_240_++) {
						final byte i_241_ = (textureRenderTypes[numTextureTriangles] = (class178_238_.textureRenderTypes[i_240_]));
						if ((i_241_ ^ 0xffffffff) == -1) {
							textureTrianglePIndex[numTextureTriangles] = (short) method2598(
									class178_238_,
									(class178_238_.textureTrianglePIndex[i_240_]),
									i_237_, 0);
							textureTriangleMIndex[numTextureTriangles] = (short) method2598(
									class178_238_,
									(class178_238_.textureTriangleMIndex[i_240_]),
									i_237_, 0);
							textureTriangleNIndex[numTextureTriangles] = (short) method2598(
									class178_238_,
									(class178_238_.textureTriangleNIndex[i_240_]),
									i_237_, 0);
						}
						if ((i_241_ ^ 0xffffffff) <= -2
								&& (i_241_ ^ 0xffffffff) >= -4) {
							textureTrianglePIndex[numTextureTriangles] = (class178_238_.textureTrianglePIndex[i_240_]);
							textureTriangleMIndex[numTextureTriangles] = (class178_238_.textureTriangleMIndex[i_240_]);
							textureTriangleNIndex[numTextureTriangles] = (class178_238_.textureTriangleNIndex[i_240_]);
							particleDirectionX[(numTextureTriangles)] = (class178_238_.particleDirectionX[i_240_]);
							particleDirectionY[(numTextureTriangles)] = (class178_238_.particleDirectionY[i_240_]);
							particleDirectionZ[(numTextureTriangles)] = (class178_238_.particleDirectionZ[i_240_]);
							particleLifespanX[(numTextureTriangles)] = (class178_238_.particleLifespanX[i_240_]);
							particleLifespanY[(numTextureTriangles)] = (class178_238_.particleLifespanY[i_240_]);
							particleLifespanZ[(numTextureTriangles)] = (class178_238_.particleLifespanZ[i_240_]);
						}
						if ((i_241_ ^ 0xffffffff) == -3) {
							anIntArray1397[(numTextureTriangles)] = (class178_238_.anIntArray1397[i_240_]);
							anIntArray1386[(numTextureTriangles)] = (class178_238_.anIntArray1386[i_240_]);
						}
						numTextureTriangles++;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lv.<init>("
					+ (class178s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
