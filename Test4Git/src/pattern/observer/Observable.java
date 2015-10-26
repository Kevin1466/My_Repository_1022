package pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

/**
 * enclose registration and notify,
 * all the call of QuackObservable can be delegated to this.
 * @author renguangkai
 *
 */
public class Observable implements QuackObservable {

	ArrayList observers = new ArrayList();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update((java.util.Observable) duck, null);
		}
	}

}
