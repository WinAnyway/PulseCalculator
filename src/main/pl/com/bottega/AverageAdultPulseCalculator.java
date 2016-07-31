package pl.com.bottega;

public class AverageAdultPulseCalculator {

	public Long calculateAverageAdultPulse(String sex, String condition) {
		long pulseAdult = 0;
		if (sex.equals("kobieta")) {
			switch (condition) {
			case "wyczynowa":
				pulseAdult = 57;
				break;
			case "œwietna":
				pulseAdult = 63;
				break;
			case "dobra":
				pulseAdult = 67;
				break;
			case "ponadprzeciêtna":
				pulseAdult = 71;
				break;
			case "przeciêtna":
				pulseAdult = 76;
				break;
			case "s³aba":
				pulseAdult = 80;
				break;
			case "z³a":
				pulseAdult = 85;
				break;
			default:
				pulseAdult = 70;
				break;
			}
		} else if (sex.equals("mê¿czyzna")) {
			switch (condition) {
			case "wyczynowa":
				pulseAdult = 53;
				break;
			case "œwietna":
				pulseAdult = 59;
				break;
			case "dobra":
				pulseAdult = 65;
				break;
			case "ponadprzeciêtna":
				pulseAdult = 69;
				break;
			case "przeciêtna":
				pulseAdult = 73;
				break;
			case "s³aba":
				pulseAdult = 79;
				break;
			case "z³a":
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
