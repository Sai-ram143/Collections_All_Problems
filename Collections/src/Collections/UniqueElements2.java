package Collections;

public class UniqueElements2 {

	public static int[] findUnique(int[] arr,int[] arr2)
	{
	   

	    for(int i = 0; i < arr.length; i++)
	    {
	        int count = 0;

	        // check all elements (not only after i)
	        for(int j = 0; j < arr.length; j++)
	        {
	            if(arr[i] == arr[j])
	            {
	                count++;
	            }
	        }

	        // unique means count == 1
	        if(count == 1)
	        {
	            arr2[i] = arr[i];
	        }
	    }

	    return arr2;
	}


	public static void main(String[] args) {
		
		int[]  arr = {7,5,6,1,5,6};
	
		int[] arr3 ;
		
		   int[] uniqueArr = UniqueElements2.findUnique(arr,arr3);
		
		   for(int k : uniqueArr)
		   {
			   System.out.print(k+" ");
		   }

	}

}
