package Search;

public class SearchingService {

	public static int sequentialsearch(int[] arr, int search) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				return i;
			}
		}
		return -1;
	}

	public static int BinaryNonRecursiveSearch(int[] arr1, int i1) {
	 
		int low=0;
		int high=arr1.length-1;
		int cnt=0;
		
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			cnt++;
			
			if(arr1[mid]==i1) {
				System.out.println("Comparisions are:"+cnt);
				return mid;
				
			}
			
			else if(i1<arr1[mid]) {
				high=mid-1;
				
			}
			
			else {
				low=mid+1;
			}
			
			
		}
		 System.out.println("comparisions are "+cnt);
		return -1;
	}

	public static int BinarySearchRecursive(int[] arr1, int search, int low, int high) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr1[mid]==search)
			{
				return mid;
			}
			else if(search<arr1[mid])
			{
				return BinarySearchRecursive(arr1, search,low,mid-1);
			}
			else
			{
				return BinarySearchRecursive(arr1, search, low, mid+1);
			}
		}
		
		
		return -1;
	}
	
}