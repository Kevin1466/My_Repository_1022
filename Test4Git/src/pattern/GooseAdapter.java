package pattern;

import pattern.compound.Quackable;

/**
 * adapter implements aimed interface
 * @author renguangkai
 *
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	/**
	 * when this method is called, 
	 * honk() will be delegated
	 */
	@Override
	public void quack() {
		goose.honk();
	}

}
