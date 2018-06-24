import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelLoader {
	
	

	public static List<Integer> models = null;

	public ModelLoader() {
		loadArray();
	}

	public static byte[] loadNewModel(int i) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream(
				"./models/" + i + ".dat"));
		byte[] buffer = new byte[(int) new File("./models/" + i + ".dat")
		.length()];
		dis.readFully(buffer);
		dis.close();
		return buffer;
	}

	public static boolean isCurrentModel(int model){
		if (model == 6033 || model == 62348){ //Dragon Scimitar
			if (!GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		if (model == 6235 || model == 6232){ //Ancient Staff
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		if (model == 28139 || model == 27747 || model == 27757 || model == 28132 //Armadyl armour
		|| model == 27742 || model == 27756 || model == 28141 || model == 27734
		|| model == 27750  || model == 27758 || model == 27752){ 
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}

		if (model == 27732 || model == 27753 || model == 27748 || model == 27759 //Bandos armour
		|| model == 27739 || model == 27755 || model == 27737 || model == 19951){ 
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		if (model == 62738 || model == 62754 || model == 62746 || model == 62762 //Torva armour
		|| model == 62743 || model == 62760){ 
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		if (model == 62736 || model == 62755 || model == 62748 || model == 62764 //Virtus armour
		|| model == 62742 || model == 62758){
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}

		if (model == 42627 || model == 42634 || model == 42642 || model == 42638 //Zuriel robes
		|| model == 42645 || model == 42653){ 
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		if (model >= 27724 && model <= 27731){ //Godswords
			if (GameClient.OLD_ITEMS)
				return false;
			return true;
		}
		return true;
	}

	public void loadArray() {
		models = new ArrayList<Integer>();
		File[] m = new File("./models").listFiles();
		for (File model : m) {
			if (model.getName().contains(".dat"))
				models.add(Integer.parseInt(model.getName().substring(0,model.getName().indexOf(".dat"))));
		}
	}

}