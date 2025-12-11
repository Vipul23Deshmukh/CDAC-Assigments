package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Order;

public class TestCollection {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");

		Order ob=(Order) ctx.getBean("o1");
		System.out.println(ob);
	}

}
