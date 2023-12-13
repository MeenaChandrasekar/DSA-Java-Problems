package JobPreparation;

import java.util.Scanner;

	public class PerfectNumberChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to check if it's a perfect number: ");

	        // Read the user's input as a long
	        long userInput = scanner.nextLong();

	        // Call the isPerfectNumber function and print the result
	        int result = isPerfectNumber(userInput);
	        System.out.println("Result: " + result);

	        scanner.close();
	    }
	    
	    static int isPerfectNumber(long N) {
	        long sum = 0;

	        // Iterate through potential divisors up to the square root of N
	        for (long i = 1; i <= Math.sqrt(N); i++) {
	            if (N % i == 0) {
	                if (i == N / i) {
	                    sum = sum + i;
	                } else {
	                    sum = sum + i + N / i;
	                }
	            }
	        }

	        sum = sum - N; // Exclude the number itself

	        // Check if the sum of divisors equals the original number
	        if (sum == N) {
	            return 1; // Return 1 if it's a perfect number
	        }
	        return 0; // Return 0 if it's not a perfect number
	    }
	}

