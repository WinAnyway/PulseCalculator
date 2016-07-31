package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculator {

	private LocalDateTime now = LocalDateTime.now();
	private static final int PULSE_NEWBORN = 130;
	private static final int PULSE_KID = 100;
	private static final int PULSE_TEEN = 85;

	public long calculateHeartBeats(LocalDateTime birthDate, long pulseAdult) {
		long heartBeats;
		long totalYears = ChronoUnit.YEARS.between(birthDate, now);
		long totalMinutes = ChronoUnit.MINUTES.between(birthDate, now);
		long minutesNewborn = ChronoUnit.MINUTES.between(birthDate, birthDate.plusYears(3));
		long minutesKid = ChronoUnit.MINUTES.between(birthDate.plusYears(3), birthDate.plusYears(14));
		long minutesTeen = ChronoUnit.MINUTES.between(birthDate.plusYears(14), birthDate.plusYears(18));
		long heartBeatsNewborn = minutesNewborn * PULSE_NEWBORN;
		long heartBeatsKid = minutesKid * PULSE_KID;
		long heartBeatsTeen = minutesTeen * PULSE_TEEN;
		if (totalYears <= 2) {
			heartBeats = totalMinutes * PULSE_NEWBORN;
		} else if (totalYears <= 13) {
			heartBeats = heartBeatsNewborn + (totalMinutes - minutesNewborn) * PULSE_KID;
		} else if (totalYears < 18) {
			heartBeats = heartBeatsNewborn + heartBeatsKid
					+ (totalMinutes - (minutesNewborn + minutesKid)) * PULSE_TEEN;
		} else {
			heartBeats = heartBeatsNewborn + heartBeatsKid + heartBeatsTeen
					+ (totalMinutes - (minutesNewborn + minutesKid + minutesTeen)) * pulseAdult;
		}
		return heartBeats;

	}
}
