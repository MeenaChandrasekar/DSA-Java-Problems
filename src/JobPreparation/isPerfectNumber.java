package JobPreparation;

public class isPerfectNumber {

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

	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(isPerfectNumber(6));  // Output: 1
	        System.out.println(isPerfectNumber(10)); // Output: 0
	    }
	}
