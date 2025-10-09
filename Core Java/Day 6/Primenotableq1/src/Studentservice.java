import java.util.Scanner;
public class Studentservice {
	
	static Studentinfo stdarr[];
	
	static int cnt;
	static {
		stdarr=new Studentinfo[100];
		stdarr[0]=new Studentinfo(1,"sita",98,97,96);
		cnt=1;
	}
	
	public static boolean acceptDetails() {
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
		Studentinfo s=new Studentinfo(id,name,m1,m2,m3);
		
		if(cnt==stdarr.length)
		{
			return false;
		}
		else {
			stdarr[cnt]=s;
			cnt++;
			return true;
		}
	}
	
	
	public static void display()
	{
		System.out.println("Student Information:");
		for(int i=0;i<cnt;i++) {
			System.out.println(stdarr[i]);
		}
		
	}

	

}
