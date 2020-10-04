package com.evaristo.builder;

public class TestBuilder {
	
	public static void main(String[] args) {
		Person person = new Person.Builder()
				       .address("XXXXX")
				       .age(10)
				       .gender("male")
				       .gender("XXX")
				       .name("xx")
				       .build();
		
		System.out.println(person);
		            
	}

}
