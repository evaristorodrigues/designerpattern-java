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
public class TestFilter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal a = new Animal("asssssssss", 1, 1);
		Animal b = new Animal("b", 11, 1);
		Animal c = new Animal("cccccccccccc", 12, 1);
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(a);
		animals.add(b);
		animals.add(c);
		
		System.out.println(new AgeFilter().meets(animals));
		System.out.println(new AndFilter(new AgeFilter(), new NameFilter()).meets(animals));
		System.out.println(new OrFilter(new AgeFilter(), new NameFilter()).meets(animals));

		

	}

}
