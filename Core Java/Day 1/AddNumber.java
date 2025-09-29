import java.util.Scanner;

class AddNumber{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter two num");
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int sum = a+b;
	
	System.out.println("The sum is "+sum);
	}

}