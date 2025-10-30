package Test;

import Search.SearchingService;

public class TestSearchingin1D {

	public static void main(String[] args) {
		
			
			
			int arr[]= {10,5,9,4,5,7,8,2,3,1};
			
			int pos=SearchingService.sequentialsearch(arr,8);
			if(pos!=-1)
			{
				System.out.println("Number found at "+pos+"  position");
			}
			else
			{
				System.out.println("Number not found");
			}
			
			
			int arr1[]= {12,13,16,23,27,45,56,58,62,65,70};
			
			int pos1=SearchingService.BinaryNonRecursiveSearch(arr1,65);
             if(pos1!=-1) {
            	 System.out.println("Number found ar the postion"+pos1);
            	 
             }
             else {
            	 System.out.println("The number is not present");
             }
             
             int pos2=SearchingService.BinarySearchRecursive(arr1,45,0,10);
             
             if(pos2!=-1)
             {
            	 System.out.println("number found at "+pos2+"position");
             }
             else
             {
            	 System.out.println("number not found");
             }
		}

			
			
	}

