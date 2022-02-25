package edu.monmouth.se207.s1313642.WeatherStationObserver;
public class WindChillDisplay implements DisplayElement, Observer {
	private float temperature;
	private float windSpeed;
	
	private Subject weatherData;
	
	public WindChillDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	/*
	Wind Chill Calculation:
		If temperature < 50 degrees, compute wind chill based on temperature & Wind

		Otherwise, wind chill is same as temperature
	 */
	private float computeWindchillIndex (float temp, float wind) {
		if (temp < 50.0) {
			float index = (float)(35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind,  0.16) );
			return index;
		} else {
			return temp;
		}
	}
	
	@Override
	public void update(float temp, float humidity, float pressure, float wind) {
		temperature = temp;
		windSpeed = wind;
		display();
	}
	
	@Override
	public void display() {
		float windChill = computeWindchillIndex(temperature,windSpeed);
		System.out.println("Wind chill: " + windChill + "F degrees");
	}
}
