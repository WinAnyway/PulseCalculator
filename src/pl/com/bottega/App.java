package pl.com.bottega;

public class App {

	public static void main(String[] args) {

		Input in = new Input();
		Calc calc = new Calc();
		Human human = new Human(in.getBirthDateAndTime(), in.getSex(), in.getCondition());
		long pulseAdult = 0;
		if (human.getSex().equals("kobieta")) {
			switch (human.getCondition()) {
			case "wyczynowa":
				pulseAdult = 57;
				break;
			case "�wietna":
				pulseAdult = 63;
				break;
			case "dobra":
				pulseAdult = 67;
				break;
			case "ponadprzeci�tna":
				pulseAdult = 71;
				break;
			case "przeci�tna":
				pulseAdult = 76;
				break;
			case "s�aba":
				pulseAdult = 80;
				break;
			case "z�a":
				pulseAdult = 85;
				break;
			default:
				pulseAdult = 70;
				break;
			}
		} else if (human.getSex().equals("m�czyzna")) {
			switch (human.getCondition()) {
			case "wyczynowa":
				pulseAdult = 53;
				break;
			case "�wietna":
				pulseAdult = 59;
				break;
			case "dobra":
				pulseAdult = 65;
				break;
			case "ponadprzeci�tna":
				pulseAdult = 69;
				break;
			case "przeci�tna":
				pulseAdult = 73;
				break;
			case "s�aba":
				pulseAdult = 79;
				break;
			case "z�a":
				pulseAdult = 84;
				break;
			default:
				pulseAdult = 70;
				break;
			}
		}
		long heartBeatsTotal = calc.calculateHeartBeats(human.getBirthDate(), pulseAdult);
		System.out.println("Twoje serce bi�o w ci�gu twojego �ycia oko�o " + heartBeatsTotal + " razy");

	}

}
