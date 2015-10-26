package pattern.compound;

import pattern.observer.QuackObservable;

/**
 * An interface can extends another one
 * @author renguangkai
 *
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
