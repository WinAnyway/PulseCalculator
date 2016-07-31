package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);

	public LocalDateTime getBirthDateAndTime() {
		System.out.println("Wpisz dat� urodzenia(yyyy-mm-dd hh:mm)");
		String input = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
		return dateTime;
	}

	public String getSex() {
		System.out.println("Wpisz p�e�(kobieta/m�czyzna)");
		String sex = sc.next().toLowerCase();
		return sex;
	}

	public String getCondition() {
		System.out.println("Wpisz kondycj�(wyczynowa/�wietna/dobra/ponadprzeci�tna/przeci�tna/s�aba/z�a)");
		String condition = sc.next().toLowerCase();
		return condition;
	}
}
