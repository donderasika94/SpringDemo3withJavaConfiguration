package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.annotated.MessageConfiguration;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args){
		

		//Constructor & Setterinjection with Java Configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		System.out.println(renderer.hashCode());

		MessageRenderer renderer1 = context.getBean(MessageRenderer.class);
		System.out.println(renderer1.hashCode());

		renderer.render();

		
	}

}