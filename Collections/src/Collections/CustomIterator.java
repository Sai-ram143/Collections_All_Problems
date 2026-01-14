package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomIterator 
{
	
	
	public static void main(String[] args)
	{
		
		     List<Integer> li = new ArrayList<>(Arrays.asList(45,89,23,79));

		     
	/*	     for(int k : li)
		     {
		    	 li.remove(0);                =============== ConcurrentModificationException 
		    	 System.out.print(k+" ");    
		     }
		*/     
		     ConcurrentHashMap<Integer,String> ch = new ConcurrentHashMap<>();
		     
		     ch.put(1,"Sai");
		     ch.put(2,"harsha");
		     ch.put(3,"chandu");
		     
		     
		     
		     
		        for(Map.Entry<Integer,String> k : ch.entrySet())
		        {
		        	
		       	ch.remove(k);
		        	
		        	System.out.print(k.getKey()+" ");
		        	
		        	
		        	
		        }
		     
		        
		     
		     
		
	}

}
