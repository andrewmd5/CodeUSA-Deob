package org.codeusa.cache.format;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import org.codeusa.cache.CacheManager;
import org.codeusa.cache.stream.RSByteArrayInputStream;
import org.codeusa.cache.stream.RSByteBuffer;

/**
 *
 * @author Steve
 */
public class Sprite {

	public static HashMap<Integer, BufferedImage[]> sprites = new HashMap<Integer, BufferedImage[]>();
	/*
	 * Class185 - Decompiled by JODE Visit http://jode.sourceforge.net/
	 */

	protected int width;
	protected int[] anIntArray2721;
	protected byte[] aByteArray2722;
	protected int anInt2723;
	protected int anInt2724;
	protected int height;
	protected byte[] aByteArray2726;
	protected int anInt2727;
	protected int anInt2728;

	final int[] convertPixelData() {
		final int[] rgbArray = new int[width * height];
		int i = 0;
		int i_43_ = 0;
		if (aByteArray2726 != null) {
			for (int i_44_ = 0; i_44_ < height; i_44_++) {
				for (int i_45_ = 0; i_45_ < width; i_45_++) {
					rgbArray[i_43_++] = (aByteArray2726[i] << 24)
							| anIntArray2721[aByteArray2722[i] & 0xff];
					i++;
				}
			}
		} else {
			for (int i_46_ = 0; i_46_ < height; i_46_++) {
				for (int i_47_ = 0; i_47_ < width; i_47_++) {
					final int i_48_ = anIntArray2721[aByteArray2722[i++] & 0xff];
					rgbArray[i_43_++] = i_48_ != 0 ? ~0xffffff | i_48_ : 0;
				}
			}
		}
		return rgbArray;
	}

	private static BufferedImage[] getImages(final byte[] bs, final int spriteId)
			throws IOException {
		final RSByteBuffer buffer = new RSByteBuffer(
				new RSByteArrayInputStream(bs));
		buffer.seek(bs.length - 2);
		System.out.println(bs.length);
		final int i = buffer.readShort();
		System.out.println(i);
		final Sprite[] class185s = new Sprite[i];
		for (int i_93_ = 0; i_93_ < i; i_93_++) {
			class185s[i_93_] = new Sprite();
		}
		buffer.seek(bs.length - 7 - (i * 8));
		final int i_94_ = buffer.readShort();
		final int i_95_ = buffer.readShort();
		final int i_96_ = (buffer.readByte() & 0xff) + 1;
		for (int i_97_ = 0; i_97_ < i; i_97_++) {
			class185s[i_97_].anInt2724 = buffer.readShort();
		}
		for (int i_98_ = 0; i_98_ < i; i_98_++) {
			class185s[i_98_].anInt2727 = buffer.readShort();
		}
		for (int i_99_ = 0; i_99_ < i; i_99_++) {
			class185s[i_99_].width = buffer.readShort();
		}
		for (int i_100_ = 0; i_100_ < i; i_100_++) {
			class185s[i_100_].height = buffer.readShort();
		}
		for (int i_101_ = 0; i_101_ < i; i_101_++) {
			final Sprite class185 = class185s[i_101_];
			class185.anInt2728 = i_94_ - class185.width - class185.anInt2724;
			class185.anInt2723 = i_95_ - class185.height - class185.anInt2727;
		}
		buffer.seek(bs.length - 7 - (i * 8) - ((i_96_ - 1) * 3));
		final int[] is = new int[i_96_];
		for (int i_102_ = 1; i_102_ < i_96_; i_102_++) {
			is[i_102_] = buffer.read24BitInt();
			if (is[i_102_] == 0) {
				is[i_102_] = 1;
			}
		}
		for (int i_103_ = 0; i_103_ < i; i_103_++) {
			class185s[i_103_].anIntArray2721 = is;
		}
		buffer.seek(0);
		for (int i_104_ = 0; i_104_ < i; i_104_++) {
			final Sprite class185 = class185s[i_104_];
			final int i_105_ = class185.width * class185.height;
			class185.aByteArray2722 = new byte[i_105_];
			final int i_106_ = buffer.readByte();
			if ((i_106_ & 0x2) == 0) {
				if ((i_106_ & 0x1) == 0) {
					for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
						class185.aByteArray2722[i_107_] = buffer.readByte();
					}
				} else {
					for (int i_108_ = 0; i_108_ < class185.width; i_108_++) {
						for (int i_109_ = 0; i_109_ < class185.height; i_109_++) {
							class185.aByteArray2722[i_108_
							                        + (i_109_ * class185.width)] = buffer
							                        .readByte();
						}
					}
				}
			} else {
				boolean bool = false;
				class185.aByteArray2726 = new byte[i_105_];
				if ((i_106_ & 0x1) == 0) {
					for (int i_110_ = 0; i_110_ < i_105_; i_110_++) {
						class185.aByteArray2722[i_110_] = buffer.readByte();
					}
					for (int i_111_ = 0; i_111_ < i_105_; i_111_++) {
						final byte b = class185.aByteArray2726[i_111_] = buffer
								.readByte();
						bool = bool | (b != -1);
					}
				} else {
					for (int i_112_ = 0; i_112_ < class185.width; i_112_++) {
						for (int i_113_ = 0; i_113_ < class185.height; i_113_++) {
							class185.aByteArray2722[i_112_
							                        + (i_113_ * class185.width)] = buffer
							                        .readByte();
						}
					}
					for (int i_114_ = 0; i_114_ < class185.width; i_114_++) {
						for (int i_115_ = 0; i_115_ < class185.height; i_115_++) {
							final byte b = class185.aByteArray2726[i_114_
							                                       + (i_115_ * class185.width)] = buffer
							                                       .readByte();
							bool = bool | (b != -1);
						}
					}
				}
				if (!bool) {
					class185.aByteArray2726 = null;
				}
			}
		}
		return convertImages(class185s);
	}

	private static BufferedImage[] convertImages(final Sprite[] class185s) {
		final BufferedImage[] images = new BufferedImage[class185s.length];
		for (int i = 0; i < images.length; i++) {
			if ((class185s[i].width <= 0) || (0 >= class185s[i].height)) {
				images[i] = null;
				continue;
			}
			final BufferedImage image = new BufferedImage(class185s[i].width,
					class185s[i].height, BufferedImage.TYPE_INT_RGB);
			image.setRGB(0, 0, class185s[i].width, class185s[i].height,
					class185s[i].convertPixelData(), 0, class185s[i].width);
			image.flush();
			images[i] = image;
		}
		return images;
	}

	public static BufferedImage[] get(final int spriteId) {
		if (!sprites.containsKey(spriteId)) {
			try {
				sprites.put(
						spriteId,
						getImages(CacheManager.getData(8, spriteId, 0),
								spriteId));
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
		return sprites.get(spriteId);
	}

}
