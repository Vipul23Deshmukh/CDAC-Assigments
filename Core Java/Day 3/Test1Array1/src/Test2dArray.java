import java.util.Scanner;
public class Test2dArray {
	
	//accept array elements
	public static void accept(int arr[][])
	{
		System.out.println(" Enter alements in 2D array:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	//display arrray elements
	public static void display(int arr[][])
	{
		System.out.println("  alements in 2D array:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int td[][]=new int[3][3];
		accept(td);
		display(td);

}
}
