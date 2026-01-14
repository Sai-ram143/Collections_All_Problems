package NewProb;

import java.io.FileWriter;

public class Febonacci2
{
	
	public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    
    
    public static int gcd(int a,int b) {
    	
    	
     if(b == 0)
     {
    	 return a ;
     }
     return gcd(b,a%b);
    	
    	
    }
    
	
	
	public static void main(String[] args)
	{
		 
		
		int[] arr = {3,6,9,8};
		
		 String fileName = "feb.txt";
		 
		 
	
		FileWriter fw = new FileWriter(fileName);
		
		 
		      for(int n : arr)
		      {
		    	      int febVal = fib(n);
		    	      fw.write(febVal);
		      }
		        

		

		         
		         System.out.println("GCD of two numbers :"+gcd(fibVal1,fibVal2));
		         
	}

}
