package pattern;

import pattern.compound.Quackable;

/**
 * use factory to ensure product quality, for instance, duck must be wrapped
 * @author renguangkai
 *
 */
public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
