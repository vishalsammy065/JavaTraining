package com.social;

public class TwitterFeedReader implements SocialFeedReader{
	@Override
	public Message pollForNewMessage() {
		Message m1 = new Message();
		m1.setMessageId(1);
		m1.setMessageSource("Twitter");
		m1.setMessageType("String");
		m1.setSender("Vishal");
		m1.setMessage("Tweeting this");
		return m1;
	}
}
