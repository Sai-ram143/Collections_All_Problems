package Collections;

public class StackArray {

	
	private int[] arr1;
	private int  top;
	private int maxSize;
	
	
	StackArray(int size)
	{
		  maxSize = size;
		  arr1 = new int[maxSize];
		  top = -1;
	}
	
	public boolean isFull()
	{
		if(top == maxSize-1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	
	public int push(int value)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
			return -1;
		}
		arr1[++top] = value;
 	 System.out.println("Value is inserted");
	return value;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
 			System.out.println("Stack underflow");
			return -1;
		}
		
		int popedVal = arr1[top--];
		System.out.println("Poped value :"+popedVal);
		return popedVal;
	}
	
	public int size()
	{
		return top;
	}
	
	
	public int max()
	{
		
		
		int max  = arr1[0];
		for(int i =0;i< arr1.length;i++)
		{
			
			if(arr1[i] > arr1[i+1])
			{
				 max = arr1[i];
			}
		}
		
		return max;
	}
	
	
	public int peak()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return -1;
		}	
		
		int peakVal = arr1[top];
		return peakVal;
	}
	
	public void search(int value)
	{
		for(int i=0;i<=top;i++)
		{
			 if(value == arr1[i])
			 {
				 System.out.println("Value found ");
			 }
			
			 
		}
		System.out.println("Value not found");
	}
	
}
