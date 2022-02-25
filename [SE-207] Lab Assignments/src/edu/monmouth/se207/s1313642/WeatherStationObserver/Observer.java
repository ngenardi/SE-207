package edu.monmouth.se207.s1313642.WeatherStationObserver;


public interface Observer {
	public void update(float temp, float humidity, float pressure, float wind);
}
