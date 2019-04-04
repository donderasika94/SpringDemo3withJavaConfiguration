package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;

public class MessageRenderer{

	private MessageProvider messageProvider;

	{
		System.out.println("Object Created");
	}

	//Constructor
	public MessageRenderer(MessageProvider messageProvider){
		System.out.println("Constructor Injection.....");
		this.messageProvider = messageProvider;
	}

	//Setter Method
	/*public void setMessageProvider(MessageProvider messageProvider){
		System.out.println("Using Setter method.....");
		this.messageProvider = messageProvider;
	}*/	

	public void render(){
		System.out.println(messageProvider.getMessage());	
	}
}