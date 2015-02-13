/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class PacketSender implements Runnable {
	private byte[] aByteArray2568;
	private IOException anIOException2569;
	private int anInt2570;
	private Thread aThread2571;
	private int anInt2572;
	private OutputStream anOutputStream2573;
	private int anInt2574 = 0;
	static boolean aBoolean2575 = false;

	final void method3603(final boolean bool) {
		do {
			try {
				anOutputStream2573 = new OutputStream_Sub2();
				if (bool == true) {
					break;
				}
				aByteArray2568 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "st.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (anIOException2569 != null) {
							return;
						}
						if ((anInt2574 ^ 0xffffffff) < (anInt2572 ^ 0xffffffff)) {
							i = -anInt2574 + (anInt2570 + anInt2572);
						} else {
							i = anInt2572 - anInt2574;
						}
						if ((i ^ 0xffffffff) < -1) {
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					if (i + anInt2574 > anInt2570) {
						final int i_0_ = -anInt2574 + anInt2570;
						anOutputStream2573.write(aByteArray2568, anInt2574,
								i_0_);
						anOutputStream2573.write(aByteArray2568, 0, i - i_0_);
					} else {
						anOutputStream2573.write(aByteArray2568, anInt2574, i);
					}
				} catch (final IOException ioexception) {
					synchronized (this) {
						anIOException2569 = ioexception;
						break;
					}
				}
				synchronized (this) {
					anInt2574 = (anInt2574 - -i) % anInt2570;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "st.run(" + ')');
		}
	}

	static final void method3604(final int i, final byte i_1_, final int i_2_,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		do {
			try {
				if (class98_sub46_sub8 != null
						&& (Class33.aClass148_315.aClass98_1198 != class98_sub46_sub8)) {
					final int i_3_ = class98_sub46_sub8.anInt5995;
					final int i_4_ = class98_sub46_sub8.anInt5993;
					int packetId = class98_sub46_sub8.anInt5990;
					final int i_6_ = (int) (class98_sub46_sub8.aLong5987);
					if ((packetId ^ 0xffffffff) <= -2001) {
						packetId -= 2000;
					}
					final long l = class98_sub46_sub8.aLong5987;
					if (packetId == 1002) {
						Class55.anInt440 = 2;
						Class98_Sub49.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
								.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							NPC class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
							if (class141.anIntArray1109 != null) {
								class141 = class141.method2300(
										(Class75.aClass140_584), (byte) 45);
							}
							if (class141 != null) {
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(
												260,
												(Class246_Sub3_Sub4_Sub2_Sub1.aClass171_6506),
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeShort(class141.npcId, 1571862888);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
							}
						}
					}
					if (packetId == 51) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							Class98_Sub49.anInt4286 = i;
							Class98_Sub23.anInt4001++;
							Class366.anInt3117 = i_2_;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i_1_ ^ 0x14a,
											Class121.aClass171_1001,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(i_6_, 128);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.method1231((Class219.aClass77_1641
											.method779(82, 5503) ? 1 : 0),
											(byte) 107);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(0));
						}
					}
					if (packetId == 45) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);

						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3111++;
							Class55.anInt440 = 2;
							Class98_Sub49.anInt4286 = i;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class277.aClass171_2051,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeByteS((!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1), -102);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											i_1_ + -78,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(0));
						}
					}
					if ((packetId ^ 0xffffffff) == -59) {
						Class98_Sub49.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Exception_Sub1.aClass171_46),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.method1200(
								(byte) 127, Class187.anInt1450);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								aa_Sub2.anInt3562 + i_4_, 128);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								i_6_, 128);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.method1194((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), 66);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								Class376.anInt3173, 128);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								Class272.anInt2038 + i_3_, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								Class310.anInt2652, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if (packetId == 1011 || packetId == 1003
							|| packetId == 1001
							|| (packetId ^ 0xffffffff) == -1011
							|| packetId == 1004) {
						Class162.method2518(-1004, packetId, i_3_, i_6_);
					}
					if (packetId == 2) {
						Class55.anInt440 = 2;
						Class98_Sub49.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i_1_ + 182,
										(Class284_Sub2_Sub2.aClass171_6198),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								Class272.anInt2038 + i_3_, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								i_6_, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i_4_
								+ aa_Sub2.anInt3562, (byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.method1244((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), (byte) 112);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if ((packetId ^ 0xffffffff) == -51) {
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						Class98_Sub49.anInt4286 = i;
						Class55.anInt440 = 2;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class134.aClass171_3466),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(
								Class187.anInt1450, 1046032984);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								Class310.anInt2652, 128);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
								Class376.anInt3173, 1571862888);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
								Class272.anInt2038 + i_3_, i_1_ ^ 0x5db0b926);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
								(Class219.aClass77_1641.method779(82, 5503) ? 1
										: 0), i_1_ + -112);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
								(int) (l >>> 1575185440) & 0x7fffffff,
								(byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								aa_Sub2.anInt3562 + i_4_, i_1_ + 50);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (packetId == 11) {
						final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
								.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							Class98_Sub49.anInt4286 = i;
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i_1_ + 182,
											Class98_Sub45.aClass171_4256,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.method1231((Class219.aClass77_1641
											.method779(82, 5503) ? 1 : 0),
											(byte) 35);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub1
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub1
													.method3034(0));
						}
					}
					if ((packetId ^ 0xffffffff) == -21) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							Class98_Sub49.anInt4286 = i;
							Class98_Sub46_Sub16.anInt6044++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i_1_ + 182,
											Class64_Sub8.aClass171_3661,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShort(i_6_, 17624);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1), -37);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											i_1_ + -78,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(i_1_ ^ 0x4e));
						}
					}
					if (packetId == 5) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class55.anInt440 = 2;
							client.anInt3548++;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class98_Sub49.anInt4286 = i;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class160.aClass171_1259,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(i_6_, 128);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									Class310.anInt2652, (byte) 126);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(
									Class187.anInt1450, 1046032984);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.method1231((Class219.aClass77_1641
											.method779(82, 5503) ? 1 : 0),
											(byte) -128);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									Class376.anInt3173, (byte) 126);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(i_1_ ^ 0x4e));
						}
					}
					if (packetId == 19) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class98_Sub49.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class21_Sub4.aClass171_5398,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									i_6_, (byte) 126);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1244(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1),
									(byte) 112);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(i_1_ + -78));
						}
					}
					if ((packetId ^ 0xffffffff) == -31) {
						Class98_Sub49.anInt4286 = i;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i_1_ ^ 0x14a,
										(Class49.aClass171_413),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								i_4_ + aa_Sub2.anInt3562, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								i_6_, 128);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								Class272.anInt2038 + i_3_, i_1_ ^ 0x4496);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.method1231((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(i_1_ + -19259, i_4_, i_3_);
					}
					if (packetId == 47) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class366.anInt3117 = i_2_;
							Class65.anInt498++;
							Class98_Sub49.anInt4286 = i;
							Class55.anInt440 = 2;
							Class98_Sub10_Sub32.anInt5720 = 0;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(
											260,
											GameObjectDefinitionLoader.aClass171_2520,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
									(Class219.aClass77_1641.method779(82,
											i_1_ + 5425) ? 1 : 0), -52);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(0));
						}
					}
					if ((packetId ^ 0xffffffff) == -17) {
						Class366.anInt3117 = i_2_;
						Class98_Sub49.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i_1_ + 182,
										(Class196.aClass171_1508),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								i_3_ - -Class272.anInt2038, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								i_4_ + aa_Sub2.anInt3562, i_1_ + 17546);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
								(int) (l >>> -855876128) & 0x7fffffff,
								(byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
								(Class219.aClass77_1641.method779(82, 5503) ? 1
										: 0), (byte) 74);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if ((packetId ^ 0xffffffff) == -4) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
						if (class246_sub3_sub4_sub2_sub2 != null) {
							Class98_Sub49.anInt4286 = i;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class98_Sub43.anInt4242++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											OutputStream_Sub1.aClass171_34,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1244(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1),
									(byte) 112);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											i_1_ + -78,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(0));
						}
					}
					if (packetId == 8) {
						Class55.anInt440 = 2;
						Class98_Sub49.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class263.aClass171_1964),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i_3_
								+ Class272.anInt2038, (byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								0x7fffffff & (int) (l >>> -769820512), 128);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.method1231((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), (byte) -124);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								aa_Sub2.anInt3562 + i_4_, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if (packetId == 17) {
						final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
								.method3990(i_6_, -1));
						if (class98_sub39 != null) {
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class98_Sub49.anInt4286 = i;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class299_Sub2.aClass171_5296,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
									!Class219.aClass77_1641.method779(82,
											i_1_ ^ 0x1531) ? 0 : 1, (byte) 37);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub1
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub1
													.method3034(0));
						}
					}
					if ((packetId ^ 0xffffffff) == -10
							&& OutputStream_Sub1.aClass293_33 == null) {
						Class149.method2435(i_3_, i_1_ ^ 0x1f, i_4_);
						OutputStream_Sub1.aClass293_33 = Class246_Sub9
								.method3139((byte) 72, i_4_, i_3_);
						Class341.method3812(OutputStream_Sub1.aClass293_33);
					}
					if (packetId == 59) {
						final Class293 class293 = Class246_Sub9.method3139(
								(byte) 72, i_4_, i_3_);
						if (class293 != null) {
							Class172.method2542(false, class293);
						}
					}
					if (packetId == 13) {
						Class366.anInt3117 = i_2_;
						Class98_Sub49.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class222.aClass171_1669),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
								(Class219.aClass77_1641.method779(82,
										i_1_ ^ 0x1531) ? 1 : 0), (byte) 32);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i_3_
								- -Class272.anInt2038, (byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								i_6_, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								i_4_ - -aa_Sub2.anInt3562, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class44.method427(-19181, i_4_, i_3_);
					}
					if ((packetId ^ 0xffffffff) == -50 || packetId == 1006) {
						Class303.method3557(i_6_, i_3_,
								class98_sub46_sub8.aString5992, -124, i_4_);
					}
					if (packetId == 48) {
						final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
								.method3990(i_6_, i_1_ + -79));
						if (class98_sub39 != null) {
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							Class98_Sub49.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class82.aClass171_625,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1200(
									(byte) 125, Class187.anInt1450);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShort(Class310.anInt2652,
											i_1_ + 17546);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, i_1_ ^ 0x5db0b926);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1), -53);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShort(Class376.anInt3173,
											i_1_ + 17546);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub1
													.method3034(0),
											-2,
											i_1_ ^ 0x4e,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub1
													.method3034(0));
						}
					}
					if ((packetId ^ 0xffffffff) == -1010) {
						Class98_Sub49.anInt4286 = i;
						Class366.anInt3117 = i_2_;
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (aa_Sub1.aClass171_3559),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(i_6_,
								i_1_ + 1571862810);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (i_1_ != 78) {
						method3604(-42, (byte) 33, 80, null);
					}
					if ((packetId ^ 0xffffffff) == -58) {
						client.anInt3548++;
						Class55.anInt440 = 2;
						Class366.anInt3117 = i_2_;
						Class98_Sub49.anInt4286 = i;
						Class98_Sub10_Sub32.anInt5720 = 0;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i_1_ ^ 0x14a,
										(Class160.aClass171_1259),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865
								.writeLEShortA(
										(((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6369),
										i_1_ ^ 0xce);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
								Class310.anInt2652, (byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(
								Class187.anInt1450, 1046032984);
						class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
								(!Class219.aClass77_1641.method779(82,
										i_1_ ^ 0x1531) ? 0 : 1), (byte) -72);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
								Class376.anInt3173, (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (packetId == 15) {
						Class366.anInt3117 = i_2_;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class55.anInt440 = 2;
						Class98_Sub49.anInt4286 = i;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class250.aClass171_1913),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								0x7fffffff & (int) (l >>> 933731040), 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.method1194((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), -108);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								i_3_ + Class272.anInt2038, i_1_ ^ 0xce);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i_4_
								+ aa_Sub2.anInt3562, (byte) 126);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(i_1_ + -101, l, i_3_, i_4_);
					}
					if ((packetId ^ 0xffffffff) == -7) {
						if ((Class282.anInt2125 ^ 0xffffffff) >= -1
								|| !Class219.aClass77_1641.method779(82,
										i_1_ ^ 0x1531)
								|| !Class219.aClass77_1641.method779(81,
										i_1_ + 5425)) {
							final Class98_Sub11 class98_sub11 = Class50
									.method486(0, 0, 1, -4, i_1_ ^ 0x4e, i_4_,
											i_3_, true, 1);// path
							if ((i_6_ ^ 0xffffffff) != -2) {
								Class55.anInt440 = 1;
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class98_Sub49.anInt4286 = i;
								Class366.anInt3117 = i_2_;
							} else {
								/*
								 * ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865 .method1194(-1,
								 * -39); ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865 .method1194(-1,
								 * -90); ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865.writeShort ((int)
								 * Class98_Sub22_Sub2.aFloat5794, 1571862888);
								 * ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865 .method1194(57,
								 * -116); ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865
								 * .method1194(Class204.anInt1553, 116);
								 * ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865
								 * .method1194(Class151.anInt1213, -95);
								 * ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865 .method1194(89,
								 * 68); ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865.writeShort
								 * ((((Class246_Sub3) (Surface
								 * .aClass246_Sub3_Sub4_Sub2_Sub2_660))
								 * .anInt5084), 1571862888); ((Class98_Sub11)
								 * class98_sub11)
								 * .aClass98_Sub22_Sub1_3865.writeShort
								 * ((((Class246_Sub3) (Surface
								 * .aClass246_Sub3_Sub4_Sub2_Sub2_660))
								 * .anInt5079), i_1_ + 1571862810);
								 * ((Class98_Sub11) class98_sub11)
								 * .aClass98_Sub22_Sub1_3865 .method1194(63,
								 * -38);
								 */
							}
							Class76_Sub2.requestFlag(0, 0, 1, -4, i_1_ ^ 0x4e,
									i_4_, i_3_, true, 1);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						} else {
							Class351.method3846(
									aa_Sub2.anInt3562 - -i_4_,
									Class272.anInt2038 - -i_3_,
									(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088),
									32);
						}
					}
					if ((packetId ^ 0xffffffff) == -5) {
						Class55.anInt440 = 2;
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class366.anInt3117 = i_2_;
						Class98_Sub49.anInt4286 = i;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class283.aClass171_2146),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
								aa_Sub2.anInt3562 + i_4_, i_1_ ^ 0x5db0b926);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
								(int) (l >>> 2020731040) & 0x7fffffff, 17624);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
								Class272.anInt2038 + i_3_, 1571862888);
						class98_sub11.aClass98_Sub22_Sub1_3865
								.writeByteS((!Class219.aClass77_1641.method779(
										82, 5503) ? 0 : 1), i_1_ ^ ~0x6e);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(-23, l, i_3_, i_4_);
					}
					if ((packetId ^ 0xffffffff) == -61) {
						if (Class282.anInt2125 > 0
								&& Class219.aClass77_1641.method779(82, 5503)
								&& Class219.aClass77_1641.method779(81,
										i_1_ + 5425)) {
							Class351.method3846(
									i_4_ + aa_Sub2.anInt3562,
									i_3_ + Class272.anInt2038,
									(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088),
									-67);
						} else {
							Class98_Sub49.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class55.anInt440 = 1;
							Class366.anInt3117 = i_2_;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class335.aClass171_2812,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									i_4_ + aa_Sub2.anInt3562, (byte) 126);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									Class272.anInt2038 + i_3_, (byte) 126);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
					}
					if ((packetId ^ 0xffffffff) == -1008) {
						Class98_Sub10_Sub32.anInt5720 = 0;
						Class98_Sub49.anInt4286 = i;
						Class55.anInt440 = 2;
						Class366.anInt3117 = i_2_;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class255.aClass171_3206),
										(Class331.aClass117_2811));
						class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i_3_
								+ Class272.anInt2038, (byte) 126);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								0x7fffffff & (int) (l >>> -1233322400),
								i_1_ ^ 0xce);
						class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
								(Class219.aClass77_1641.method779(82, 5503) ? 1
										: 0), (byte) -120);
						class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
								aa_Sub2.anInt3562 + i_4_, 128);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						Class67.method688(i_1_ + -101, l, i_3_, i_4_);
					}
					if ((packetId ^ 0xffffffff) == -22) {
						final Class293 class293 = Class246_Sub9.method3139(
								(byte) 72, i_4_, i_3_);
						if (class293 != null) {
							Class98_Sub10_Sub32.method1098((byte) 96);
							final Class98_Sub49 class98_sub49 = client
									.method116(class293);
							Class98_Sub5_Sub2.method970(
									class98_sub49.anInt4285, class293,
									class98_sub49.method1668(-1), -6838);
							Class287_Sub2.aString3272 = Class170.method2538(
									i_1_ + -79, class293);
							if (Class287_Sub2.aString3272 == null) {
								Class287_Sub2.aString3272 = "Null";
							}
							Class246_Sub3_Sub3.aString6156 = (class293.aString2224 + "<col=ffffff>");
						}
					} else {
						if (packetId == 10) {
							final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
									.method3990(i_6_, -1));
							if (class98_sub39 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class366.anInt3117 = i_2_;
								final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								Class55.anInt440 = 2;
								Class98_Sub49.anInt4286 = i;
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												Class334.aClass171_3470,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1231((Class219.aClass77_1641
												.method779(82, 5503) ? 1 : 0),
												(byte) -109);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeLEShort(i_6_, i_1_ + 17546);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class76_Sub2
										.requestFlag(
												0,
												0,
												class246_sub3_sub4_sub2_sub1
														.method3034(0),
												-2,
												0,
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
												true,
												class246_sub3_sub4_sub2_sub1
														.method3034(0));
							}
						}
						if (packetId == 46) {
							Class55.anInt440 = 1;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class98_Sub49.anInt4286 = i;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class267.aClass171_2000,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1232(
									Class187.anInt1450, (byte) 94);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(Class310.anInt2652, 128);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									Class272.anInt2038 + i_3_,
									i_1_ + 1571862810);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									Class376.anInt3173, 1571862888);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									aa_Sub2.anInt3562 - -i_4_, 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2.requestFlag(0, 0, 1, -4, 0, i_4_,
									i_3_, true, 1);
						}
						if ((packetId ^ 0xffffffff) == -19) {
							Class98_Sub49.anInt4286 = i;
							Class55.anInt440 = 2;
							Class366.anInt3117 = i_2_;
							Class98_Sub10_Sub32.anInt5720 = 0;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i_1_ + 182,
											Class98_Sub22_Sub2.aClass171_5792,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(Class272.anInt2038 + i_3_,
											128);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(i_6_, 128);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(aa_Sub2.anInt3562 + i_4_,
											128);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1), 110);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class44.method427(-19181, i_4_, i_3_);
						}
						if (packetId == 1008) {
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							Class98_Sub49.anInt4286 = i;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i_1_ + 182,
											Class98_Sub50.aClass171_4290,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									i_6_, 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if (packetId == 22) {
							final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
							if (class246_sub3_sub4_sub2_sub2 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class55.anInt440 = 2;
								Class366.anInt3117 = i_2_;
								Class98_Sub49.anInt4286 = i;
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												Class98_Sub37.aClass171_4168,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeLEShortA(i_6_, 128);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1231(
												Class219.aClass77_1641
														.method779(82,
																i_1_ ^ 0x1531) ? 1
														: 0, (byte) 122);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class76_Sub2
										.requestFlag(
												0,
												0,
												class246_sub3_sub4_sub2_sub2
														.method3034(0),
												-2,
												0,
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
												true,
												class246_sub3_sub4_sub2_sub2
														.method3034(0));
							}
						}
						if (packetId == 44) {
							final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_6_]);
							if (class246_sub3_sub4_sub2_sub2 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class366.anInt3117 = i_2_;
								Class98_Sub49.anInt4286 = i;
								Class55.anInt440 = 2;
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												Class198.aClass171_1521,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeShort(i_6_, 1571862888);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1194((Class219.aClass77_1641
												.method779(82, 5503) ? 1 : 0),
												-91);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class76_Sub2
										.requestFlag(
												0,
												0,
												class246_sub3_sub4_sub2_sub2
														.method3034(0),
												-2,
												0,
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
												true,
												class246_sub3_sub4_sub2_sub2
														.method3034(0));
							}
						}
						if ((packetId ^ 0xffffffff) == -24) {
							Class98_Sub49.anInt4286 = i;
							Class98_Sub10_Sub32.anInt5720 = 0;
							Class366.anInt3117 = i_2_;
							Class55.anInt440 = 2;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class284_Sub2.aClass171_5180,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(i_4_ - -aa_Sub2.anInt3562,
											i_1_ ^ 0xce);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
									(!Class219.aClass77_1641
											.method779(82, 5503) ? 0 : 1),
									(byte) 101);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									i_6_, (byte) 126);
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(i_3_ - -Class272.anInt2038,
											128);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class44.method427(-19181, i_4_, i_3_);
						}
						if (packetId == 12) {
							final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
									.method3990(i_6_, -1));
							if (class98_sub39 != null) {
								Class98_Sub10_Sub32.anInt5720 = 0;
								Class55.anInt440 = 2;
								Class98_Sub49.anInt4286 = i;
								final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								Class366.anInt3117 = i_2_;
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(i_1_ + 182,
												Class41.aClass171_371,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeShort(i_6_, i_1_ ^ 0x5db0b926);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1231(!Class219.aClass77_1641
												.method779(82, i_1_ + 5425) ? 0
												: 1, (byte) -99);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class76_Sub2
										.requestFlag(
												0,
												0,
												class246_sub3_sub4_sub2_sub1
														.method3034(0),
												-2,
												0,
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
												true,
												class246_sub3_sub4_sub2_sub1
														.method3034(i_1_ ^ 0x4e));
							}
						}
						if ((packetId ^ 0xffffffff) == -26) {
							final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
									.method3990(i_6_, i_1_ ^ ~0x4e));
							if (class98_sub39 != null) {
								Class366.anInt3117 = i_2_;
								Class55.anInt440 = 2;
								Class98_Sub49.anInt4286 = i;
								Class98_Sub10_Sub32.anInt5720 = 0;
								final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												Class104.aClass171_901,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeShort(i_6_, 1571862888);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1244((!Class219.aClass77_1641
												.method779(82, 5503) ? 0 : 1),
												(byte) 112);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class76_Sub2
										.requestFlag(
												0,
												0,
												class246_sub3_sub4_sub2_sub1
														.method3034(i_1_ + -78),
												-2,
												0,
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0]),
												(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0]),
												true,
												class246_sub3_sub4_sub2_sub1
														.method3034(0));
							}
						}
						if (Class98_Sub10_Sub9.aBoolean5585) {
							Class98_Sub10_Sub32.method1098((byte) -30);
						}
						if (Class77.aClass293_593 == null
								|| (Class42_Sub3.anInt5365 ^ 0xffffffff) != -1) {
							break;
						}
						Class341.method3812(Class77.aClass293_593);
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("st.A("
								+ i
								+ ','
								+ i_1_
								+ ','
								+ i_2_
								+ ','
								+ (class98_sub46_sub8 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3605(final int i, final int i_7_, final byte[] is,
			final int i_8_) throws IOException {
		try {
			if (i_7_ < 0 || i < 0 || i_7_ + i > is.length) {
				throw new IOException();
			}
			synchronized (this) {
				if (anIOException2569 != null) {
					throw new IOException(anIOException2569.toString());
				}
				int i_9_;
				if (anInt2574 <= anInt2572) {
					i_9_ = anInt2570 - anInt2572 - (-anInt2574 - -1);
				} else {
					i_9_ = -1 + anInt2574 + -anInt2572;
				}
				if (i_9_ < i_7_) {
					throw new IOException("");
				}
				if (i_8_ != -5) {
					method3603(true);
				}
				if (i_7_ + anInt2572 > anInt2570) {
					final int i_10_ = anInt2570 - anInt2572;
					Class236.method2894(is, i, aByteArray2568, anInt2572, i_10_);
					Class236.method2894(is, i_10_ + i, aByteArray2568, 0,
							-i_10_ + i_7_);
				} else {
					Class236.method2894(is, i, aByteArray2568, anInt2572, i_7_);
				}
				anInt2572 = (i_7_ + anInt2572) % anInt2570;
				notifyAll();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("st.B(" + i + ',' + i_7_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_8_ + ')'));
		}
	}

	final void method3606(final byte i) {
		try {
			synchronized (this) {
				if (anIOException2569 == null) {
					anIOException2569 = new IOException("");
				}
				if (i > -113) {
					return;
				}
				notifyAll();
			}
			try {
				aThread2571.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "st.D(" + i + ')');
		}
	}

	static final int method3607(final int i, final String string) {
		try {
			return PlayerUpdate.method2859(10, true, string, -21972);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("st.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	PacketSender(final OutputStream outputstream, final int i) {
		anInt2572 = 0;
		try {
			anOutputStream2573 = outputstream;
			anInt2570 = 1 + i;
			aByteArray2568 = new byte[anInt2570];
			aThread2571 = new Thread(this);
			aThread2571.setDaemon(true);
			aThread2571.start();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("st.<init>(" + (outputstream != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}
}
