import java.util.Scanner;
class Sum{

 public static void main(String args[]){
  System.out.println("Enter the number ");
 Scanner sc =new Scanner(System.in);
 int n = sc.nextInt();
 long sum=0;
 for (int i=1;i<=n;i++){
 
	
	sum=sum+i;
 
 
 
 }
 
 System.out.println("The sum of"+n+"number is :"+sum);
 
 
 }
 


}