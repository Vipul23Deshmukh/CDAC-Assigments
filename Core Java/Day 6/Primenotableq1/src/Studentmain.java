import java.util.Scanner;

public class Studentmain {

	//student test and main are similar classes
	public static void main(String[] args) {
		Studentinfo s11=new Studentinfo();
		
		Studentinfo arr[]=new Studentinfo[2];
		
		for(int i=0;i<2;i++)
		{
			System.out.println("enter info for "+(i+1)+" student");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Student id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student name:");
			String name=sc.nextLine();
			
			System.out.println("Enter  m1 marks ");
			int m1=sc.nextInt();
			
			System.out.println("Enter m2 marks");
			int m2=sc.nextInt();
			
			System.out.println("Enter m3 marks");
			int m3=sc.nextInt();
			
			arr[i]=new Studentinfo(id,name,m1,m2,m3);
			
			
		}
		
		 // Display student details
        for (Studentinfo s : arr) {
            System.out.println("Student Details:");
            System.out.println("________________");
            System.out.println("Student Id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("M1: " + s.getM1());
            System.out.println("M2: " + s.getM2());
            System.out.println("M3: " + s.getM3());
            System.out.println();
        }

	}

}
