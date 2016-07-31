package pl.com.bottega;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);

	public LocalDateTime getBirthDateAndTime() {
		System.out.println("Wpisz datê oraz godzinê urodzenia(yyyy-mm-dd hh:mm)");
		while (true) {
			try {
				String input = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
				return dateTime;
			} catch (DateTimeException e) {
				System.out.println("Wpisz poprawnie datê oraz godzinê urodzenia(yyyy-mm-dd hh:mm)");
			}
		}
	}

	public String getSex() {
		System.out.println("Wpisz p³eæ(kobieta/mê¿czyzna)");
		while (true) {
			String sex = sc.next().toLowerCase();
			if (sex.equals("kobieta") || sex.equals("mê¿czyzna")) {
				return sex;
			} else {
				System.out.println("Wpisz poprawnie p³eæ(kobieta/mê¿czyzna)");
			}
		}
	}

	public String getCondition() {
		System.out.println("Wpisz kondycjê(wyczynowa/œwietna/dobra/ponadprzeciêtna/przeciêtna/s³aba/z³a)");
		while (true) {
			String condition = sc.next().toLowerCase();
			if (condition.equals("wyczynowa") || condition.equals("œwietna") || condition.equals("dobra")
					|| condition.equals("ponadprzeciêtna") || condition.equals("przeciêtna")
					|| condition.equals("s³aba") || condition.equals("z³a")) {
				return condition;
			} else {
				System.out.println(
						"Wpisz poprawnie kondycjê(wyczynowa/œwietna/dobra/ponadprzeciêtna/przeciêtna/s³aba/z³a)");
			}
		}
	}
}
