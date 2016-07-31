package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculator {

	private LocalDateTime now = LocalDateTime.now();
	private static final int PULSE_NEWBORN = 130;
	private static final int PULSE_KID = 100;
	private static final int PULSE_TEEN = 85;

	// Calculates total heart beats of human
	public long calculateHeartBeats(LocalDateTime birthDate, long pulseAdult) {
		long heartBeats;
		long totalYears = ChronoUnit.YEARS.between(birthDate, now);
		long totalMinutes = ChronoUnit.MINUTES.between(birthDate, now);
		long minutesNewborn = ChronoUnit.MINUTES.between(birthDate, birthDate.plusYears(2));
		long minutesKid = ChronoUnit.MINUTES.between(birthDate.plusYears(2), birthDate.plusYears(13));
		long minutesTeen = ChronoUnit.MINUTES.between(birthDate.plusYears(13), birthDate.plusYears(18));
		long heartBeatsNewborn = minutesNewborn * PULSE_NEWBORN;
		long heartBeatsKid = minutesKid * PULSE_KID;
		long heartBeatsTeen = minutesTeen * PULSE_TEEN;
		if (totalYears <= 2) {
			heartBeats = totalMinutes * PULSE_NEWBORN;
		} else if (totalYears <= 13) {
			heartBeats = heartBeatsNewborn + ((totalMinutes - minutesNewborn) * PULSE_KID);
		} else if (totalYears <= 18) {
			heartBeats = heartBeatsNewborn + heartBeatsKid
					+ ((totalMinutes - (minutesNewborn + minutesKid)) * PULSE_TEEN);
		} else {
			heartBeats = heartBeatsNewborn + heartBeatsKid + heartBeatsTeen
					+ ((totalMinutes - (minutesNewborn + minutesKid + minutesTeen)) * pulseAdult);
		}
		return heartBeats;

	}

	// Calculates average pulse of human adult
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
