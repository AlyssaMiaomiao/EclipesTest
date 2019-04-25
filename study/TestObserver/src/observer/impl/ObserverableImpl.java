package observer.impl;

import java.util.Vector;

import observer.Observer;
import observer.Observerable;


public class ObserverableImpl implements Observerable {
	Vector<Observer> observers=new Vector<Observer>();
	public void addObservers(Observer observer) {
		observers.add(observer);
	}
	public void removeObservers(Observer observer) {
		observers.remove(observer);
	}
	@Override
	public void notifyObservers(String str) {
		//遍历有多个观察者，观察者列表
				for(Observer observer:observers) {
					observer.update(str);
				}
				
	}
	

}
