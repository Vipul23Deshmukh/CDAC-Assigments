package TestEmpList;

import com.demo.beans.Employeedata;

import EmpLinkedList.EmpLinkedData;

public class TestEmployeeList {
	public static void main(String args[])
	{
	EmpLinkedData elist=new EmpLinkedData();
	elist.addNode(new Employeedata(1,"karan",12000.0));
	elist.addNode(new Employeedata(1,"Arjun",3000.0));
	
	
	elist.addNode(new Employeedata(1,"lakhaan",80000.0));
	elist.display();
	

	
	
	}


}
