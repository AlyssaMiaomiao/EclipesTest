package observer;

public interface Observerable {
	//维护观察者模式
	public void addObservers(Observer observer);
	//移除指定的观察者
	public void removeObservers(Observer observer);
	//通知观察者去更新
	public void notifyObservers(String str);

}
