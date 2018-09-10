package com.cubic.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		Flipkart f=(Flipkart)context.getBean("flipkart");
		f.getC().deliver();
		
		/*f.getBd().deliver();
		f.getDtdc().deliver();*/
	}
	
}
