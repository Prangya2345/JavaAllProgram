package PracticeAllProject;

public class StringFibonacciSeries {

	public static void main(String[] args) {
		int n = 7; // Number of terms to print
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            
        }
    }
}


