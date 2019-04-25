package observer;

import observer.impl.ObserverImpl;
import observer.impl.ObserverableImpl;

public class TestObserver {
	public static void main(String[] args) {
		ObserverableImpl observerablelmpl=new ObserverableImpl();
		 observerablelmpl.addObservers(new ObserverImpl());
		 observerablelmpl.addObservers(new ObserverImpl());
		 observerablelmpl.addObservers(new ObserverImpl());
		 observerablelmpl.notifyObservers("发表了新博客，请查阅");
	}

}
