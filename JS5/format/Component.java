package org.codeusa.cache.format;

import java.io.IOException;

import org.codeusa.cache.stream.RSByteBuffer;

/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Component {
	static int anInt717;
	protected int anInt718;
	protected Object[] anObjectArray719;
	public int spriteId;
	public int anInt721;
	public int anInt722;
	protected boolean aBoolean724;
	public int xPos;
	protected int[] anIntArray726;
	protected Object[] anObjectArray727;
	static int anInt728;
	protected int anInt729;
	protected int anInt730;
	protected int anInt731;
	public int height;
	protected int anInt733;
	protected Object[] anObjectArray734;
	protected Object[] anObjectArray735;
	public int someInt = 0;
	protected Object[] anObjectArray737;
	protected byte[] aByteArray738;
	protected int anInt739;
	protected int anInt740;
	protected int anInt741;
	public boolean filled;
	static int anInt743;
	protected Object[] anObjectArray744;
	protected int anInt745;
	protected Object[] anObjectArray746;
	protected Object[] anObjectArray747;
	protected Object[] anObjectArray748;
	protected int anInt749;
	protected Object[] anObjectArray750;
	static int anInt751;
	protected boolean aBoolean752;
	protected byte[] aByteArray753;
	protected Object[] anObjectArray754;
	public int anInt755;
	protected int anInt756;
	protected Object[] anObjectArray757;
	protected int anInt758;
	protected boolean aBoolean759;
	protected int anInt760;
	protected int anInt761;
	public int anInt762;
	protected Object[] anObjectArray763;
	protected int anInt764;
	static int anInt765;
	static int anInt766;
	protected int anInt767;
	protected int anInt768;
	protected int anInt769;
	protected int anInt770;
	protected boolean aBoolean771;
	protected Object[] anObjectArray772;
	protected int[] anIntArray773;
	protected Object[] anObjectArray774;
	static int anInt775;
	protected int anInt776;
	protected int anInt777;
	public int anInt778;
	protected Object[] anObjectArray779;
	protected int anInt780;
	public String aString781;
	public int width;
	protected boolean aBoolean783;
	static int anInt784;
	protected int anInt785;
	protected Object[] anObjectArray786;
	protected Component[] aClass51Array787;
	protected Object[] anObjectArray788;
	protected Object[] anObjectArray789;
	protected Object[] anObjectArray790;
	protected int anInt791;
	// private Class262 aClass262_792;
	protected Object[] anObjectArray793;
	protected int anInt794;
	protected boolean aBoolean795;
	protected boolean aBoolean796;
	protected int anInt797;
	protected Object[] anObjectArray798;
	protected boolean aBoolean799;
	public int fontId;
	public byte xAlignment;
	protected int anInt802;
	// protected Class44 aClass44_803;
	protected Component[] aClass51Array804;
	public boolean aBoolean805;
	protected Object[] anObjectArray806;
	public int anInt807;
	public int anInt808;
	protected int anInt809;
	public int anInt810;
	protected boolean aBoolean811;
	protected Object[] anObjectArray812;
	protected int[] anIntArray813;
	protected boolean aBoolean814;
	public int anInt815;
	// protected Node_Sub30 aNode_Sub30_816;
	protected Object[] anObjectArray817;
	protected int[] anIntArray818;
	protected Object[] anObjectArray819;
	protected int anInt820;
	static int anInt821;
	protected int[] anIntArray822;
	static int anInt823;
	protected int anInt824;
	static int anInt825;
	static int anInt826;
	private short[] aShortArray827;
	protected int anInt828;
	protected int anInt829;
	protected String aString830;
	public int anInt831;
	protected int anInt832;
	protected int anInt833;
	protected int anInt834;
	protected Object[] anObjectArray835;
	protected Object[] anObjectArray836;
	static int anInt837;
	protected Object[] anObjectArray838;
	protected Object[] anObjectArray839;
	static int anInt840;
	protected String[] aStringArray842;
	static int anInt843;
	protected int anInt844;
	public int anInt845;
	static int anInt846;
	protected int anInt847;
	protected int anInt848;
	protected int anInt849;
	protected boolean aBoolean850;
	protected Object[] anObjectArray851;
	public byte heightOffset;
	protected int anInt853;
	protected Object[] anObjectArray854;
	public int parentId;
	protected int[] anIntArray856;
	public int anInt857;
	public int anInt858;
	protected String aString859;
	public int contentType;
	public byte yAlignment;
	public int anInt862;
	protected int anInt863;
	protected Component aClass51_864;
	static int anInt865;
	protected Object[] anObjectArray866;
	public int yPos;
	static int anInt868;
	protected boolean aBoolean869;
	protected int anInt870;
	protected int anInt871;
	protected boolean aBoolean872;
	public int anInt873;
	protected int[] anIntArray874;
	private short[] aShortArray875;
	protected boolean aBoolean876;
	protected boolean aBoolean877;
	protected int[] anIntArray878;
	protected String aString879;
	static int anInt880;
	public int anInt881;
	protected int anInt882;
	public int anInt883;
	protected int anInt884;
	protected int[] anIntArray885;
	public byte widthOffset;
	protected Object[] anObjectArray887;
	protected String aString888;
	// protected Class336_Sub1 aClass336_Sub1_889;
	static int anInt890;
	public boolean aBoolean891;
	static int anInt892;
	protected boolean aBoolean893;
	static int anInt894;
	protected int anInt895;
	protected int anInt896;

	private final int[] method622(final byte b, final RSByteBuffer buffer)
			throws IOException {

		anInt843++;
		final int i = buffer.readByte();
		if (i == 0) {
			return null;
		}
		final int[] is = new int[i];
		for (int i_3_ = 0; i > i_3_; i_3_++) {
			is[i_3_] = buffer.readInt();
		}
		return is;
	}

	private final Object[] method623(final byte b, final RSByteBuffer buffer)
			throws IOException {
		anInt865++;
		final int i = buffer.readByte();
		if (i == 0) {
			return null;
		}
		final Object[] objects = new Object[i];
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			final int i_5_ = buffer.readByte();
			if (i_5_ == 0) {
				objects[i_4_] = new Integer(buffer.readInt());
			} else if (i_5_ == 1) {
				objects[i_4_] = buffer.readRS2String();
			}
		}
		if (b != -82) {
			return null;
		}
		aBoolean796 = true;
		return objects;
	}

	static final int method629(final boolean bool, final int i) {
		anInt840++;
		if (bool != false) {
			return 90;
		}
		int i_20_ = i >>> 1;
		i_20_ |= i_20_ >>> 1;
		i_20_ |= i_20_ >>> 2;
		i_20_ |= i_20_ >>> 4;
		i_20_ |= i_20_ >>> 8;
		i_20_ |= i_20_ >>> 16;
		return i & (i_20_ ^ 0xffffffff);
	}

	final void method630(final int i) {
		anObjectArray836 = null;
		anObjectArray786 = null;
		anObjectArray779 = null;
		anObjectArray788 = null;
		anObjectArray866 = null;
		anObjectArray748 = null;
		anObjectArray819 = null;
		anObjectArray806 = null;
		anObjectArray812 = null;
		anObjectArray735 = null;
		anObjectArray757 = null;
		anIntArray773 = null;
		anObjectArray790 = null;
		anObjectArray772 = null;
		anInt821++;
		anObjectArray793 = null;
		anObjectArray754 = null;
		anObjectArray887 = null;
		anObjectArray838 = null;
		anIntArray878 = null;
		anObjectArray839 = null;
		anObjectArray817 = null;
		anObjectArray744 = null;
		anObjectArray737 = null;
		anObjectArray727 = null;
		anObjectArray774 = null;
		anIntArray813 = null;
		anObjectArray719 = null;
		if (i != 4) {
			aBoolean893 = false;
		}
		anIntArray885 = null;
		anObjectArray789 = null;
		anObjectArray798 = null;
		anObjectArray747 = null;
		anObjectArray746 = null;
		anObjectArray835 = null;
		anObjectArray851 = null;
		anObjectArray763 = null;
		anIntArray726 = null;
		anObjectArray734 = null;
	}

	@SuppressWarnings("unused")
	public final void loadData(final RSByteBuffer buffer) throws IOException {
		anInt825++;
		int i_34_ = buffer.readByte();
		if (i_34_ == 255) {
			i_34_ = -1;
		}
		contentType = buffer.readByte();
		if ((0x80 & contentType) != 0) {
			contentType &= 0x7f;
			aString859 = buffer.readRS2String();
		}
		someInt = buffer.readShort();
		xPos = buffer.readSShort();// based on these you format the image
		yPos = buffer.readSShort();// Still looks fucked up though, cause idk
		// what to do with 'em.
		width = buffer.readShort();// ok, for example, you have widget 900
		// component 1
		height = buffer.readShort();// place component 1 at x,y (defined here),
		// and give it an area of (width and height)
		xAlignment = buffer.readByte();// then on component 2, you would do the
		// same... do for all components
		yAlignment = buffer.readByte();// if you place them all correctly they
		// will form the interface
		widthOffset = buffer.readByte();// properly
		heightOffset = buffer.readByte();
		parentId = buffer.readShort();
		if (parentId != 65535) {
			parentId = parentId + (~0xffff & anInt721);
		} else {
			parentId = -1;
		}
		final int i_35_ = buffer.readByte();
		aBoolean805 = (0x1 & i_35_) != 0;
		if (i_34_ >= 0) {
			aBoolean869 = (0x2 & i_35_) != 0;
		}
		if (contentType == 0) {
			anInt828 = buffer.readShort();
			anInt758 = buffer.readShort();
			if (i_34_ < 0) {
				aBoolean869 = buffer.readByte() == 1;
			}
		}
		if (contentType == 5) {
			spriteId = buffer.readInt();
			System.out.println(spriteId);
			anInt824 = buffer.readShort();
			final int i_36_ = buffer.readByte();
			aBoolean795 = (i_36_ & 0x2) != 0;
			aBoolean811 = (i_36_ & 0x1) != 0;
			anInt762 = buffer.readByte();
			anInt833 = buffer.readByte();
			anInt769 = buffer.readInt();
			aBoolean893 = buffer.readByte() == 1;
			aBoolean814 = buffer.readByte() == 1;
			anInt881 = buffer.readInt();
			if (i_34_ >= 3) {
				aBoolean799 = buffer.readByte() == 1;
			}
		}
		if (contentType == 6) {
			anInt741 = 1;
			anInt780 = buffer.readShort();
			if (anInt780 == 65535) {
				anInt780 = -1;
			}
			final int i_37_ = buffer.readByte();
			aBoolean752 = (i_37_ & 0x4) == 4;
			final boolean bool = (0x1 & i_37_) == 1;
			aBoolean850 = (i_37_ & 0x2) == 2;
			aBoolean783 = (i_37_ & 0x8) == 8;
			if (bool) {
				anInt848 = buffer.readShort();
				anInt730 = buffer.readShort();
				anInt871 = buffer.readShort();
				anInt760 = buffer.readShort();
				anInt797 = buffer.readShort();
				anInt767 = buffer.readShort();
			} else if (aBoolean850) {
				anInt848 = buffer.readShort();
				anInt730 = buffer.readShort();
				anInt749 = buffer.readShort();
				anInt871 = buffer.readShort();
				anInt760 = buffer.readShort();
				anInt797 = buffer.readShort();
				anInt767 = buffer.readShort();
			}
			anInt740 = buffer.readShort();
			if (anInt740 == 65535) {
				anInt740 = -1;
			}
			if (xAlignment != 0) {
				anInt761 = buffer.readShort();
			}
			if (yAlignment != 0) {
				anInt729 = buffer.readShort();
			}
		}
		if (contentType == 4) {
			fontId = buffer.readShort();
			if (fontId == 65535) {
				fontId = -1;
			}
			if (i_34_ >= 2) {
				aBoolean876 = buffer.readByte() == 1;
			}
			aString781 = buffer.readRS2String();
			anInt845 = buffer.readByte();
			anInt722 = buffer.readByte();
			anInt857 = buffer.readByte();
			aBoolean891 = buffer.readByte() == 1;
			anInt881 = buffer.readInt();
			anInt762 = buffer.readByte();
			if (i_34_ >= 0) {
				anInt755 = buffer.readByte();
			}
		}
		if (contentType == 3) {
			anInt881 = buffer.readInt();
			filled = buffer.readByte() == 1;
			anInt762 = buffer.readByte();
		}
		if (contentType == 9) {
			anInt718 = buffer.readByte();
			anInt881 = buffer.readInt();
			aBoolean759 = buffer.readByte() == 1;
		}
		final int i_38_ = buffer.read24BitInt();
		int i_39_ = buffer.readByte();
		if (i_39_ != 0) {
			anIntArray822 = new int[11];
			aByteArray753 = new byte[11];
			aByteArray738 = new byte[11];
			for (/**/; i_39_ != 0; i_39_ = buffer.readByte()) {
				final int i_40_ = -1 + (i_39_ >> 4);
				i_39_ = (i_39_ << 8) | buffer.readByte();
				i_39_ &= 0xfff;
				if (i_39_ == 4095) {
					i_39_ = -1;
				}
				final byte b = buffer.readByte();
				if (b != 0) {
					aBoolean724 = true;
				}
				final byte b_41_ = buffer.readByte();
				anIntArray822[i_40_] = i_39_;
				aByteArray753[i_40_] = b;
				aByteArray738[i_40_] = b_41_;
			}
		}
		aString888 = buffer.readRS2String();
		final int i_42_ = buffer.readByte();
		final int i_43_ = i_42_ & 0xf;
		final int i_44_ = i_42_ >> 4;
				if (i_43_ > 0) {
					aStringArray842 = new String[i_43_];
					for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
						aStringArray842[i_45_] = buffer.readRS2String();
					}
				}
				if (i_44_ > 0) {
					final int i_46_ = buffer.readByte();
					anIntArray874 = new int[1 + i_46_];
					for (int i_47_ = 0; anIntArray874.length > i_47_; i_47_++) {
						anIntArray874[i_47_] = -1;
					}
					anIntArray874[i_46_] = buffer.readShort();
				}
				if (i_44_ > 1) {
					final int i_48_ = buffer.readByte();
					anIntArray874[i_48_] = buffer.readShort();
				}
				aString830 = buffer.readRS2String();
				if (aString830.equals("")) {
					aString830 = null;
				}
				anInt832 = buffer.readByte();
				anInt770 = buffer.readByte();
				anInt882 = buffer.readByte();
				aString879 = buffer.readRS2String();
				int i_49_ = -1;
				if (((i_38_ & 0x3f966) >> 11) != 0) {
					i_49_ = buffer.readShort();
					anInt764 = buffer.readShort();
					if (i_49_ == 65535) {
						i_49_ = -1;
					}
					if (anInt764 == 65535) {
						anInt764 = -1;
					}
					anInt745 = buffer.readShort();
					if (anInt745 == 65535) {
						anInt745 = -1;
					}
				}
				if (i_34_ >= 0) {
					anInt870 = buffer.readShort();
					if (anInt870 == 65535) {
						anInt870 = -1;
					}
				}
				// aNode_Sub30_816 = new Node_Sub30(i_38_, i_49_);
				if (-1 >= (i_34_ ^ 0xffffffff)) {
					final int i_50_ = buffer.readByte();
					for (int i_51_ = 0; i_50_ > i_51_; i_51_++) {
						final int i_52_ = buffer.read24BitInt();
						final int i_53_ = buffer.readInt();
						// aClass262_792.method3096((long) i_52_, (byte) -37, new
						// Node_Sub16(i_53_));
					}
					final int i_54_ = buffer.readByte();
					for (int i_55_ = 0; i_54_ > i_55_; i_55_++) {
						final int i_56_ = buffer.read24BitInt();
						buffer.readByte();
						final String string = buffer.readRS2String();
						// aClass262_792.method3096((long) i_56_, (byte) -37, new
						// Node_Sub5(string));
					}
				}
				anObjectArray735 = method623((byte) -82, buffer);
				anObjectArray838 = method623((byte) -82, buffer);
				anObjectArray747 = method623((byte) -82, buffer);
				anObjectArray806 = method623((byte) -82, buffer);
				anObjectArray757 = method623((byte) -82, buffer);
				anObjectArray851 = method623((byte) -82, buffer);
				anObjectArray790 = method623((byte) -82, buffer);
				anObjectArray719 = method623((byte) -82, buffer);
				anObjectArray789 = method623((byte) -82, buffer);
				anObjectArray839 = method623((byte) -82, buffer);
				if (i_34_ >= 0) {
					anObjectArray737 = method623((byte) -82, buffer);
				}
				anObjectArray866 = method623((byte) -82, buffer);
				anObjectArray812 = method623((byte) -82, buffer);
				anObjectArray779 = method623((byte) -82, buffer);
				anObjectArray786 = method623((byte) -82, buffer);
				anObjectArray835 = method623((byte) -82, buffer);
				anObjectArray819 = method623((byte) -82, buffer);
				anObjectArray744 = method623((byte) -82, buffer);
				anObjectArray774 = method623((byte) -82, buffer);
				anObjectArray793 = method623((byte) -82, buffer);
				anObjectArray772 = method623((byte) -82, buffer);
				anIntArray726 = method622((byte) 112, buffer);
				anIntArray773 = method622((byte) 112, buffer);
				anIntArray885 = method622((byte) 112, buffer);
				anIntArray813 = method622((byte) 112, buffer);
				anIntArray878 = method622((byte) 112, buffer);
	}

	final void method638(final short s, final short s_57_, final byte b,
			final int i) {
		anInt751++;
		if (b != -34) {
			aBoolean811 = true;
		}
		if (i < 5) {
			if (aShortArray875 == null) {
				aShortArray875 = new short[5];
				aShortArray827 = new short[5];
			}
			aShortArray875[i] = s_57_;
			aShortArray827[i] = s;
		}
	}

	public Component() {
		anInt721 = -1;
		height = 0;
		anInt740 = -1;
		anInt761 = 0;
		spriteId = -1;
		aString781 = "";
		anInt768 = 0;
		aBoolean783 = false;
		anInt776 = 0;
		anInt749 = 0;
		anInt755 = 0;
		anInt730 = 0;
		anInt729 = 0;
		aBoolean811 = false;
		anInt718 = 1;
		anInt809 = 0;
		anInt762 = 0;
		aBoolean771 = false;
		anInt758 = 0;
		aBoolean759 = false;
		aBoolean805 = false;
		xPos = 0;
		anInt794 = -1;
		anInt807 = -1;
		anInt722 = 0;
		anInt810 = -1;
		filled = false;
		aBoolean752 = false;
		anInt833 = 0;
		fontId = -1;
		anInt791 = -1;
		aBoolean799 = true;
		anInt845 = 0;
		anInt849 = -1;
		xAlignment = (byte) 0;
		anInt745 = -1;
		anInt767 = 100;
		anInt844 = 0;
		anInt778 = 1;
		anInt769 = 0;
		aClass51_864 = null;
		anInt756 = 0;
		aBoolean796 = false;
		anInt832 = 0;
		anInt733 = 2;
		anInt808 = -1;
		yPos = 0;
		aBoolean869 = false;
		anInt802 = 0;
		anInt862 = 0;
		heightOffset = (byte) 0;
		width = 0;
		anInt853 = 0;
		anInt834 = 0;
		anInt764 = -1;
		anInt828 = 0;
		anInt858 = -1;
		aBoolean876 = true;
		anInt770 = 0;
		anInt741 = 1;
		anInt857 = 0;
		aBoolean724 = false;
		anInt881 = 0;
		parentId = -1;
		anInt815 = 1;
		anInt848 = 0;
		anInt739 = 0;
		aString888 = "";
		anInt882 = 0;
		anInt829 = -1;
		aString879 = "";
		anInt824 = 0;
		anInt873 = 0;
		aBoolean872 = false;
		anInt831 = 0;
		aBoolean795 = false;
		aBoolean891 = false;
		anInt895 = 0;
		anInt884 = 0;
		aBoolean877 = false;
		widthOffset = (byte) 0;
		anInt883 = 0;
		anInt871 = 0;
		yAlignment = (byte) 0;
		anInt760 = 0;
		anInt797 = 0;
		anInt896 = -1;
		anInt870 = -1;
	}

}
