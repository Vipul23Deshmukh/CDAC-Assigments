package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;



public class TestEmpProjCRUDDemo {          // class open

    public static void main(String[] args) { // main open

        Scanner sc = new Scanner(System.in);

        ProjectService pservice = new ProjectServiceImpl();
        EmployeeService eservice = new EmployeeServiceImpl();

        int choice = 0;
        do {                                 // do-while open

            // menu printing
            System.out.println("1.Add Project");
            System.out.println("2.Add Employee");
            System.out.println("3.Show all employee");
            System.out.println("4.delete employee");
            System.out.println("5.Update Employee Salary");
            System.out.println("6.Add project in existing project");
            System.out.println("7.Display Employee in sorted Order");
            System.out.println("8.Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch(choice) {                  // switch open

                case 1: {
                    pservice.addNewProject();
                    break;
                }

                case 2: {
                    boolean status = eservice.AddNewEmployee();
                    if(status) {
                        System.out.println("employee added successfuly");
                    } else {
                        System.out.println("error ");
                    }
                    break;
                }

                case 3: {
                    List<Employee> elist = eservice.showall();
                    elist.stream().forEach(System.out::println);
                    break;
                }

                case 4: {
                    System.out.println(" enter employee id to delete");
                    int id = sc.nextInt();
                    boolean status2 = eservice.deleteEmployee(id);
                    if(status2) {
                        System.out.println(" deleted emp data successfully");
                    } else {
                        System.out.println("not deleted");
                    }
                    break;
                }

                case 5: {
                    System.out.println("enter emp id to modify data");
                    int id = sc.nextInt();
                    System.out.println(" enter new salary ");
                    double sal = sc.nextDouble();
                    boolean status3 = eservice.modifySal(id, sal);
                    if(status3) {
                        System.out.println("modified successfully....");
                    } else {
                        System.out.println(" not modified..");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Enter Employee id for adding project");
                    int eid = sc.nextInt();
                    System.out.println("Enter project id");
                    int pid = sc.nextInt();
                    boolean status6 = eservice.ProjecttoEmployee(eid, pid);
                    if(status6) {
                        System.out.println("Added successfully");
                    } else {
                        System.out.println("Not added");
                    }
                    break;
                }

                case 7: {
                    List<Employee> elist = eservice.SortEmployeeBySalary();
                    elist.stream().forEach(System.out::println);
                    break;
                }

            } // switch close

        } while(choice != 8);                 // do-while close

    } // main close

} // class close
