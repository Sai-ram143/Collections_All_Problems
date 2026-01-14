
/* Two arrays having elements

arr1 = {7,2,5,3,5,3};
arr2 = {7,2,4,6,5,3,5,3};

*/

package Collections;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
	
	
	public static List<Integer> missingNum(int[] arr1,int[] arr2)
	{
		
		List<Integer> li = new ArrayList<>();
		
		
	
		for(int i =0;i<arr2.length;i++)
		{
			
			boolean found = false;
			
			for(int j =0;j<arr1.length;j++)
			{
				   
				if(arr2[i] == arr1[j])
				{
					found = true;
				}
			}
			   
			
			if(!found)
			{
				li.add(arr2[i]);
			}
		}
		
		
		return li;
		
	}

	public static void main(String[] args) {
		
		
	int[]	arr1 = {7,2,5,3,5,3};
	int[]	arr2 = {7,2,4,6,5,3,5,3};
	
	
	List<Integer> li = missingNum(arr1,arr2);
	
	
	li.forEach(x -> System.out.print(x+" "));
		

	}

}
