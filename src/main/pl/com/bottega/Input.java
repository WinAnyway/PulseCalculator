package pl.com.bottega;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);

	public LocalDateTime getBirthDateAndTime() {
		System.out.println("Wpisz dat� oraz godzin� urodzenia(yyyy-mm-dd hh:mm)");
		while (true) {
			try {
				String input = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
				return dateTime;
			} catch (DateTimeException e) {
				System.out.println("Wpisz poprawnie dat� oraz godzin� urodzenia(yyyy-mm-dd hh:mm)");
			}
		}
	}

	public String getSex() {
		System.out.println("Wpisz p�e�(kobieta/m�czyzna)");
		while (true) {
			String sex = sc.next().toLowerCase();
			if (sex.equals("kobieta") || sex.equals("m�czyzna")) {
				return sex;
			} else {
				System.out.println("Wpisz poprawnie p�e�(kobieta/m�czyzna)");
			}
		}
	}

	public String getCondition() {
		System.out.println("Wpisz kondycj�(wyczynowa/�wietna/dobra/ponadprzeci�tna/przeci�tna/s�aba/z�a)");
		while (true) {
			String condition = sc.next().toLowerCase();
			if (condition.equals("wyczynowa") || condition.equals("�wietna") || condition.equals("dobra")
					|| condition.equals("ponadprzeci�tna") || condition.equals("przeci�tna")
					|| condition.equals("s�aba") || condition.equals("z�a")) {
				return condition;
			} else {
				System.out.println(
						"Wpisz poprawnie kondycj�(wyczynowa/�wietna/dobra/ponadprzeci�tna/przeci�tna/s�aba/z�a)");
			}
		}
	}
}
