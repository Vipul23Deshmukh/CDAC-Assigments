package com.demo.dao;
import com.demo.beans.Employee;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmployeeDaoImpl implements EmployeeDao {
    Scanner sc= new Scanner(System.in);
	static List<Employee> lst;
	static {
		lst=new ArrayList<>();
		//lst.add(new Employee(1,"mohan","dev",9000.00));
	}
	
	//read data from txt file
	@Override
	public void readFiles(String fname) {
		
		File f=new File(fname);
		if(f.exists())
		{
			try(ObjectInputStream ois=new ObjectInputStream (new FileInputStream(fname));){
				
				while(true)
				{
					Employee e=(Employee)ois.readObject();
					lst.add(e);
				}
				
				
				
			}catch(EOFException e) {
				System.out.println("End of file");
			}catch(IOException e)
			{
				e.printStackTrace();
			}catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			System.out.println("size: "+lst.size());
		}
		
		
		
	}
	
	//addd data in list or save data entered by user
	@Override
	public boolean save(Employee e) {
		
		
		return lst.add(e);
	}
	
	
// writes data on text file	
	@Override
	public void writeData(String fname) {
	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname));)
		
		{
			for(Employee e:lst)
			{
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> DisplayAll() {
		return lst;
	}


	@Override
	public boolean modifyById(int id, double sal) {
		int pos=lst.indexOf(new Employee(id));
		
		if(pos!=-1)
		{
			lst.get(pos).setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDataById(int id) {
	
		int pos=lst.indexOf(id);
		if(pos!=-1)
		{
			lst.remove(pos);
			return true;
		}
		return false;
	}
	

}
