package JobPreparation;

class Solution {
    public String is_palindrome(int n) {
        int revNum = 0;
        int temp = n;

        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp = temp / 10;
        }

        if (n == revNum) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int number = 121;
        String result = solution.is_palindrome(number);
        System.out.println(result);
    }
}
