import java.util.Scanner;
class Greater{

    public static void main(String args[])
	{
	     Scanner sc=new Scanner(System.in);
		  System.out.println(" enter 3 numbers:");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  
		  
		  if(a==b && b==c)
		  {
		      System.out.println(" All numbers are equal..");
		  }
		  if(a>b && a>c)
		  {
		     System.out.println(a+" is greater.");
		  } else if(b>c && b>a)
		  {
		     System.out.println(b+" is greater." );
		  }
		  else{
		     System.out.println(c+" is greater.");
		  }
		 
		 
	}
}