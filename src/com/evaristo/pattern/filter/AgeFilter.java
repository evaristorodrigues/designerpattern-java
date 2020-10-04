package com.evaristo.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter implements Filter<Animal> {

	@Override
	public List<Animal> meets(List<Animal> elements) {
		List<Animal> animals = new ArrayList<Animal>();
		
		for(Animal animal: elements) {
			if(animal.getAge() > 10) {
				animals.add(animal);
			}
		}
		return animals;
	}

}
