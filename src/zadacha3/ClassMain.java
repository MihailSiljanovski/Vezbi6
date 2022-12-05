package zadacha3;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main (String[] args) {
		List<String> smerovi = new ArrayList<>();
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add("DevOps");
		smerovi.add(2, "JavaDev");
		System.out.println("Elementite se: " + smerovi);
	}
}
