package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.demo.beans.*;
public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		
		lst.add(new Employee(1,"gagan","developer",50000.50));
		lst.add(new Employee(2,"magan","UIdeveloper",40000.50));
		lst.add(new Employee(3,"chhagan","Uxdeveloper",30000.50));
		lst.add(new Employee(4,"Suyog","sweeper",500.50));
		
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata2.txt"));)
		{
			
			
			for(Employee e:lst)
			{
				oos.writeObject(e);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata2.txt"));)
		{   while (true) {
			 try {
		            Employee e = (Employee) ois.readObject();
		            System.out.println(e);
		        } catch (EOFException eof) {
		            break; // End of file reached, exit loop
		        }
		}
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}
}
