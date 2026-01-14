package Array;

import java.util.Scanner;

public class StockValue {

	          public static int findMaxProfit(int[] arr)
	              {
	        	  
	        		         int buyStock1=arr[0];
	        		         int sell1 = arr[4];
	        		         
	        		         int profit1 = arr[4] - arr[0];
	        		         
	        		         int buyStock2=arr[4];
	        		         int sell2 = arr[6];
	        		         
	        		         int profit2 = arr[6] - arr[4];
	        		         
	        		      int maxProfit = profit1 + profit2;
	        		         
	        
				return maxProfit;
	        	  
	        	  
	                
	                       }
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		
        System.out.println("Enter the size of an array");
        
        int size = s.nextInt();
        
		int[] arr = new int[size];
		
		
		System.out.println("Enter "+size +" values");
     	   
		
		for(int i=0;i<arr.length;i++)
		{
			 arr[i] = s.nextInt();
		}

		
     	int maxProfit = StockValue.findMaxProfit(arr);
     	
     	System.out.println("MaxProfit = "+maxProfit);

	}

}
