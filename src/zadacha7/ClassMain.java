package zadacha7;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> mail = new ArrayList<>();
		for (int i = 0; i <= 2; i++) {
			for (int x = 1; x <= 10; x++) {
				if(x == 10) {
					if(i == 0) {
					mail.add("mail" + 1 + 0 + "@yahoo.com");
					}
					else if(i == 1) {
						mail.add("mail" + 2 + 0 + "@yahoo.com");
					}
				}
				else {
					mail.add("mail" + i + x + "@yahoo.com");
				}
			}
		}
		for (int y = 0; y < 20; y++) {
			System.out.println(mail.get(y));
		}
	}
}
