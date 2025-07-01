package PracticeAllProject;

import java.util.Scanner;

public class PalendromeProgram {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String original = scanner.nextLine();

	        String reversed = new StringBuilder(original).reverse().toString();

	        if (original.equalsIgnoreCase(reversed)) {
	            System.out.println("It's a palindrome!");
	        } else {
	            System.out.println("Not a palindrome.");
	        }

	        scanner.close();
	    }

	}