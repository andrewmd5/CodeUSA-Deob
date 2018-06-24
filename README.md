# CodeUSA-Deob
The modified 637 deob that connects to CodeUSA RSPS


### Primary features
- Support for loading 800+ content
- Supports the newer model header
- Supports 700+ animations 
- Supports 700+ item defs
- Supports OpenGL, DirectX and Software mode rendering
- Support for dynamically updating model colors (Completionist cape)




### Primary Bugs
- No support for loading over 65k models, anything over that returns -1

### Concerns 
- There are a lot of hard coded elements, i'd remove them; look around animations and npcs.
- The cache provided with this is very CodeUSA specific so I'd recommened get a fresh 637 cache and packing what you want
- This is not my fully refactored client, I need to find it on one of my usbs, I will commit updates as I go. 


There is also a modified player update block, to get proper appearance you'll need to modify yours.

```java
        appearanceData.writeRS2String(p.getUsername());
		for (int c = 0; c < p.completionistColours.length; c++) {
			appearanceData.writeShort(p.completionistColours[c]);
		}
		for (int m = 0; m < p.maxColours.length; m++) {
			appearanceData.writeShort(p.maxColours[m]);
		}
		final int combatLevel = p.getSkills().getCombatLevel();
		final int combatLevelWithoutSum = p.getSkills().getCombatLevelWithoutSummoning();
		appearanceData.writeByte(inWild ? combatLevelWithoutSum : combatLevel);
		appearanceData.writeByte(inWild ? combatLevel : 0);
		appearanceData.writeShort(0);
		appearanceData.writeByte(0);

		updateMessage.writeByteA(appearanceData.position());
		updateMessage.writeBytes(appearanceData.getBuffer());
		
```

### License 

All I ask is you retain the original notice of release, buy me a beer if you use this and we meet and provide some sort of acknowledgement to the client source you are using (i.e link back to this github) 


### Setup 

The client requires some specific server side code, I will be releasing that shortly, this will be updated then.
