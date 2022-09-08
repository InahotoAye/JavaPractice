package StreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printing even and odd number
		List<Integer> list = Arrays.asList(1,2,3, 4,555,6,7,77,34,45,33);
		System.out.println(list);
		
		//adding 5 as a grace marks to each Array List marks object
		//	List<Integer> add5Gracemarks = list.stream().map(i->i+5).collect(Collectors.toList());
		
		
		//List<Integer> getListofPassed Students = list.stream().filter(i->i>35).collect(Collectors.toList());
		
		//getting the count
		long even = list.stream().filter(m->m>35).count();
		System.out.println(even);
		
		
	}

}
