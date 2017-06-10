package data;


import java.util.*;

import presentation.Observers;

public class WeatherDataWest implements Subject {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private ArrayList<Observers> observers;
	
	public WeatherDataWest(){
		
		observers = new ArrayList<Observers>();
	}

	@Override
	public void registerObserver(Observers o) {

		this.observers.add(o);
		
	}

	@Override
	public void unregisterObserver(Observers o) {
		
		int observerIndex = observers.indexOf(o);
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observers ob : observers){
		
			ob.update(temperature, humidity, pressure);
		}
		
	}
	
	public void dataIn(float temperature, float humidity, float pressure){
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
}
