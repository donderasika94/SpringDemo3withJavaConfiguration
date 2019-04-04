package com.capgemini.spring.annotated;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.annotation.*;


@Lazy
@Configuration
public class MessageConfiguration{

	@Bean
	public MessageProvider messageProvider(){
		return new HWMessageProvider();
	}

	@Bean
	public MessageRenderer messageRenderer(){
		return new MessageRenderer(messageProvider());
	}

	/*@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new MessageRenderer();
		renderer.setMessageProvider(messageProvider());
		return renderer;
	
	}*/



}