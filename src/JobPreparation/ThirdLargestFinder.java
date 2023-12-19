package JobPreparation;

import java.util.Scanner;

public class ThirdLargestFinder {

    int findThirdLargest(int a[], int n) {
        if (n < 3) {
            return -1;
        }

        int first = a[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] > third) {
                third = a[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ThirdLargestFinder finder = new ThirdLargestFinder();
        int result = finder.findThirdLargest(arr, n);

        if (result != -1) {
            System.out.println("The third largest element is: " + result);
        } else {
            System.out.println("There are less than three elements in the array.");
        }
    }
}
