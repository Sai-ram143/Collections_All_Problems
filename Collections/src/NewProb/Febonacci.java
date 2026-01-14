package NewProb;


public class Febonacci
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
		 
		      
		         int n1 = 3;
		         int n2 = 6;
		         
		         int fibVal1 = fib(n1);
		         int fibVal2 = fib(n2);
		         
		         System.out.println("febonocci of n1 : " + fibVal1);
		         System.out.println("febonocci of n2 : " + fibVal2);
		         
		         System.out.println("GCD of two numbers :"+gcd(fibVal1,fibVal2));
		         
	}

}
