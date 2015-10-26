package pattern;

import java.util.Observer;

import pattern.compound.Quackable;
import pattern.observer.Observable;

public class MallardDuck implements Quackable {
	
	/*
	 * Each Quackable has a Observable instance.
	 * 这是一个委托对象
	 */
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		//委托给observable
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		//委托给observable
		observable.notifyObservers();
	}

}
