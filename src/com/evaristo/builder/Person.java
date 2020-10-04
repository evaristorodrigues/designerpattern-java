package com.evaristo.builder;
/**
 * @author evaristosrodrigues
 *
 */
public class Person {
	private String name;
	private int age;
	private String address;
	private String gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	private Person(String name, int age, String address, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	
	public static final class Builder{
		
		private String name;
		private int age;
		private String address;
		private String gender;
		

		public Builder name(String name) {
			this.name = name;
			return this;
		}


		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}	
		
		public Person build() {
			return new Person(name, age, address, gender);
		}
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}
	
	

}
