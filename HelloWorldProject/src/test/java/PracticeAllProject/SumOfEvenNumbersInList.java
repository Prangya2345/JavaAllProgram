package PracticeAllProject;
import java.util.Arrays;
import java.util.List;
public class SumOfEvenNumbersInList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 7, 4, 3, 10);

        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)
                         .mapToInt(Integer::intValue)
                         .sum(); // Sum them

        System.out.println("Sum of even numbers: " + sum);
    }



}
