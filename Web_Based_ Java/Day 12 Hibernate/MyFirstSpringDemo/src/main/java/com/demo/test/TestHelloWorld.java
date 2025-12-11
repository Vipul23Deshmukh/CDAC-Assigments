package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld Hwbean=(HelloWorld) ctx.getBean("Hw");
		
		
		 String msg=Hwbean.sayHello();
		 System.out.println(msg);
		 
		 
		 Employee e=(Employee) ctx.getBean("emp");
		 System.out.println(msg);
		 
		 System.out.println(e);
		 
		 Employee e1=(Employee) ctx.getBean("emp1");
		 System.out.println(e1);
		
		 MyUser u1=(MyUser) ctx.getBean("u1");
		 System.out.println(u1);
		 ((ClassPathXmlApplicationContext) ctx).close();

	}

}
