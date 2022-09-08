package StreamsInJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Quick lazy dogs jumps into the wall";
		
		String reverseStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
		// print both strings to console
       System.out.println("Original String = " + str);
        System.out.println("Reversed String = " + reverseStr);
 
 
        // print both string length to console
        //System.out.println("\n\nOriginal String length = " + str.length());
      //  System.out.println("Reversed String length = " + reverseStr.length());
		

	}

}
