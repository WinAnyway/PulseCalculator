package pl.com.bottega;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calc {

	private LocalDateTime now = LocalDateTime.now();
	
	private static final int PULSE_NEWBORN = 130;
	private static final int PULSE_KID = 100;
	private static final int PULSE_YOUNGSTER = 85;
	
	public long calculateMinutes (LocalDateTime birthDate){
		long minutes = ChronoUnit.MINUTES.between(birthDate, now);
		System.out.println(minutes);
		return minutes;
		
	}
}
