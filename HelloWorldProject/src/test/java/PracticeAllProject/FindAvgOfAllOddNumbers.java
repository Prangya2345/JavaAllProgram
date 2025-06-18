package PracticeAllProject;

import java.util.Arrays;

import java.util.List;

public class FindAvgOfAllOddNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 4, 7, 10, 9, 2, 5);

        int sum = 0, count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers in the list.");
        }
    }
}
