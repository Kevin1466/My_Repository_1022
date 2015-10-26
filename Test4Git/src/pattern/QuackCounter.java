package pattern;

import pattern.compound.Quackable;

/**
 * QuackCounter is a decorator.
 * QuackCounter wraps Quackable
 * @author renguangkai
 *
 */
public class QuackCounter implements Quackable {
	
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

}
