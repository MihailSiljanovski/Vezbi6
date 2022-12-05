package zadacha2;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> drzavi = new ArrayList<>();
		drzavi.add("Makedonija");
		drzavi.add("Srbija");
		drzavi.add("Slovenija");
		drzavi.add("Germanija");
		drzavi.add("Grcija");
		System.out.println("Vkupno elementi: " + drzavi.size());
		if (drzavi.size() == 3) {
			drzavi.add("Albanija");
			drzavi.add("Kosovo");
		}
		else {
			System.out.println("Elementi na listata se: " + drzavi);
		}
	}
}
