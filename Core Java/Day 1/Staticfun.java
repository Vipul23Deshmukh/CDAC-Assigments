import java.util.Scanner;
class Staticfun{
  public static int fact(int n)
  {
     int f=1;
	 
	 if(n<=1)
	 {
	   return 1;
	 }
	 
	 else
	 {
	    for(int i=1;i<=n;i++)
		{
		   f=f*i;
		}
	  
	  
	  }
	  return f;
  }
  
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 
	 int n=sc.nextInt();
	 
	 int ans=fact(n);
	 
	 System.out.println("Factorial of num = "+ans);
	 
  }
}