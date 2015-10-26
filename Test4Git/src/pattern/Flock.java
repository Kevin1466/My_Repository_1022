package pattern;

import java.util.ArrayList;
import java.util.Iterator;

import pattern.compound.Quackable;

/**
 * Flock is alse Quackable type.
 * This method is valid for a flock of duck.
 * @author renguangkai
 *
 */
public class Flock implements Quackable {
	
	ArrayList<Quackable> quackers = new ArrayList<>();
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quackable = (Quackable)iterator.next();
			quackable.quack();
		}
	}
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

}
