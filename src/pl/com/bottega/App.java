package pl.com.bottega;

public class App {

	public static void main(String[] args) {
		
		Input in = new Input();
		Calc calc = new Calc();
		Human human = new Human(in.getBirthDateAndTime(), in.getSex(), in.getCondition());
		calc.calculateTotalMinutes(human.getBirthDate());
		calc.calculateHeartBeatsNewborn(human.getBirthDate());
		System.out.println(human.toString());

	}

}
