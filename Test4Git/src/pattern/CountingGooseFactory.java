package pattern;

import pattern.compound.Quackable;

/**
 * concrete factory which products decorated products(ducks)
 * @author renguangkai
 *
 */
public class CountingGooseFactory extends AbstractGooseFactory {

	@Override
	public Quackable createGoose() {
		// TODO Auto-generated method stub
		return new GooseAdapter(new Goose());
	}

}
