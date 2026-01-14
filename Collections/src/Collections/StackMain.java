package Collections;

public class StackMain {

	public static void main(String[] args) {
		
		
		StackArray arr = new StackArray(100);
		
		arr.pop();
		arr.peak();
		arr.push(10);
		arr.push(19);
		arr.push(15);
		arr.push(4);
		arr.push(30);
	    arr.pop();
	    arr.search(10);
	      int size  = arr.size();
	      System.out.println("Size"+size);
	      
	      System.out.println("max value"+arr.max());
	      
	     arr.search(0);
	}

}
