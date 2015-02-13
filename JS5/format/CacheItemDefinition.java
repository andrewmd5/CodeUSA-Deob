package org.codeusa.cache.format;

import java.nio.ByteBuffer;
import java.util.HashMap;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;
import org.codeusa.util.BufferUtils;

public class CacheItemDefinition {

	private final int id;
	private boolean loaded;

	private int interfaceModelId;
	private String name;

	private int modelZoom;
	private int modelRotation1;
	private int modelRotation2;
	private int modelOffset1;
	public int noteId = -1;
	public int noteTemplateId = -1;
	private int modelOffset2;
	public int recolourId = -1; // not sure
	public int recolourTemplateId = -1;
	private int stackable;
	private int value;
	private boolean membersOnly;

	private int maleWornModelId1 = -1;
	private int femaleWornModelId1;
	private int maleWornModelId2 = -1;
	private int femaleWornModelId2;

	private String[] groundOptions;
	private String[] inventoryOptions;

	private int[] originalModelColors;
	private int[] modifiedModelColors;
	public short[] textureColour1;
	public short[] textureColour2;
	private byte[] unknownArray1;
	private int[] unknownArray2;

	private boolean unnoted;

	private int colourEquip1;
	private int colourEquip2;
	private int certId;
	private int certTemplateId;
	private int[] stackIds;
	private int[] stackAmounts;
	private int teamId;
	private int lendId;
	private int lendTemplateId;

	private static HashMap<Integer, Object> clientScriptData;

	public static CacheItemDefinition getItemDefinition(final int itemId) {
		final CacheItemDefinition def = new CacheItemDefinition(itemId);
		def.loadItemDefinition();
		return def;
	}

