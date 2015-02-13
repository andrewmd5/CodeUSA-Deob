import java.lang.reflect.Field;


public class duimp {
	static Field[] fields = NPC.class.getFields();
		public static void main(String args[]) {
			System.out.println(fields.length);
		}
}
