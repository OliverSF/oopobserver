package presentation;

import data.Subject;

public class CurrentConditions implements Observers{
	
	private float temperature;
	private float humidity;
	private Subject subject;
	
	public CurrentConditions(Subject sub){
		
		this.subject = sub;
		sub.registerObserver(this);
	}
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
	}

	private void display() {
		System.out.println("The Current temp is: " + getTemp() + "\nThe Current humidity is: " + getHumidity());
		
	}

	private float getHumidity() {
		
		return this.humidity;
	}

	private float getTemp() {

		return this.temperature;
	}

	@Override
	public void setSubject(Subject sub) {
		
		this.subject.unregisterObserver(this);
		sub.registerObserver(this);
		this.subject = sub;
		//also had a reset method here to return data to defaults...would need static variable to achieve
		
	}
	
	public void close(){
		this.subject.unregisterObserver(this);
	}

}
