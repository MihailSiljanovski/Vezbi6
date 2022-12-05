package zadacha6;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> mail = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			mail.add("mail" + i + "@yahoo.com");
		}
		for (int y = 0; y < 20; y++) {
			System.out.println(mail.get(y));
		}
	}
}
