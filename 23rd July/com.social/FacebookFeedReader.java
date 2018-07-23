package com.social;

public class FacebookFeedReader implements SocialFeedReader{
	@Override
	public Message pollForNewMessage() {
		Message m1 = new Message();
		m1.setMessageId(2);
		m1.setMessageSource("Facebook");
		m1.setSender("Anushka");
		m1.setMessageType("String");
		m1.setMessage("Posting this from facebook...");
		return m1;
	}
}
