/**
 * 
 */
package com.evaristo.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author evaristosrodrigues
 *
 */
public class NameFilter implements Filter<Animal>{

	@Override
	public List<Animal> meets(List<Animal> elements) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		for( Animal animal : elements) {
			if(animal.getName().length()> 5) {
				animals.add(animal);
			}
		}
		return animals;
	}

}
