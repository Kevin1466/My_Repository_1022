package pattern;

import java.util.Observer;

import pattern.compound.Quackable;
import pattern.observer.Observable;

public class MallardDuck implements Quackable {
	
	/*
	 * Each Quackable has a Observable instance.
	 * ����һ��ί�ж���
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
		//ί�и�observable
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		//ί�и�observable
		observable.notifyObservers();
	}

}
