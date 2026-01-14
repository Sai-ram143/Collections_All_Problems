package Array;



public class WordReverse {

	
	
	public static String reverse(String s )
	{
		
		
		                   String[]  words =   s.split("\s");
		                   
		             
		                   for(String word : words)
		                   {
		                	    
		                	  
		                	   for(int i =words.length-1;i>=0;i--)
		                	   {
		                		               Sb.append(words(i));
		                	   }
		                   }
		                   
		
		return newStr;
		
	}

	
	public static void main(String[] args) {
	

		             
		                 
		       String s = "Hare ram krishna";
		       
		       
		     String revStr = reverse(s);
		     
		               System.out.println(revStr);
		              
		
		
	}

}
