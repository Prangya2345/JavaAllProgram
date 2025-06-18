package PracticeAllProject;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {
		 int[] numbers = {4, 2, 9, 1, 7, 5};

	        int max = numbers[0];
	        int min = numbers[0];

	        for (int num : numbers) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	    }
	}