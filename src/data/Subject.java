package data;

import presentation.Observers;

public interface Subject {
	
	public void registerObserver(Observers o);
	public void unregisterObserver(Observers o);
	public void notifyObservers();

}
