import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		
		
		int choice=0;
		
		do 
		{
			
			System.out.println("1.Add Row Wise");
			System.out.println("2.Add Column Wise");
			
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
		{
			case 1:
				int []sum=Array2DService.addRowWise(arr);
				
				for(int i=0;i<arr.length;i++)
				{
				System.out.println("Adiition of "+i+" row :"+sum[i]);
				}
				
			
			case 2:
                 int []sum1=Array2DService.columnRowWise(arr);
				
				for(int i=0;i<arr.length;i++)
				{
				System.out.println("Adiition of "+i+" column :"+sum1[i]);
				}
			
		}
			
			
		}while(choice!=3);

	}

}
