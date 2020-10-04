package com.evaristo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
	 
	 public static final List<Observer> observers = new ArrayList<Observer>();
     
	 void subscribe(Observer observer);
	 void unubscribe(Observer observer);
	 void update(Object object);
	
}
