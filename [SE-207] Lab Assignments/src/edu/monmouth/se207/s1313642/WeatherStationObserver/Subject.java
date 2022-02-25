package edu.monmouth.se207.s1313642.WeatherStationObserver;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
