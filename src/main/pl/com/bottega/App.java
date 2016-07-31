package pl.com.bottega;

public class App {

	public static void main(String[] args) {

		Input in = new Input();
		Calculator calc = new Calculator();
		AverageAdultPulseCalculator aapc = new AverageAdultPulseCalculator();
		Human human = new Human(in.getBirthDateAndTime(), in.getSex(), in.getCondition(),
				aapc.specifyAverageAdultPulse(in.getSex(), in.getCondition()));
		long heartBeatsTotal = calc.calculateHeartBeats(human.getBirthDate(), human.getPulseAdult());
		System.out.println("Twoje serce bi�o w ci�gu twojego �ycia oko�o " + heartBeatsTotal + " razy");

	}

}
