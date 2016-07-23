package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calc {

	private LocalDateTime now = LocalDateTime.now();
	private static final int PULSE_NEWBORN = 130;
	private static final int PULSE_KID = 100;
	private static final int PULSE_TEEN = 85;
	
	public long calculateTotalMinutes (LocalDateTime birthDate){
		long totalMinutes = ChronoUnit.MINUTES.between(birthDate, now);
		//System.out.println(totalMinutes);
		return totalMinutes;
		
	}
	
	public long calculateTotalYears (LocalDateTime birthDate){
		long totalYears = ChronoUnit.YEARS.between(birthDate, now);
		//System.out.println(totalYears);
		return totalYears;
		
	}
	
/*	public long calculateHeartBeatsNewborn(LocalDateTime birthDate){
		long minutesOfNewborn = ChronoUnit.MINUTES.between(birthDate, birthDate.plusYears(3));
		long heartbeatsOfNewborn = minutesOfNewborn * PULSE_NEWBORN;
		System.out.println(heartbeatsOfNewborn);
		return heartbeatsOfNewborn;
		
	}*/
	
/*	public long calculateHeartBeatsKid(LocalDateTime birthDate){
		long minutesOfKid = ChronoUnit.MINUTES.between(birthDate.plusYears(3), birthDate.plusYears(14));
		long heartbeatsOfKid = minutesOfKid * PULSE_KID;
		System.out.println(minutesOfKid);
		return heartbeatsOfKid;
	}*/
	
	public long calculateHeartBeats(LocalDateTime birthDate, long pulseAdult){
		long heartBeats;
		long totalYears = ChronoUnit.YEARS.between(birthDate, now);
		long totalMinutes = ChronoUnit.MINUTES.between(birthDate, now);
		long minutesNewborn = ChronoUnit.MINUTES.between(birthDate, birthDate.plusYears(3));
		long minutesKid = ChronoUnit.MINUTES.between(birthDate.plusYears(3), birthDate.plusYears(14));
		long minutesTeen = ChronoUnit.MINUTES.between(birthDate.plusYears(14), birthDate.plusYears(18));
		long heartBeatsNewborn = minutesNewborn * PULSE_NEWBORN;
		long heartBeatsKid = minutesKid * PULSE_KID;
		long heartBeatsTeen = minutesTeen * PULSE_TEEN;
		if (totalYears <= 2){
			heartBeats = totalMinutes * PULSE_NEWBORN;
		} else if (totalYears <= 13){
			heartBeats = heartBeatsNewborn + (totalMinutes - minutesNewborn) * PULSE_KID;
		} else if (totalYears < 18){
			heartBeats = heartBeatsNewborn + heartBeatsKid + (totalMinutes - (minutesNewborn + minutesKid)) * PULSE_TEEN;
		} else {
			heartBeats = heartBeatsNewborn + heartBeatsKid + heartBeatsTeen + (totalMinutes - (minutesNewborn + minutesKid + minutesTeen)) * pulseAdult;
		}
		System.out.println("Total Years: " + totalYears +
								"\nTotal Minutes: " + totalMinutes +
								"\nMinutes Newborn: " + minutesNewborn +
								"\nMinutes Kid: " + minutesKid +
								"\nMinutes Teen: " + minutesTeen +
								"\nHeartBeats Newborn: " + heartBeatsNewborn +
								"\nHeartBeats Kid: " + heartBeatsKid +
								"\nHeartBeats Teen: " + heartBeatsTeen);
		return heartBeats;
		
	}
}
