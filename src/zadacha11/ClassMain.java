package zadacha11;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("Sara");
		list1.add("Viki");
		list1.add("Ana");
		list2.add("Ana");
		list2.add("Eva");
		list2.add("Viki");
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
