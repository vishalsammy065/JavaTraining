package com.social;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterFeedReader tf = new TwitterFeedReader();
		Message twitterMessageObject = tf.pollForNewMessage();
		System.out.println(twitterMessageObject.getMessageId());
		System.out.println(twitterMessageObject.getMessageType());
		System.out.println(twitterMessageObject.getMessageSource());
		System.out.println(twitterMessageObject.getSender());
		System.out.println(twitterMessageObject.getMessage()+"\n\n");
		 
		Message facebookMessageObject = (new FacebookFeedReader()).pollForNewMessage();
		System.out.println(facebookMessageObject.getMessageId());
		System.out.println(facebookMessageObject.getMessageType());
		System.out.println(facebookMessageObject.getMessageSource());
		System.out.println(facebookMessageObject.getSender());
		System.out.println(facebookMessageObject.getMessage());
	}
}
