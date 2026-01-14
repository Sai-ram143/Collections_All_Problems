package Collections;

public class UniqueElements {

	
	public static int[] findUnique(int[] arr)
	{
	    int[] arr2 ;
	    int index = 0;   // <-- added to collect only unique values

	    for(int i = 0; i < arr.length; i++)
	    {
	        int count = 0;

	        // count occurrences of arr[i]
	        for(int j = 0; j < arr.length; j++)
	        {
	            if(arr[i] == arr[j])
	            {
	                count++;
	            }
	        }

	        // unique means appears only once
	        if(count == 1)
	        {
	            arr2[index] = arr[i];  // <-- store compactly
	            index++;
	        }
	    }

	    // trim result to exact unique count
	    int[] unique = new int[index];
	    for(int i = 0; i < index; i++)
	    {
	        unique[i] = arr2[i];
	    }

	    return unique;
	}


	public static void main(String[] args) {
		
		
		int[]  arr = {7,5,6,1,5,6};
		
		   int[] uniqueArr = UniqueElements.findUnique(arr);
		
		   for(int k : uniqueArr)
		   {
			   System.out.print(k+" ");
		   }

	}

}
