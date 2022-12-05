package zadacha9;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<Fakultet> obj = new ArrayList<Fakultet>();
		obj.add(new Fakultet ("FIKT", 2, 150));
		obj.add(new Fakultet ("TFB", 4, 100));
		obj.add(new Fakultet ("FINKI", 6, 450));
		obj.add(new Fakultet ("Bioloshki", 3, 300));
		obj.add(new Fakultet ("Medicinski", 4, 450));
		for (int i = 0; i < obj.size(); i ++){
			System.out.print(obj.get(i).getIme() + " ");
			System.out.print(obj.get(i).getBrNaSmerovi() + " ");
			System.out.print(obj.get(i).getBrNaStudenti());
			System.out.println();
		}
	}
}
