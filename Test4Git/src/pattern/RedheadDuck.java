package pattern;

import pattern.compound.Quackable;

public class RedheadDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}

}
