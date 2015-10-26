package pattern;

import pattern.compound.Quackable;

public class RubberDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
