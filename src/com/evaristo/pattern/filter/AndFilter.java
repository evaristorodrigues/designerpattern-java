package com.evaristo.pattern.filter;

import java.util.List;

public class AndFilter implements Filter<Animal>{

	Filter<Animal>[] filters;
	
	@SafeVarargs
	public AndFilter(Filter<Animal> ...filters) {
		this.filters = filters;
	}
	
	@Override
	public List<Animal> meets(List<Animal> elements) {
		
        for(Filter<Animal> filter: filters) {
        	elements = filter.meets(elements);
        }
		
		return elements;
	}

}
