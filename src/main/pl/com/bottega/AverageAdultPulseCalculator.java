package pl.com.bottega;

public class AverageAdultPulseCalculator {

	public Long calculateAverageAdultPulse(String sex, String condition) {
		long pulseAdult = 0;
		if (sex.equals("kobieta")) {
			switch (condition) {
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
		} else if (sex.equals("m�czyzna")) {
			switch (condition) {
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
		return pulseAdult;
	}
}
