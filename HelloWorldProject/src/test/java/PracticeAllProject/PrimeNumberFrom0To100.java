package PracticeAllProject;

public class PrimeNumberFrom0To100 {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }

}


