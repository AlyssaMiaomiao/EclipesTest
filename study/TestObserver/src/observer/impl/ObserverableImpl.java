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
		//�����ж���۲��ߣ��۲����б�
				for(Observer observer:observers) {
					observer.update(str);
				}
				
	}
	

}
