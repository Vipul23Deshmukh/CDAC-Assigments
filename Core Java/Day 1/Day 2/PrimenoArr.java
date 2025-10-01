import java.util.Scanner;

public class PrimenoArr{

	public static void acceptdata(int []arr){
	 Scanner sc =new Scanner(System.in);
		for(int i =0;i<arr.length; i++){
		
		System.out.println("Enter the numbers");
		arr[i]=sc.nextInt();
		
		}
	 
	}

	
	
	//1.Prime number

public static boolean findprime(int num){
if (num==0 || num==1)
		 return false;
		
		
		for(int i=0;i<num/2;i++){
		
			if(num%2==0 && num!=2){
				return false;
			}
			
			
		}
		return true;
	}	


		public static void main(String [] args){
			
			Scanner sc =new Scanner(System.in);
			int arr[]=new int[10];
			
			acceptdata(arr);
				for(int i=0;i<arr.length;i++){
					
					if (findprime(arr[i]))
						System.out.println("Prime no");
					
					else
						System.out.println("Not prime");
				}				
 			
			
			
			
		}

}import java.util.Scanner;

public class PrimenoArr{

	public static void acceptdata(int []arr){
	 Scanner sc =new Scanner(System.in);
		for(int i =0;i<arr.length; i++){
		
		System.out.println("Enter the numbers");
		arr[i]=sc.nextInt();
		
		}
	 
	}

	
	
	//1.Prime number

public static boolean findprime(int num){
if (num==0 || num==1)
		 return false;
		
		
		for(int i=0;i<num/2;i++){
		
			if(num%2==0 && num!=2){
				return false;
			}
			
			
		}
		return true;
	}	


		public static void main(String [] args){
			
			Scanner sc =new Scanner(System.in);
			int arr[]=new int[10];
			
			acceptdata(arr);
				for(int i=0;i<arr.length;i++){
					
					if (findprime(arr[i]))
						System.out.println("Prime no");
					
					else
						System.out.println("Not prime");
				}				
 			
			
			
			
		}

}