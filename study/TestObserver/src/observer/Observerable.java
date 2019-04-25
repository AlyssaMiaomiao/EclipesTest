package observer;

public interface Observerable {
	//ά���۲���ģʽ
	public void addObservers(Observer observer);
	//�Ƴ�ָ���Ĺ۲���
	public void removeObservers(Observer observer);
	//֪ͨ�۲���ȥ����
	public void notifyObservers(String str);

}
