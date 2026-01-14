package NewProb;

public class HandShake {

	
	public static int CountHandShakes(int[] arr)
	{
		
		int count =0;
		for(int i=0;i< arr.length;i++)
		{
			for(int j=i+1;j < arr.length;j++)
			{
				   count++; 
			}
			   
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		
	  int	classRoomSize = 10;
		
	  int[] arr = new int[classRoomSize];
		
		int count = HandShake.CountHandShakes(arr);
		
		System.out.println("count = "+count);
           
	}

}
