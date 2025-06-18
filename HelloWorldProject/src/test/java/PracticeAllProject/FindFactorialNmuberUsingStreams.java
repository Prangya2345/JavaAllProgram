package PracticeAllProject;

import java.util.stream.IntStream;

public class FindFactorialNmuberUsingStreams {

		public static void main(String[] args) {
	        int number = 5;

	        long factorial = IntStream.rangeClosed(1, number)
	                                  .reduce(1, (a, b) -> a * b); // multiply all values

	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	}
