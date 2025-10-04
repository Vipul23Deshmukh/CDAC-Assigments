import java.util.Scanner;
public class Array2DServices {
	
	public static void acceptArr(int arr[][])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
	}
	
	public static void displayArr(int arr[][])
	{
		
		System.out.println(" array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	
	//maximum of the all elements.
	public static int findMax(int arr[][])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]>0)
				{
					max=arr[i][j];
				}
			}
			
		}
		return max;
	}
	//maximum of the each  row.
	public static int[] Maxrowise(int arr[][])
	{
		
			
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i][0];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]>temp[i])
				{
					temp[i]=arr[i][j];
				}
			}
			
		}
		
		return temp;
	   
	}
	
	//maximum of the each  column.
	public static int[] Maxcolumnwise(int [][] arr) {
		
		
		int[] temp=new int[arr.length];
		for(int j=0;j<arr.length;j++)
		{
			temp[j]=arr[0][j];
		}
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0; j<arr[0].length;j++) {
				
				if(arr[i][j]>temp[j]) {
					
					temp[j]=arr[i][j];
				}
			
			}
		}
		
		
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[3][3];
		
		acceptArr(arr);
		displayArr(arr);
		
		System.out.println("enter choice:");
		int c;
		
		
		do {
			c=sc.nextInt();
			switch(c)
			{
			case 1:
				break;
			
			case 2:
				break;
			
			case 3: int max=findMax(arr);
			        System.out.println("Maximum number of an array is "+max);
				break;
			
			case 4: int [] rmax=Maxrowise(arr);
			        for(int i=0;i<arr.length;i++)
			        {
			        	System.out.println(rmax[i]);
			        }
			       
				break;
				
			case 5: int[] cmax=Maxcolumnwise(arr);
					for(int i=0;i<arr.length;i++) {
						System.out.println(cmax[i]);
					}
				break;
			}
		}while(c!=14);

	}

}
