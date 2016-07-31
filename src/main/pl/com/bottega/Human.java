package pl.com.bottega;

import java.time.LocalDateTime;

public class Human {

	private LocalDateTime birthDate;
	private String sex;
	private String condition;
	private Long pulseAdult;

	public Human(LocalDateTime birthDate, String sex, String condition, Long pulseAdult) {
		super();
		this.birthDate = birthDate;
		this.sex = sex;
		this.condition = condition;
		this.pulseAdult = pulseAdult;

	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Long getPulseAdult() {
		return pulseAdult;
	}

	public void setPulseAdult(Long pulseAdult) {
		this.pulseAdult = pulseAdult;
	}

}
