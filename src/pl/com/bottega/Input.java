package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {
	
	Scanner sc = new Scanner(System.in);
	
	public LocalDateTime getBirthDateAndTime (){
		System.out.println("Please enter date and time of birth(yyyy-mm-dd hh:mm)");
		String input = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
		return dateTime;
	}
	
	public String getSex (){
		System.out.println("Please enter sex(male/female)");
		String sex = sc.next().toLowerCase();
		return sex;
	}
	
	public String getCondition (){
		System.out.println("Please enter condition(good/bad/very good)");
		String condition = sc.next().toLowerCase();
		return condition;
	}
}
