package JobPreparation;


import java.util.Scanner;


public class LeftRotateArrayByOne {

    static int[] rotateArrayByOne(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Rotate the array by one position to the left
        arr = rotateArrayByOne(arr, n);

        // Output the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
