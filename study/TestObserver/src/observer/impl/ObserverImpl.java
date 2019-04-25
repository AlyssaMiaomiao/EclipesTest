package observer.impl;

import observer.Observer;

public class ObserverImpl implements Observer {
	public void update(String str) {
		System.out.println(str);
	}

}
