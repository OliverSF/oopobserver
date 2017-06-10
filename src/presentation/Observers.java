package presentation;

import data.Subject;

public interface Observers {
	
	public void update(float temperature, float humidity , float pressure);
	
	public void setSubject(Subject sub);

}
