
import java.util.Scanner;

public class PrimenoArr{
	
//accept array elements from user
	public static void acceptdata(int []arr){
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the numbers");
		for(int i =0;i<arr.length; i++){
		
		
		arr[i]=sc.nextInt();
		
		}
	 
	}
	
	//display array elements
	public static void display(int arr[])
	{
		System.out.println("Display array elements:");
		for(int i =0;i<arr.length; i++){
			
			
			 System.out.println(i+":"+arr[i]);
			
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

//function to find factorial of number
public static void fact(int arr[])
{
	
	for(int i=0;i<arr.length;i++)
	{
		 int f=1;
		if(arr[i]<7)
		{
           for(int j=1;j<=arr[i];j++)
           {
        	  
        	 f=f*j;
           }
           
           System.out.println("fact of "+arr[i]+"="+f);
		}
	
		
	}
	
}



//Nth min



public static int Nthmin(int []arr,int n) {

	for(int i=0;i<n;i++) {
		
	int pos=findMinPos(arr, i);
	
	int temp =arr[i];
	arr[i]=arr[pos];
	arr[pos]=temp;
	}
	
	
	
	return arr[n-1];
}

public static int findMinPos(int[] arr, int start) {
	
	int pos=start;
	int min=arr[pos];
	for(int i=start+1;i<arr.length;i++) {
		
		if(min>arr[i]) {
			pos=i;
			min=arr[i];
		}
		
		
	}
	return pos;
	}


public static int searchByValue(int []arr,int m) 
{
	for(int i=0;i<arr.length;i++)
	{
		if(m==arr[i])
		{
			return i;
		}
		
	}
	return -1;
	
}


public static int addodd(int arr[])
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			sum=sum+arr[i];
		}
	}
	return sum;
}


		public static void main(String [] args){
			
			Scanner sc =new Scanner(System.in);
			int arr[]=new int[5];
			
			//min
           System.out.println("1.Accept data"+"\n"+"2.Display data"+"\n"+"3.Find nth Min"+"\n"+"4.Find prime"+"\n"+"5.Find fact."+"\n"+"6.Search By value"+"\n"+"7.Find sum of odd");
			
			
			int c;
			
			do {
				System.out.println(" enter choice:");
				 c=sc.nextInt();
		switch(c)
		{
		case 1:
			acceptdata(arr);
			break;
		case 2:
			display(arr);
			break;
			
		case 3:
			System.out.println("enter n to search min:");
			int n=sc.nextInt();
			int minimum=Nthmin(arr,n);
			
			System.out.println(n+" Mimum value :  "+minimum);
			break;
			
		case 4:
				for(int i=0;i<arr.length;i++){
					
					if (findprime(arr[i]))
						System.out.println("Prime no");
					
					else
						System.out.println("Not prime");
				}				
 			break;
 			
		case 5:	
			  fact(arr);
			  break;
			  
		case 6:	  
			  System.out.println("enter element for search:");
			  int m=sc.nextInt();
			  
			  int pos=searchByValue(arr,m);
			  if(pos!=-1)
			  {
				  System.out.println("Found ");
				  
			  }
			  else {
				  System.out.println("Not found");
			  }
			 break;
			 
		case 7:
			  int sum=addodd(arr);
			  System.out.println("Additon of odd elements of an array ="+sum);
			  break;
		default:
			System.out.println("Please use your unused brain");
			break;
		}
		
		}while(c!=8);
		}	
	
}