import java.util.Scanner;
public class Array2DService {

	public static void acceptData(int arr[][]) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			//allocate column dynamically for each row
			System.out.println("enter value of column for row: "+i);
			int col=sc.nextInt();
			arr[i]=new int[col];
			//accept data for each row
		    for(int j=0;j<arr[i].length;j++)
		    {
		    	System.out.println("enter value for "+i+","+j);
		    	arr[i][j]=sc.nextInt();
		    }
		}
		
	
		
	}

	public static void displayData(int[][] arr) {
	
		System.out.println("Array Data");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println(".................................... ");
	}

	
	

	public static int[] addRowWise(int[][] arr) {
		
		int []sum=new int[arr.length];
	
		for(int i=0;i<arr.length;i++)
		{
		   sum[i]=0;
		 
		   for(int j=0;j<arr[i].length;j++)
		   {
			  sum[i]=sum[i]+arr[i][j];
		   }
		}
		return sum;
	}

	

	public static int[] columnRowWise(int[][] arr) {
		int Col = 0;
		 for (int i = 0; i < arr.length; i++) {
		        if (arr[i].length > Col) {
		            Col = arr[i].length;
		        }
		    }
		int []sum1=new int[arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
		  
		   
		   for(int j=0;j<arr[i].length;j++)
		   {
			   sum1[j]+=arr[i][j];
		   }
		}
		return sum1;
	}

}
