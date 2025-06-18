package PracticeAllProject;
import java.util.Arrays;
import java.util.List;
public class SumOfEvenNumbersInList {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 7, 4, 3, 10);
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}