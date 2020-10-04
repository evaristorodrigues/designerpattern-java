package com.evaristo.pattern.observer;

public class Channel implements Subject {

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unubscribe(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void update(Object object) {
       for(Observer observer: observers) {
    	   observer.update(object);
       }
	}

}
