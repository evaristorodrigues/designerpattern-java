package com.evaristo.pattern.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrFilter implements Filter<Animal>{
	
	Filter<Animal>[] filters;
	@SafeVarargs
	public OrFilter(Filter<Animal> ... filters) {
		this.filters = filters;
	}

	@Override
	public List<Animal> meets(List<Animal> elements) {
		Set<Animal> animals = new HashSet<Animal>();
		
		for(Filter<Animal> filter: filters) {
           animals.addAll(filter.meets(elements));
		}
		
		return new ArrayList<Animal>(animals);
	}

}
