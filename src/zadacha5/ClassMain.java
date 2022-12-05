package zadacha5;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<Integer> broj = new ArrayList<>();
		broj.add(1);
		broj.add(2);
		broj.add(3);
		broj.add(4);
		broj.add(5);
		System.out.println("Vtoriot element od listata e: " + broj.get(1));
	}
}
