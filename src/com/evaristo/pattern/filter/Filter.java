/**
 * 
 */
package com.evaristo.pattern.filter;

import java.util.List;

/**
 * @author evaristosrodrigues
 *
 */
public interface Filter<T> {
	
	List<T> meets(List<T> elements);

}
