package arraylist;
import java.util.*;

public class IterateArrayListElements {
	public static void main(String[] args) {
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		for(String element:list_Strings) {
			System.out.println(element);
		}
	}	

}
