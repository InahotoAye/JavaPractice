package StreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3, 4,555,6,7,77,34,45,33);
		
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		
		System.out.println(sum.get());
		
	}

}
