package zadacha10;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("FIKT");
		list1.add("FINKI");
		list1.add("TFB");
		list2.add("Bitola");
		list2.add("Skopje");
		list2.add("Prilep");
		list1.addAll(list2);
		System.out.println(list1);
	}
}
