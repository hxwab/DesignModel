package com.observer;

import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

public class WeatherData implements Subject {

	private Set<Observer> observers  = new HashSet<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer); 
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observers);
		
	}

	@Override
	public void notifyObservers() {
	
		for(Observer o :observers){
			//o.update(this,null);
		}
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
