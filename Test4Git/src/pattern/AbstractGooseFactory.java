package pattern;

import pattern.compound.Quackable;

public abstract class AbstractGooseFactory extends DuckFactory {
	public abstract Quackable createGoose();
}
