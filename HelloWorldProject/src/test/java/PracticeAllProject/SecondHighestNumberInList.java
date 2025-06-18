package PracticeAllProject;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumberInList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 40, 50);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest found");
        } else {
            System.out.println("Second highest: " + secondHighest);
        }
    }


	}