	public CacheItemDefinition(final int id) {
		this.id = id;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void loadItemDefinition() {
		setDefaultsVariableValules();
		setDefaultOptions();
		byte[] is = null;
		try {
			is = CacheManager.getData(CacheConstants.ITEMDEF_IDX_ID, id >>> 8,
					id & 0xFF);
		} catch (final Exception e) {
			e.printStackTrace();
			System.out.println("Item " + id + " doesn't exist in the cache!");
		}
		if (is != null) {
			try {
				readOpcodeValues(ByteBuffer.wrap(is));
			} catch (final Exception e) {
				System.out.println("Error while reading " + id);
			}
		}
		loaded = true;
	}

	public boolean canEquip() {
		return (maleWornModelId1 >= 0) || (maleWornModelId2 >= 0);
	}

	public boolean hasSpecialBar() {
		if (clientScriptData == null) {
			return false;
		}
		final Object specialBar = clientScriptData.get(687);
		return (specialBar instanceof Integer) && ((Integer) specialBar == 1);
	}

	public int getGroupId() {
		if (clientScriptData == null) {
			return 0;
		}
		final Object specialBar = clientScriptData.get(686);
		if ((specialBar != null) && (specialBar instanceof Integer)) {
			return (Integer) specialBar;
		}
		return 0;
	}

	public int getRenderAnimId() {
		if (clientScriptData == null) {
			return 1426;
		}
		final Object animId = clientScriptData.get(644);
		if (animId instanceof Integer) {
			return (Integer) animId;
		}
		return 1426;
	}

	public int getQuestId() {
		if (clientScriptData == null) {
			return -1;
		}
		final Object questId = clientScriptData.get(861);
		if ((questId != null) && (questId instanceof Integer)) {
			return (Integer) questId;
		}
		return -1;
	}

	public void test() {
		if (clientScriptData == null) {
			return;
		}
		for (final Object o : clientScriptData.entrySet()) {
			System.out.println(o);
		}
	}

	public HashMap<Integer, Integer> getWearingSkillRequiriments() {
		if (clientScriptData == null) {
			return null;
		}
		final HashMap<Integer, Integer> skills = new HashMap<Integer, Integer>();
		int nextLevel = -1;
		int nextSkill = -1;
		for (final int key : clientScriptData.keySet()) {
			final Object value = clientScriptData.get(key);
			if (value instanceof String) {
				continue;
			}
			if ((key >= 749) && (key < 797)) {
				if ((key % 2) == 0) {
					nextLevel = (Integer) value;
				} else {
					nextSkill = (Integer) value;
				}
				if ((nextLevel != -1) && (nextSkill != -1)) {
					skills.put(nextSkill, nextLevel);
					nextLevel = -1;
					nextSkill = -1;
				}
			}
		}
		return skills;
	}

	private void setDefaultsVariableValules() {

	}

	private void setDefaultOptions() {
		groundOptions = new String[] { null, null, "take", null, null };
		inventoryOptions = new String[] { null, null, null, null, "drop" };
	}

	private void readValues(final ByteBuffer buffer, final int opcode) {
		if (opcode == 1) {
			interfaceModelId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 2) {
			name = BufferUtils.readRS2String(buffer);
		} else if (opcode == 4) {
			modelZoom = buffer.getShort() & 0xFFFF;
		} else if (opcode == 5) {
			modelRotation1 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 6) {
			modelRotation2 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 7) {
			modelOffset1 = buffer.getShort() & 0xFFFF;
			if (modelOffset1 > 32767) {
				modelOffset1 -= 65536;
			}
			modelOffset1 <<= 0;
		} else if (opcode == 8) {
			modelOffset2 = buffer.getShort() & 0xFFFF;
			if (modelOffset2 > 32767) {
				modelOffset2 -= 65536;
			}
			modelOffset2 <<= 0;
		} else if (opcode == 11) {
			stackable = 1;
		} else if (opcode == 12) {
			value = buffer.getInt();
		} else if (opcode == 16) {
			membersOnly = true;
		} else if (opcode == 18) {
			buffer.getShort();
		} else if (opcode == 23) {
			maleWornModelId1 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 24) {
			femaleWornModelId1 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 25) {
			maleWornModelId2 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 26) {
			femaleWornModelId2 = buffer.getShort() & 0xFFFF;
		} else if ((opcode >= 30) && (opcode < 35)) {
			groundOptions[opcode - 30] = BufferUtils.readRS2String(buffer);
		} else if ((opcode >= 35) && (opcode < 40)) {
			inventoryOptions[opcode - 35] = BufferUtils.readRS2String(buffer);
		} else if (opcode == 40) {
			final int length = buffer.get();
			originalModelColors = new int[length];
			modifiedModelColors = new int[length];
			for (int index = 0; index < length; index++) {
				originalModelColors[index] = buffer.getShort();
				modifiedModelColors[index] = buffer.getShort();
			}
		} else if (opcode == 41) {
			final int length = buffer.get();
			textureColour1 = new short[length];
			textureColour2 = new short[length];
			for (int index = 0; index < length; index++) {
				textureColour1[index] = buffer.getShort();
				textureColour2[index] = buffer.getShort();
			}
		} else if (opcode == 42) {
			final int length = buffer.get();
			unknownArray1 = new byte[length];
			for (int index = 0; index < length; index++) {
				unknownArray1[index] = buffer.get();
			}
		} else if (opcode == 65) {
			unnoted = true;
		} else if (opcode == 78) {
			colourEquip1 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 79) {
			colourEquip2 = buffer.getShort() & 0xFFFF;
		} else if (opcode == 90) {
			buffer.getShort();
		} else if (opcode == 91) {
			buffer.getShort();
		} else if (opcode == 92) {
			buffer.getShort();
		} else if (opcode == 93) {
			buffer.getShort();
		} else if (opcode == 95) {
			buffer.getShort();
		} else if (opcode == 96) {
			buffer.get();
		} else if (opcode == 97) {
			noteId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 98) {
			noteTemplateId = buffer.getShort() & 0xFFFF;
		} else if ((opcode >= 100) && (opcode < 110)) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[opcode - 100] = buffer.getShort() & 0xFFFF;
			stackAmounts[opcode - 100] = buffer.getShort() & 0xFFFF;
		} else if (opcode == 110) {
			buffer.getShort();
		} else if (opcode == 111) {
			buffer.getShort();
		} else if (opcode == 112) {
			buffer.getShort();
		} else if (opcode == 113) {
			buffer.get();
		} else if (opcode == 114) {
			buffer.get();
		} else if (opcode == 115) {
			teamId = buffer.get();
		} else if (opcode == 121) {
			lendId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 122) {
			lendTemplateId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 125) {
			buffer.get();
			buffer.get();
			buffer.get();
		} else if (opcode == 126) {
			buffer.get();
			buffer.get();
			buffer.get();
		} else if (opcode == 127) {
			buffer.get();
			buffer.getShort();
		} else if (opcode == 128) {
			buffer.get();
			buffer.getShort();
		} else if (opcode == 129) {
			buffer.get();
			buffer.getShort();
		} else if (opcode == 130) {
			buffer.get();
			buffer.getShort();
		} else if (opcode == 132) {
			final int length = buffer.get();
			unknownArray2 = new int[length];
			for (int index = 0; index < length; index++) {
				unknownArray2[index] = buffer.getShort() & 0xFFFF;
			}
		} else if (opcode == 134) {
			buffer.get();
		} else if (opcode == 139) {
			recolourId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 140) {
			recolourTemplateId = buffer.getShort() & 0xFFFF;
		} else if (opcode == 249) {
			final int length = buffer.get();
			if (clientScriptData == null) {
				clientScriptData = new HashMap<Integer, Object>();
			}
			for (int index = 0; index < length; index++) {
				final boolean string = buffer.get() == 1;
				final int key = BufferUtils.getMediumInt(buffer);
				final Object value = string ? BufferUtils.readRS2String(buffer)
						: buffer.getInt();
				clientScriptData.put(key, value);
			}
		} else {
			System.out.println("Unhandled opcode! opcode:" + opcode);
		}
	}

