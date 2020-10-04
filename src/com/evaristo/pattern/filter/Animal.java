/**
 * 
 */
package com.evaristo.pattern.filter;

/**
 * @author evaristosrodrigues
 *
 */
public class Animal {
	
	private String name;
	private int age;
	private int weight;
	
	
	
	public Animal(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
