package PracticeAllProject;

public class CountPrimeNumber {

	public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Number of prime numbers between " + start + " and " + end + ": " + count);
    }

    // Simple method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
