package pattern.observer;

import java.util.Observer;

/**
 * Any one who wants to be observed should implements
 * this interface
 * @author renguangkai
 *
 */
public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
