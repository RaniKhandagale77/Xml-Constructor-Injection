package com.jsp.Pen;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {
public static void main(String[] args) {
	
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	Pen pen=(Pen)applicationContext.getBean("mypen");
	pen.printPenDetails();
}
}
