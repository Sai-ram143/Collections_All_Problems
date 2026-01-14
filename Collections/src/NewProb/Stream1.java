package NewProb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
		
		
		List<Integer>  li = Arrays.asList(14,2,90,18,18,29);
		
		
		 
 List<Integer>  newA = li.stream()
		                             .distinct()
		                             .sorted(Comparator.reverseOrder())
		                             .collect(Collectors.toList());
 
 
                newA.forEach(x -> System.out.print(x+" "));
				
	}

}
