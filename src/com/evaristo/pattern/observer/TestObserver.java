/**
 * 
 */
package com.evaristo.pattern.observer;

/**
 * @author evaristosrodrigues
 *
 */
public class TestObserver {
	
	public static void main(String[] args) {		
		
		Subscriber sub1 = new Subscriber();
		Subscriber sub2 = new Subscriber();
		Subscriber sub3 = new Subscriber();
		Subscriber sub4 = new Subscriber();
		
		Channel youtube = new Channel();
		
		youtube.subscribe(sub1);
		sub1.setChannel(youtube);
		youtube.subscribe(sub2);
		sub2.setChannel(youtube);
		youtube.subscribe(sub3);
		sub3.setChannel(youtube);
		youtube.subscribe(sub4);		
		sub4.setChannel(youtube);

		
		youtube.update("Deus sabe de todas as coisas");
		
	}

}
