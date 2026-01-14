package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	
	public static void main(String[] args) {


		
		   List<Integer> li = Arrays.asList(12,19,7,8,34,29);
				   
		List<Integer>  evenNumbers     =         li.stream()
		                                                              .filter(n -> n % 2 == 0)
		                                                              .collect(Collectors.toList());
		
		
	              evenNumbers.forEach(n ->  System.out.print(n+" "));
	} 

}
