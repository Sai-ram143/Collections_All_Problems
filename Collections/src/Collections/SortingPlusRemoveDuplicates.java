package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingPlusRemoveDuplicates {

	
	
	public static List<Integer> sortEle(List<Integer> ob)
	{
		
		Collections.sort(ob);
		
		//List<Integer> li = new ArrayList<>();
		
 		for(int i=0 ;i < ob.size();i++ )
		{
		       int count = 0;
			for(int j=i+1;j < ob.size(); j++)
			{
				  if(ob.get(i).equals(ob.get(j)))
				  {
					 
					     ob.remove(j);
				  }
			}
			
			
		}
		
		
		return ob;
		
	}
	
	

	public static void main(String[] args)
	{
		
		List<Integer> li = new ArrayList<>(Arrays.asList(0,0,6,2,1,4));
		
	      List<Integer> unique =	sortEle(li);
		
	      
	     for(int k : unique)
	     {
	    	 System.out.print(k+" ");
	     }
	

	}

}
