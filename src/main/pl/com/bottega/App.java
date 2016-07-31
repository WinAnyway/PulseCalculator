package pl.com.bottega;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

		Input in = new Input();
		LocalDateTime birthDate = in.getBirthDateAndTime();
		String sex = in.getSex();
		String condition = in.getCondition();
		Calculator calc = new Calculator();
		AverageAdultPulseCalculator aapc = new AverageAdultPulseCalculator();
		Human human = new Human(birthDate, sex, condition, aapc.calculateAverageAdultPulse(sex, condition));
		long heartBeatsTotal = calc.calculateHeartBeats(human.getBirthDate(), human.getPulseAdult());
		System.out.println("Twoje serce bi³o w ci¹gu twojego ¿ycia oko³o " + heartBeatsTotal + " razy");

	}

}