	private void readOpcodeValues(final ByteBuffer buffer) {
		while (true) {
			final int opcode = buffer.get() & 0xFF;
			if (opcode == 0) {
				break;
			}
			readValues(buffer, opcode);
		}
	}

	public int getId() {
		return id;
	}

	public int getInterfaceModelId() {
		return interfaceModelId;
	}

	public String getName() {
		return name;
	}

	public int getModelZoom() {
		return modelZoom;
	}

	public int getModelRotation1() {
		return modelRotation1;
	}

	public int getModelRotation2() {
		return modelRotation2;
	}

	public int getModelOffset1() {
		return modelOffset1;
	}

	public int getModelOffset2() {
		return modelOffset2;
	}

	public int getStackable() {
		return stackable;
	}

	public int getValue() {
		return value;
	}

	public boolean isMembersOnly() {
		return membersOnly;
	}

	public int getMaleWornModelId1() {
		return maleWornModelId1;
	}

	public int getFemaleWornModelId1() {
		return femaleWornModelId1;
	}

	public int getMaleWornModelId2() {
		return maleWornModelId2;
	}

	public int getFemaleWornModelId2() {
		return femaleWornModelId2;
	}

	public String[] getGroundOptions() {
		return groundOptions;
	}

	public String[] getInventoryOptions() {
		return inventoryOptions;
	}

	public int[] getOriginalModelColors() {
		return originalModelColors;
	}

	public int[] getModifiedModelColors() {
		return modifiedModelColors;
	}

	public byte[] getUnknownArray1() {
		return unknownArray1;
	}

	public int[] getUnknownArray2() {
		return unknownArray2;
	}

	public boolean isUnnoted() {
		return unnoted;
	}

	public void setColourEquip1(final int colourEquip1) {
		this.colourEquip1 = colourEquip1;
	}

	public int getColourEquip1() {
		return colourEquip1;
	}

	public int getColourEquip2() {
		return colourEquip2;
	}

	public int getCertId() {
		return certId;
	}

	public int getCertTemplateId() {
		return certTemplateId;
	}

	public int[] getStackIds() {
		return stackIds;
	}

	public int[] getStackAmounts() {
		return stackAmounts;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getLendId() {
		return lendId;
	}

	public int getLendTemplateId() {
		return lendTemplateId;
	}
}
