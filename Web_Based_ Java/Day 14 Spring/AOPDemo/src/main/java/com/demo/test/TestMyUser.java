package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		MyUser u1=(MyUser) ctx.getBean("myUser");
		System.out.println(u1);
		u1.m1();
		System.out.println(u1.getName());
	}

}
