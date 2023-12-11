package PrimeNumber;


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        int result = isPrime(N);
        System.out.println(result);
    }

    static int isPrime(int N) {
        if (N == 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
