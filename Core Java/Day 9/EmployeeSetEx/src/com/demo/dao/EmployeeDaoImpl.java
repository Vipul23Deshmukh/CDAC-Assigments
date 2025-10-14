package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static Set<Employee> eset;
	static {
		eset=new HashSet<>();
		eset.add(new Employee(1,"Raju",50000,LocalDate.of(2023, 11, 10)));
		eset.add(new Employee(2,"Shyam",45000,LocalDate.of(2025, 11, 9)));
		eset.add(new Employee(3,"Babu",40000,LocalDate.of(2024, 10, 8)));
		eset.add(new Employee(4,"Om",30000,LocalDate.of(2023, 9, 9)));
	}
	
	@Override
	public boolean save(Employee e) {
	    return eset.add(e);
		
	}

	@Override
	public Set<Employee> showData() {
		
		return eset;
	}

	@Override
	public Employee SearchById(int id) {
		
		for(Employee e:eset) {
			if(e.getId()==id) {
				return e;
			}
		
		
		}
		
		return null;
		
	}

	@Override
	public Set<Employee> SearchByName(String name) {
		Set<Employee> es=new HashSet<>();
		for(Employee e:eset)
		{
			if(e.getName().equals(name))
			es.add(e);
			
		}
		return es;
		
	}

	@Override
	public boolean ModifySalary(int id1, double sal1) {
		Employee e=SearchById(id1);
		
		if(e!=null) {
			e.setSalary(sal1);
			return true;
		}
			return false;
	}

	@Override
	public boolean deleteDataById(int id) {
	    Employee e=SearchById(id);
	    if(e!=null)
	    {
		 return eset.remove(e);
	 }
      return false;
	

}

	@Override
	public boolean deleteDataBySal(double sal3) {
	 
		return eset.removeIf(e->e.getSalary()>sal3);
	}

	@Override
	public Set<Employee> searchBySal(double sal4) {
		Set<Employee> es = new HashSet<>();
		for(Employee e:eset)
		{
			if(e.getSalary()>=sal4)
			{
				es.add(e);
				
			}
			
		}
		return es;
		
	}

	@Override
	public Set<Employee> SortByUsingId() {
		
		Set <Employee> eset1 = new TreeSet<>();
		for(Employee e:eset) {
			eset1.add(e);
		}
		
		return eset1;
	}

	@Override
	public List<Employee> SortByEmpName() {
		Comparator<Employee>c=(o1,o2)->{
			
			System.out.println("in name comparator "+o1.getName()+"-----"+o2.getName());

			return o1.getName().compareTo(o2.getName());
			
		};
		
		List <Employee> elist= new ArrayList<>();
	
		for(Employee e : eset) {
			
			elist.add(e);
		}
		
		elist.sort(c);
		
	return elist;
	}

	@Override
	public List<Employee> sortEmpSal() {
		Comparator<Employee> casl=(o1,o2)->{
			
			System.out.println("in sal comparator "+o1.getSalary()+"-----"+o2.getSalary());
			return (int) (o1.getSalary()-o2.getSalary());
		};
		
		//duplicate names will not be considered
				//Set<Employee> tset=new TreeSet<>(c);
		//hence used list
		List<Employee> lst1=new ArrayList<>();
		
		for(Employee e:eset)
		{
			lst1.add(e);
		}
		lst1.sort(casl);
		return lst1;
		
	}
	}
