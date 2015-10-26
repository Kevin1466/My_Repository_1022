package pattern;

import pattern.compound.Quackable;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("quack");
	}

}
