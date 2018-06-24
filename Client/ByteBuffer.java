/* ByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class ByteBuffer extends Node {

	int position;
	byte[] incomingBytes;
	static IncomingOpcode updateTilePosition;
	static int anInt3994 = -1;
	static Class207 aClass207_3995;

	final void method1181(final String string, final int i) {
		try {
			final int i_0_ = string.indexOf('\0');
			if ((i_0_ ^ 0xffffffff) <= i) {
				throw new IllegalArgumentException("NUL character at " + i_0_
						+ " - cannot pjstr2");
			}
			incomingBytes[position++] = (byte) 0;
			position += Class200.method2694(string, 0, string.length(),
					position, incomingBytes, -28439);
			incomingBytes[position++] = (byte) 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.GB("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void writeShortA(final int i, final byte i_1_) {
		try {
			incomingBytes[position++] = (byte) (i >> 2119028456);
			if (i_1_ != 126) {
				writeLEInt(75, -5);
			}
			incomingBytes[position++] = (byte) (128 + i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.RA(" + i + ','
					+ i_1_ + ')');
		}
	}

	final int method1183(final int i) {
		try {
			position += 2;
			int i_2_ = (((incomingBytes[-2 + position]) & 0xff) + ((incomingBytes[position - 1]) << 1553290568 & 0xff00));
			if ((i_2_ ^ 0xffffffff) < -32768) {
				i_2_ -= 65536;
			}
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.KC(" + i + ')');
		}
	}

	final byte method1184(final int i) {
		try {
			return (byte) ((incomingBytes[position++]) - 128);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.GA(" + i + ')');
		}
	}

	final void writeInt(final int i, final int i_3_) {
		try {
			incomingBytes[position++] = (byte) (i_3_ >> -1995948680);
			incomingBytes[position++] = (byte) (i_3_ >> 1547612048);
			incomingBytes[position++] = (byte) (i_3_ >> 1571862888);
			incomingBytes[position++] = (byte) i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.FA(" + i + ','
					+ i_3_ + ')');
		}
	}

	final int readMediumInt(final int i) {
		try {
			position += 3;
			return (((incomingBytes[-1 + position]) & 0xff)
					+ ((0xff & (incomingBytes[-2 + position])) << 1155233704) + (((incomingBytes[position
					+ -3]) & 0xff) << 251467472));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.MB(" + i + ')');
		}
	}

	final byte method1187(final byte i) {
		try {
			return (byte) -(incomingBytes[position++]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.WB(" + i + ')');
		}
	}

	final void method1188(final String string, final byte i) {
		try {
			if (i == 113) {
				final int i_4_ = string.indexOf('\0');
				if ((i_4_ ^ 0xffffffff) <= -1) {
					throw new IllegalArgumentException("NUL character at "
							+ i_4_ + " - cannot pjstr");
				}
				position += Class200.method2694(string, 0, string.length(),
						position, (incomingBytes), -28439);
				incomingBytes[position++] = (byte) 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.BC("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final long method1189(final byte i) {
		try {
			final long l = method1202((byte) -58) & 0xffffffffL;
			final long l_5_ = 0xffffffffL & method1202((byte) -68);
			return l + (l_5_ << 1898790944);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.FC(" + i + ')');
		}
	}

	final void method1190(final byte[] is, final boolean bool, final int i,
			final int i_6_) {
		try {
			for (int i_7_ = i_6_; i_7_ < i_6_ + i; i_7_++) {
				is[i_7_] = (incomingBytes[position++]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.CA("
					+ (is != null ? "{...}" : "null") + ',' + bool + ',' + i
					+ ',' + i_6_ + ')'));
		}
	}

	final byte readSignedByte(final byte i) {
		try {
			return (incomingBytes[position++]); // read
			// byte
			// lol...
			// uhhhhh,
			// just
			// without
			// the
			// bitmask
			// or
			// w/e
			// this
			// byte
			// is
			// signed
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.NC(" + i + ')');
		}
	}

	final int method1192(final byte i) {
		try {
			position += 3;
			return ((0xff & (incomingBytes[-3 + position])) + (((0xff & (incomingBytes[-2
					+ position])) << -1177345560) + (0xff0000 & ((incomingBytes[position - 1]) << 587636880))));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.BA(" + i + ')');
		}
	}
	
    public int readSpecialSmart() {
        int first = incomingBytes[position] & 0xff;
        if (first < 128)
            return readUnsignedByte((byte) -108) - 1;
        return readUnsignedShort((byte) 0) - 32769;
    }
    
	public int readIntSmart2() {
		if (incomingBytes[position] < 0) {
			return readInt(0) & 0x7fffffff;
		}
		final int i = readUnsignedShort((byte) 0) & 0xFFFF;
		if (i == 32767) {
			return -1;
		}
		return i;
	}

	public int readIntSmart() {
		final int first = incomingBytes[position];
		if (first >= 0) {
			return readUnsignedShort((byte) 0) & 0xFFFF;
		}
		return readInt(0) & 0x7fffffff;
	}

	final int readInt1(final boolean bool) {
		try {
			position += 4;
			return (((incomingBytes[-4 + position]) << -1188328504 & 0xff00)
					+ ((0xff0000 & ((incomingBytes[position - 1]) << 340284016)) + (((incomingBytes[position
							+ -2]) & 0xff) << -2077360904)) - -((incomingBytes[-3
					+ position]) & 0xff));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.M(" + bool
					+ ')');
		}
	}

	final void method1194(final int i, final int i_8_) {
		try {
			incomingBytes[position++] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.LC(" + i + ','
					+ i_8_ + ')');
		}
	}

	final void writeLEShort(final int i, final int i_10_) {
		try {
			incomingBytes[position++] = (byte) i;
			incomingBytes[position++] = (byte) (i >> -1001534936);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.KA(" + i + ','
					+ i_10_ + ')');
		}
	}

	final int method1196(final int i, final byte i_11_) {
		try {
			final int i_12_ = Class365.method3937(position, incomingBytes, i,
					false);
			writeInt(1571862888, i_12_);
			return i_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.KB(" + i + ','
					+ i_11_ + ')');
		}
	}

	final int readSmart() {
		try {
			final int i_13_ = 0xff & (incomingBytes[position]);
			if (i_13_ < 128) {
				return readUnsignedByte((byte) -115);
			}
			return -32768 + readUnsignedShort((byte) 127);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.R(" + ')');
		}
	}

	final int method1198(final int i) {
		try {
			position += 2; // writeLEShortA
			int i_14_ = ((-128 + (incomingBytes[position - 2]) & 0xff) + ((incomingBytes[position
					+ -1]) << -1508488440 & 0xff00));
			if ((i_14_ ^ 0xffffffff) < -32768) {
				i_14_ -= 65536;
			}
			return i_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.QA(" + i + ')');
		}
	}

	final void method1199(final int i, final boolean bool) {
		try {
			if (bool != false) {
				readInt1(true);
			}
			if ((~0x7f & i) != 0) {
				if ((~0x3fff & i) != 0) {
					if ((~0x1fffff & i ^ 0xffffffff) != -1) {
						if ((~0xfffffff & i) != 0) {
							method1194(i >>> -342844612 | 0x80, 94);
						}
						method1194((i | 0x1001c695) >>> 651642005, -37);
					}
					method1194((0x201d9a | i) >>> -33880754, 107);
				}
				method1194(0x80 | i >>> -1419157497, -56);
			}
			method1194(i & 0x7f, 56);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.QC(" + i + ','
					+ bool + ')');
		}
	}

	final void method1200(final byte i, final int i_16_) {
		try {
			incomingBytes[position++] = (byte) (i_16_ >> -968007800);
			incomingBytes[position++] = (byte) i_16_;
			incomingBytes[position++] = (byte) (i_16_ >> -922569928);
			incomingBytes[position++] = (byte) (i_16_ >> -944199472);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.MA(" + i + ','
					+ i_16_ + ')');
		}
	}

	final void method1201(final int i) {
		do {
			try {
				if (incomingBytes != null) {
					Class129.method2228((byte) 75, incomingBytes);
				}
				incomingBytes = null;
				if (i == 0) {
					break;
				}
				method1216(-7);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ji.VA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method1202(final byte i) {
		try {
			position += 4;
			if (i >= -45) {
				anInt3994 = 37;
			}
			return (((incomingBytes[-3 + position]) << -401730296 & 0xff00)
					+ (((incomingBytes[position + -2]) & 0xff) << 178467952) + (((0xff & (incomingBytes[-1
					+ position])) << -688793032) + (0xff & (incomingBytes[-4
					+ position]))));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.SA(" + i + ')');
		}
	}

	final int readUnsignedShort(final byte i) {
		try {
			position += 2;
			return (((incomingBytes[position - 1]) & 0xff) + (((incomingBytes[-2
					+ position]) & 0xff) << -1546530360));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.CB(" + i + ')');
		}
	}

	
	
	final String readString(final byte i) {
		final int i_18_ = position;
		if (i != 84) {
			readInt1(true);
		}
		while (((incomingBytes[position++]) ^ 0xffffffff) != -1) {
			/* empty */
		}
		final int i_19_ = -i_18_ + position - 1;
		if (i_19_ == 0) {
			return "";
		}
		String string = Class98_Sub46_Sub6.method1546(i_19_, i_18_, (byte) -64,
				(incomingBytes));
		if (string.contains("Clan Chat")) {
			string = string.replace("Clan Chat", "Guild Chat");

		}
		if (string.contains("clan chat")) {
			string = string.replace("clan chat", "guild chat");
		}
		if (string.contains("Clan name:")) {
			string = string.replace("Clan name:", "Guild name:");
		}
		if (string.equals("Chat Setup")) {
			string = string.replace("Chat Setup", "Guild Setup");
		}
		if (string.contains("Who can enter chat?")) {
			string = string.replace("Who can enter chat?",
					"Who can enter guild?");
		}
		if (string.contains("Join Chat")) {
			string = string.replace("Join Chat", "Join Guild");
		}
		if (string.contains("clan")) {
			string = string.replace("clan", "guild");
		}
		if (string.contains("Ecto-token")) {
			string = string.replace("Ecto-token", "Loyalty-token");
		}
		if (string.contains("Fist of guthix token")) {
			string = string.replace("Fist of guthix token",
					"Bounty hunter token");
		}
		if (string.equals("Darkmeyer blood trader")) {
			string = string.replace("Darkmeyer blood trader",
					"Black Dragon Leader");
		}
		if (string.equals("Cassie")) {
			string = string.replace("Cassie", "Black Dragon Trader");
		}
		if (string.equals("Bow and Arrow salesman")) {
			string = string.replace("Bow and Arrow salesman",
					"Black Dragon Trader - Ranging");
		}
		if (string.equals("Ghost shopkeeper")) {
			string = string.replace("Ghost shopkeeper",
					"Black Dragon Trader - Buyer");
		}
		if (string.equals("Bob")) {
			string = string.replace("Bob", "Black Dragon Trader - Tools");
		}
		if (string.equals("Queen of Sunrise")) {
			string = string.replace("Queen of Sunrise", "Princess Klein");
		}
		if (string.contains("Jagex") || string.contains("jagex")) {
			string = string.replace("Jagex", "CodeUSA Software");
		}
		if (string.contains("Jagex Moderator")) {
			string = string.replace("Jagex Moderator", "CodeUSA Moderator");
		}
		if (string.contains("Jagex Moderators")) {
			string = string.replace("Jagex Moderators", "CodeUSA Moderators");
		}
		if (string.contains("jagex")) {
			string = string.replace("jagex", "codeusa software");
		}
		if (string.contains("JagMod999")) {
			string = string.replace("Jag Mod999", "Code Mod999");
		}
		if (string.equals("Linza")) {
			string = string.replace("Linza", "Ammit");
		}

		if (string.equals("J-mod Options")) {
			string = string.replace("J-mod Options", "CodeUSA Options");
		}
		if (string
				.equals("Enter the player name whose channel you wish to join:")) {
			string = string.replace(
					"Enter the player name whose channel you wish to join:",
					"Enter the player name whose guild you wish to join:");
		}
		if (string.contains("clan name:")) {
			string = string.replace("clan name:", "guild name:");
		}
		/*
		 * string = string.replace("Dungeoneering", "Conquesting"); } if
		 * (string.contains("chat channel")) { string =
		 * string.replace("chat channel", "guild channel"); }
		 */
		if (string.contains("Draynor") || string.contains("draynor")) {
			string = string.replace("Draynor", "Tristram").replace("draynor",
					"tristram");
		}
		if (string.contains("Clan Quick Chat")) {
			string = string.replace("Clan Quick Chat", "Guild Quick Chat");
		}
		if (string.contains("Clan")) {
			string = string.replace("Clan", "Guild");
		}
		if (string.contains("Leave Chat")) {
			string = string.replace("Leave Chat", "Leave Guild");
		}
		if (string.contains("Not in chat")) {
			string = string.replace("Not in chat", "Not in guild");
		}
		if (string.contains("Crash<br>Island")) {
			string = string.replace("Crash<br>Island", "Thank you  "
					+ formatPlayerNameForDisplay(Class98_Sub5.userName)
					+ "<br> But Our Princess Is In Another Castle! ");
		}
		if (string.contains("Private")) {
			string = string.replace("Private", "Whispers");
		}
		if (string.contains("Pazuzu")) {
			string = string.replace("Pazuzu", "Lori");
		}
		if (string.contains("Mausoleum")) {
			string = string.replace("Mausoleum", "Mercenary Convoy");
		}
		if (string.contains("Dean Vell")) {
			string = string.replace("Dean Vellio", "Rick");
		}
		if (string.contains("For accounts created after the 24th")) {
			string = string
					.replace(
							"For accounts created after the 24th of November 2010, please use your email address to login. Otherwise please login with your username.",
							"Accounts must be valid and registered on http://codeusa.net/ if you have not created an account here you must do so or you will be unable to login. If you have forgotten your password, recover it.");
		}
		if (string.contains("Recover Account")) {
			string = string.replace("Recover Account", "Verify Email");
		}
		if (string
				.contains("Your account has been locked, as we suspect it has been stolen.")) {
			string = string
					.replace(
							"Your account has been locked, as we suspect it has been stolen.",
							"Your account is currently locked because we need to verify your email.");
		}
		if (string.contains("A Meiyerditch child")) {
			string = string.replace("A Meiyerditch child", "Carl");
		}
		if (string.contains("Zachory Bragg")) {
			string = string.replace("Zachory Bragg", "Shane");
		}
		if (string.contains("Here Be<br>Penguins")) {
			string = string.replace("Here Be<br>Penguins",
					"Here Be Cupcakes<br>Penguins<br>& A would be Princess");
		}
		if (string.contains("clan quick chat")) {
			string = string.replace("clan quick chat", "guild quick chat");
		}
		if (string.contains("Runescape")) {
			string = string.replace("Runescape", "Codeusa");
		}
		if (string
				.contains("As your Magic level increases, so does your resistance to magic damage. As such, rangers and warriors will find training their Magic skill worthwhile.")) {
			string = string
					.replace(
							"As your Magic level increases, so does your resistance to magic damage. As such, rangers and warriors will find training their Magic skill worthwhile.",
							"Welcome to the CodeUSA Alpha");
		}
		if (string.contains("RuneScape")) {
			string = string.replace("RuneScape", "CodeUSA");
		}
		if (string.contains("runescape")) {
			string = string.replace("runescape", "codeusa");
		}
		/**
		 * and here
		 */
		return string;
	}

	public static String formatPlayerNameForDisplay(String name) {
		name = name.replaceAll("_", " ");
		name = name.toLowerCase();
		final StringBuilder newName = new StringBuilder();
		boolean wasSpace = true;
		for (int i = 0; i < name.length(); i++) {
			if (wasSpace) {
				newName.append(("" + name.charAt(i)).toUpperCase());
				wasSpace = false;
			} else {
				newName.append(name.charAt(i));
			}
			if (name.charAt(i) == ' ') {
				wasSpace = true;
			}
		}
		return newName.toString();
	}

	final void method1205(final BigInteger biginteger, final boolean bool,
			final BigInteger biginteger_20_) {
		try {
			final int i = position;
			position = 0;
			final byte[] is = new byte[i];
			method1190(is, bool, i, 0);
			final BigInteger biginteger_21_ = new BigInteger(is);
			final BigInteger biginteger_22_ = biginteger_21_; // disabled
			final byte[] is_23_ = biginteger_22_.toByteArray();
			position = 0;
			if (bool == true) {
				writeShort(is_23_.length, 1571862888);
				method1217(is_23_, is_23_.length, -1, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.IA("
					+ (biginteger != null ? "{...}" : "null") + ',' + bool
					+ ',' + (biginteger_20_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void writeByteS(final int i, final int i_24_) {
		do {
			try {
				incomingBytes[position++] = (byte) (128 + -i);
				if (i_24_ <= -16) {
					break;
				}
				method1192((byte) -121);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ji.HA(" + i
						+ ',' + i_24_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1207(final byte i, final int i_25_) {
		try {
			incomingBytes[position - i_25_ + -2] = (byte) (i_25_ >> 1804543080);
			if (i != 90) {
				readUnsignedByte((byte) -108);
			}
			incomingBytes[-1 + (-i_25_ + position)] = (byte) i_25_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.CC(" + i + ','
					+ i_25_ + ')');
		}
	}

	final int method1208(final int i) {
		try {
			int i_26_ = 0;
			if (i != 3893) {
				return 116;
			}
			int i_27_;
			for (i_27_ = readSmart(); i_27_ == 32767; i_27_ = readSmart()) {
				i_26_ += 32767;
			}
			i_26_ += i_27_;
			return i_26_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.P(" + i + ')');
		}
	}

	final int readInt2(final int i) {
		try {
			position += 4;
			if (i >= -7) {
				position = -81;
			}
			return (((incomingBytes[-2 + position]) & 0xff)
					+ (((incomingBytes[position + -4]) & 0xff) << 1981066736) + ((((incomingBytes[-3
					+ position]) & 0xff) << -1310222600) + ((0xff & (incomingBytes[position - 1])) << 1074766536)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.UB(" + i + ')');
		}
	}

	final boolean method1210(final int i) {
		try {
			position -= 4;
			final int i_29_ = Class365.method3937(position, incomingBytes, 0,
					false);
			final int i_30_ = readInt(-2);
			if (i_29_ == i_30_) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.EB(" + i + ')');
		}
	}

	final void method1211(final byte i, final int i_31_) {
		try {
			if (i > 79) {
				incomingBytes[-i_31_ + (position - 1)] = (byte) i_31_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.HB(" + i + ','
					+ i_31_ + ')');
		}
	}

	final int readShortA(final int i) {
		try {
			position += 2;
			if (i <= 40) {
				return -92;
			}
			return ((0xff & (incomingBytes[position - 1]) - 128) + (0xff00 & ((incomingBytes[position
					+ -2]) << -834637528)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.GC(" + i + ')');
		}
	}

	final void method1213(final int i, final long l, int i_32_) {
		try {
			if (--i_32_ < 0 || i_32_ > 7) {
				throw new IllegalArgumentException();
			}
			if (i != 31498) {
				method1208(4);
			}
			for (int i_33_ = 8 * i_32_; i_33_ >= 0; i_33_ -= 8) {
				incomingBytes[position++] = (byte) (int) (l >> i_33_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.S(" + i + ','
					+ l + ',' + i_32_ + ')'));
		}
	}

	final int readUShort(final boolean bool) { // h
		try {
			position += 2;
			if (bool != false) {
				method1244(45, (byte) 31);
			}
			int i = ((0xff00 & ((incomingBytes[position + -2]) << 1357336488)) - -((incomingBytes[position
					+ -1]) & 0xff));
			if (i > 32767) {
				i -= 65536;
			}
			return i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.EA(" + bool
					+ ')');
		}
	}

	public int readCustomUShort() {
		position += 2;
		final int i = (incomingBytes[position - 1] & 0xff)
				+ ((incomingBytes[position - 2] & 0xff) << 8);
		if (i == 65535) {
			return -1;
		}
		return i;
	}

	final void method1215(final int[] is, final int i, final int i_34_,
			final byte i_35_) {
		try {
			if (i_35_ != 30) {
				method1192((byte) -61);
			}
			final int i_36_ = position;
			position = i;
			final int i_37_ = (-i + i_34_) / 8;
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff); i_38_++) {
				int i_39_ = readInt(i_35_ ^ ~0x1f);
				int i_40_ = readInt(-2);
				int i_41_ = -957401312;
				final int i_42_ = -1640531527;
				int i_43_ = 32;
				while ((i_43_-- ^ 0xffffffff) < -1) {
					i_40_ -= (is[i_41_ >>> 626734027 & 0x5a600003] + i_41_ ^ ((i_39_ << 972126180 ^ i_39_ >>> -207185147) - -i_39_));
					i_41_ -= i_42_;
					i_39_ -= (i_41_ + is[i_41_ & 0x3] ^ i_40_
							+ (i_40_ << -1927182972 ^ i_40_ >>> -1816832155));
				}
				position -= 8;
				writeInt(1571862888, i_39_);
				writeInt(i_35_ + 1571862858, i_40_);
			}
			position = i_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.AB("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_34_
					+ ',' + i_35_ + ')'));
		}
	}

	static final void method1216(final int i) {
		try {
			if (i != -17470) {
				method1216(-14);
			}
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(0, -42, 15);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.HC(" + i + ')');
		}
	}

	final void method1217(final byte[] is, final int i, final int i_44_,
			final int i_45_) {
		try {
			int i_46_ = i_45_;
			if (i_44_ != -1) {
				anInt3994 = 121;
			}
			for (/**/; i + i_45_ > i_46_; i_46_++) {
				incomingBytes[position++] = is[i_46_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.DB("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_44_
					+ ',' + i_45_ + ')'));
		}
	}

	final void method1218(final int i, final int i_47_) {
		try {
			incomingBytes[position++] = (byte) i;
			incomingBytes[position++] = (byte) (i >> 1489446952);
			if (i_47_ != 1489446952) {
				incomingBytes = null;
			}
			incomingBytes[position++] = (byte) (i >> 182207856);
			incomingBytes[position++] = (byte) (i >> -43371176);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.MC(" + i + ','
					+ i_47_ + ')');
		}
	}

	final int readInt(final int i) {
		try {
			position += 4;
			return ((0xff & (incomingBytes[-1 + position]))
					+ ((0xff0000 & ((incomingBytes[-3 + position]) << 326096944)) + ((0xff & (incomingBytes[-4
							+ position])) << 1206151768)) + ((incomingBytes[-2
					+ position]) << -1753478520 & 0xff00));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.SB(" + i + ')');
		}
	}

	final int readLEShortA(final byte i) {
		try {
			position += 2;
			return ((((incomingBytes[position - 1]) & 0xff) << -1492087128) + (0xff & (incomingBytes[-2
					+ position]) - 128));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.FB(" + i + ')');
		}
	}

	final void method1221(final int i, final long l) {
		try {
			incomingBytes[position++] = (byte) (int) (l >> 47442488);
			if (i > -49) {
				position = -23;
			}
			incomingBytes[position++] = (byte) (int) (l >> 1602810288);
			incomingBytes[position++] = (byte) (int) (l >> 140118760);
			incomingBytes[position++] = (byte) (int) (l >> 1658586912);
			incomingBytes[position++] = (byte) (int) (l >> -1173783976);
			incomingBytes[position++] = (byte) (int) (l >> -1213337456);
			incomingBytes[position++] = (byte) (int) (l >> 170858184);
			incomingBytes[position++] = (byte) (int) l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.JB(" + i + ','
					+ l + ')');
		}
	}

	final String method1222(final int i) {
		try {
			if (((incomingBytes[position]) ^ 0xffffffff) == i) {
				position++;
				return null;
			}
			return readString((byte) 84);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.WA(" + i + ')');
		}
	}

	final String method1223(final int i) {
		try {
			final byte i_49_ = (incomingBytes[position++]);
			if ((i_49_ ^ 0xffffffff) != -1) {
				throw new IllegalStateException("Bad version number in gjstr2");
			}
			final int i_50_ = position;
			while (((incomingBytes[position++]) ^ 0xffffffff) != -1) {
				/* empty */
			}
			if (i != -1) {
				return null;
			}
			final int i_51_ = -1 + (position + -i_50_);
			if (i_51_ == 0) {
				return "";
			}
			final String str = Class98_Sub46_Sub6.method1546(i_51_, i_50_,
					(byte) -108, (incomingBytes));
			/**
			 * replace here
			 */

			return str;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.PB(" + i + ')');
		}
	}

	final void writeShort(final int i, final int i_52_) {
		try {
			incomingBytes[position++] = (byte) (i >> 737932552);
			incomingBytes[position++] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.QB(" + i + ','
					+ i_52_ + ')');
		}
	}

	final void method1225(final int i, final int i_53_) {
		do {
			try {
				incomingBytes[position++] = (byte) (i_53_ >> 1668051632);
				incomingBytes[position++] = (byte) (i_53_ >> 831021000);
				incomingBytes[position++] = (byte) i_53_;
				if (i == -24472) {
					break;
					// readInt(46);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ji.RB(" + i
						+ ',' + i_53_ + ')'));
			}
			break;
		} while (false);
	}

	final int readByteC(final byte i) {
		try {
			return (-(incomingBytes[position++]) & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.UA(" + i + ')');
		}
	}

	final int method1227(final byte i) {
		try {
			if (i != -1) {
				updateTilePosition = null;
			}
			position += 3;
			int i_55_ = ((((incomingBytes[-2 + position]) & 0xff) << -1482393368) + (((incomingBytes[position - 3]) << 1099514736 & 0xff0000) + ((incomingBytes[-1
					+ position]) & 0xff)));
			if ((i_55_ ^ 0xffffffff) < -8388608) {
				i_55_ -= 16777216;
			}
			return i_55_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.LA(" + i + ')');
		}
	}

	final int readShort(byte i) {
		try {
			if (i != 127)
				updateTilePosition = null;
			((ByteBuffer) this).position += 2;
			return (((((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position - 1]) & 0xff) + (((((ByteBuffer) this).incomingBytes[-2
					+ ((ByteBuffer) this).position]) & 0xff) << -1546530360));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.CB(" + i + ')');
		}
	}
	

	
	
	final int readShort1(final byte i) {
		try {
			position += 2;
			return ((0xff & (incomingBytes[-2 + position])) + (((incomingBytes[-1
					+ position]) & 0xff) << 850116168));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.PA(" + i + ')');
		}
	}

	final int readUnsignedByte(final byte i) {
		try {
			return ((incomingBytes[position++]) & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.OA(" + i + ')');
		}
	}

	final int readByteS(final int i) {
		try {
			return (128 + -(incomingBytes[position++]) & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.OB(" + i + ')');
		}
	}

	final void method1231(final int i, final byte i_59_) {
		try {
			incomingBytes[position++] = (byte) (128 + i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.Q(" + i + ','
					+ i_59_ + ')');
		}
	}

	final void method1232(final int i, final byte i_61_) {
		do {
			try {
				incomingBytes[position++] = (byte) (i >> 1586241040);
				incomingBytes[position++] = (byte) (i >> 1689622712);
				incomingBytes[position++] = (byte) i;
				incomingBytes[position++] = (byte) (i >> 1259248840);
				if (i_61_ > 74) {
					break;
				}
				anInt3994 = 115;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ji.IB(" + i
						+ ',' + i_61_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1233(final byte i, final int i_62_) {
		try {
			incomingBytes[-4 + (-i_62_ + position)] = (byte) (i_62_ >> 749084632);
			if (i > -69) {
				method1190(null, false, -107, -119);
			}
			incomingBytes[-3 + (-i_62_ + position)] = (byte) (i_62_ >> -1146031696);
			incomingBytes[-i_62_ + position + -2] = (byte) (i_62_ >> -2096973304);
			incomingBytes[-i_62_ + (position + -1)] = (byte) i_62_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.O(" + i + ','
					+ i_62_ + ')');
		}
	}

	final byte method1234(final int i) {
		try {
			return (byte) (-(incomingBytes[position++]) + 128);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.PC(" + i + ')');
		}
	}

	final void method1235(final boolean bool, final int[] is, final int i,
			final int i_63_) {
		do {
			try {
				final int i_64_ = position;
				position = i;
				final int i_65_ = (i_63_ - i) / 8;
				for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > (i_65_ ^ 0xffffffff); i_66_++) {
					int i_67_ = readInt(-2);
					int i_68_ = readInt(-2);
					int i_69_ = 0;
					final int i_70_ = -1640531527;
					int i_71_ = 32;
					while ((i_71_-- ^ 0xffffffff) < -1) {
						i_67_ += ((i_68_ << 2089946276 ^ i_68_ >>> 1651808389) - -i_68_)
								^ is[i_69_ & 0x3] + i_69_;
						i_69_ += i_70_;
						i_68_ += (is[(0x1fd8 & i_69_) >>> -1054972021] + i_69_ ^ (i_67_ >>> -406550651 ^ i_67_ << 2098622308)
								+ i_67_);
					}
					position -= 8;
					writeInt(1571862888, i_67_);
					writeInt(1571862888, i_68_);
				}
				position = i_64_;
				if (bool == true) {
					break;
				}
				anInt3994 = -83;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ji.AC("
						+ bool + ',' + (is != null ? "{...}" : "null") + ','
						+ i + ',' + i_63_ + ')'));
			}
			break;
		} while (false);
	}

	final int readByteA(final boolean bool) {
		try {
			if (bool != true) {
				incomingBytes = null;
			}
			return 0xff & (incomingBytes[position++]) - 128;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.JA(" + bool
					+ ')');
		}
	}

	final void method1237(final int i, final int i_72_) {
		try {
			if (i >= 0 && (i ^ 0xffffffff) > -129) {
				method1194(i, -63);
			} else {
				if (i_72_ >= -117) {
					method1194(-1, -2);
				}
				if (i >= 0 && (i ^ 0xffffffff) > -32769) {
					writeShort(i + 32768, 1571862888);
				} else {
					throw new IllegalArgumentException();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.EC(" + i + ','
					+ i_72_ + ')');
		}
	}

	final void writeLEShortA(final int i, final int i_73_) {
		try {
			incomingBytes[position++] = (byte) (i_73_ + i);
			incomingBytes[position++] = (byte) (i >> 806931912);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.IC(" + i + ','
					+ i_73_ + ')');
		}
	}

	final int method1239(final int i) {
		try {
			final int i_74_ = 0xff & (incomingBytes[position]);
			if ((i_74_ ^ 0xffffffff) > -129) {
				return -64 + readUnsignedByte((byte) 31);
			}
			return readUnsignedShort((byte) 127) + -49152; // 49152
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.LB(" + i + ')');
		}
	}

	final int method1240(final byte i) {
		try {
			if (i != -20) {
				return 50;
			}
			int i_76_ = (incomingBytes[position++]);
			int i_77_ = 0;
			for (/**/; i_76_ < 0; i_76_ = (incomingBytes[position++])) {
				i_77_ = (i_76_ & 0x7f | i_77_) << 936736039;
			}
			return i_76_ | i_77_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.NB(" + i + ')');
		}
	}

	static final boolean method1241(final boolean bool, final int i,
			final int i_78_) {
		try {
			if (bool != false) {
				return false;
			}
			if ((0x100 & i_78_) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ji.L(" + bool
					+ ',' + i + ',' + i_78_ + ')'));
		}
	}

	final int method1242(final int i) {// k
		try {
			position += 2;
			int i_79_ = (((incomingBytes[-1 + position]) - 128 & 0xff) + (0xff00 & ((incomingBytes[-2
					+ position]) << 365122312)));
			if ((i_79_ ^ 0xffffffff) < -32768) {
				i_79_ -= 65536;
			}
			return i_79_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.OC(" + i + ')');
		}
	}

	public static void method1243(final int i) {
		try {
			aClass207_3995 = null;
			if (i <= 79) {
				anInt3994 = -43;
			}
			updateTilePosition = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.JC(" + i + ')');
		}
	}

	final void method1244(final int i, final byte i_80_) {
		try {
			if (i_80_ != 112) {
				method1217(null, -122, -10, -57);
			}
			incomingBytes[position++] = (byte) -i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.VB(" + i + ','
					+ i_80_ + ')');
		}
	}

	final void writeLEInt(final int i, final int i_81_) {
		try {
			incomingBytes[position++] = (byte) i;
			if (i_81_ != 1046032984) {
				readInt(13);
			}
			incomingBytes[position++] = (byte) (i >> -965600312);
			incomingBytes[position++] = (byte) (i >> 534653328);
			incomingBytes[position++] = (byte) (i >> 1046032984);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.TB(" + i + ','
					+ i_81_ + ')');
		}
	}

	final long method1246(final int i) {
		try {
			final long l = 0xffffffffL & readInt(-2);
			final long l_82_ = readInt(-2) & 0xffffffffL;
			if (i >= -87) {
				readShort1((byte) 15);
			}
			return l_82_ + (l << 1722451168);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.N(" + i + ')');
		}
	}

	final void method1247(final int i, final int i_83_) {
		try {
			incomingBytes[position++] = (byte) i;
			if (i_83_ != 4) {
				method1187((byte) 12);
			}
			incomingBytes[position++] = (byte) (i >> 1291747880);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.DA(" + i + ','
					+ i_83_ + ')');
		}
	}

	final long method1248(int i, final boolean bool) {
		try {
			if (--i < 0 || (i ^ 0xffffffff) < -8) {
				throw new IllegalArgumentException();
			}
			if (bool != false) {
				readIntReverse(false);
			}
			int i_84_ = 8 * i;
			long l = 0L;
			for (/**/; i_84_ >= 0; i_84_ -= 8) {
				l |= ((incomingBytes[position++]) & 0xffL) << i_84_;
			}
			return l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.BB(" + i + ','
					+ bool + ')');
		}
	}

	final int readIntReverse(final boolean bool) {
		try {
			position += 4;
			return (((incomingBytes[-4 + position]) & 0xff)
					+ ((0xff & (incomingBytes[-2 + position])) << -1498293360) + ((((incomingBytes[-1
					+ position]) & 0xff) << 1899061624) - -((0xff & (incomingBytes[-3
					+ position])) << 279902248)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.DC(" + bool
					+ ')');
		}
	}

	ByteBuffer(final int i) {
		try {
			incomingBytes = Class129.method2225(false, i);
			position = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.<init>(" + i
					+ ')');
		}
	}

	ByteBuffer(final byte[] is) {
		try {
			position = 0;
			incomingBytes = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ji.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method1250(final int i, final int i_85_, final boolean bool,
			final byte[] is) {
		do {
			try {
				for (int i_86_ = i_85_ + i + -1; (i_86_ ^ 0xffffffff) <= (i ^ 0xffffffff); i_86_--) {
					is[i_86_] = (byte) (-128 + (incomingBytes[position++]));
				}
				if (bool == false) {
					break;
				}
				anInt3994 = -120;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ji.NA(" + i
						+ ',' + i_85_ + ',' + bool + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		updateTilePosition = new IncomingOpcode(114, 3);
	}
}
