package JobPreparation.TwoPointers;

import java.util.Arrays;

public class twoSum {

	    public static String TwoSum(int n, int []arr, int target) {
	        Arrays.sort(arr);
	        int left = 0, right = n - 1;
	        while (left < right) {
	            int sum = arr[left] + arr[right];
	            if (sum == target) {
	                return "YES";
	            } else if (sum < target) left++;
	            else right--;
	        }
	        return "NO";
	    }

	    public static void main(String args[]) {
	        int n = 5;
	        int[] arr = {2, 6, 5, 8, 11};
	        int target = 14;
	        String ans = TwoSum(n, arr, target);
	        System.out.println("This is the answer for variant 1: " + ans);

	    }

	} 