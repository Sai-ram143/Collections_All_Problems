package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Duplicates
{
    
    public static int countDuplicates(int[] arr)
    {
        
    	int count =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                 
                 if(arr[i] == arr[j])
                 {
                     count++;
                 }
            }
            
        }
        return count;
	
        
       
        
    }
    
    
	public static void main(String[] args) {
	
	        
		
		List<Integer>   li  = new ArrayList<>(Arrays.asList(45,78,90));
		
		li.remove(0);
	
		
		System.out.print("Remaining in the list"+" ");
		li.forEach(x -> 
		{
		System.out.print(x+" ");
		}
		);
 		
	        int[] arr = {7,8,9,4,4,7};
	      
	      
	   int count = countDuplicates(arr); 
	        
	       
	       System.out.println("\n count of Duplicates :"+count); 
	}
}
