package presentation;

import data.WeatherDataWest;

public class WeatherMain {

	public static void main(String[] args) {
		
		WeatherDataWest weather1 = new WeatherDataWest();
		
		float temp = 25;
		float humidity = 10;
		float pressure = 0.02f;
		
		
		CurrentConditions current = new CurrentConditions(weather1);
		
		
		weather1.dataIn(temp, humidity, pressure);
		
		WeatherDataWest weather2 = new WeatherDataWest();
		current.setSubject(weather2);
		
		temp = 36;
		humidity = 55;
		pressure = 33.3f;
		
		weather2.dataIn(temp, humidity, pressure);

	}

}
