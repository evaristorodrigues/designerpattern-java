/**
 * 
 */
package com.evaristo.pattern.observer;

/**
 * @author evaristosrodrigues
 *
 */
public class Subscriber implements Observer {
	
	private Channel channel;

	@Override
	public void update(Object object) {
		System.out.println(object);
		
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}
