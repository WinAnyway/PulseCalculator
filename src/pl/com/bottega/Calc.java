package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calc {

	private LocalDateTime now = LocalDateTime.now();
	private long heartBeats = 0;
	//private static final long MINUTES_NEWBORN = ;
	private static final int PULSE_NEWBORN = 130;
	private static final int PULSE_KID = 100;
	private static final int PULSE_YOUNGSTER = 85;
	
	public long calculateTotalMinutes (LocalDateTime birthDate){
		long totalMinutes = ChronoUnit.MINUTES.between(birthDate, now);
		System.out.println(totalMinutes);
		return totalMinutes;
		
	}
	
	public long calculateHeartBeatsNewborn(LocalDateTime birthDate){
		long minutesOfNewborn = ChronoUnit.MINUTES.between(birthDate, birthDate.plusYears(3));
		long heartbeatsOfNewborn = minutesOfNewborn * PULSE_NEWBORN;
		System.out.println(heartbeatsOfNewborn);
		return heartbeatsOfNewborn;
		
	}
}
