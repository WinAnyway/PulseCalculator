package pl.com.bottega;

import java.time.LocalDateTime;

public class Human {

	private LocalDateTime birthDate;
	private String sex;
	private String condition;

	public Human(LocalDateTime birthDate, String sex, String condition) {
		super();
		this.birthDate = birthDate;
		this.sex = sex;
		this.condition = condition;

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

}
