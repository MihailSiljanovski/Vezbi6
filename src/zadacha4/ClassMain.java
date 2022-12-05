package zadacha4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ClassMain {
	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		broevi.add(1);
		broevi.add(3);
		broevi.add(4);
		broevi.add(5);
		broevi.add(2);
		Collections.sort(broevi);
		System.out.println("Elementite se: " + broevi);
	}
}
