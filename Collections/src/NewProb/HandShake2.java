package NewProb;

public class HandShake2
{
	
	public static int countHandShakes(int members)
	{
		int n = members;
		
		 return n*(n-1)/2;
	}
	
	public static void main (String [] args)
	{
		
		       int classSize = 4;
		      int count = countHandShakes(classSize);
		      
		      System.out.println("count of handshakes : "+count);
		       
	}

}
