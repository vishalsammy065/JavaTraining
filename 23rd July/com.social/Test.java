package com.social;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterFeedReader tf = new TwitterFeedReader();
		Message m = tf.pollForNewMessage();
		System.out.println(m.getMessageId());
		System.out.println(m.getMessageType());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessage());
	}

}
