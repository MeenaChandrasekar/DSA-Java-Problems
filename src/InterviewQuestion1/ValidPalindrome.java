package InterviewQuestion1;

public class ValidPalindrome {
	

	    public boolean isPalindrome(String S) {
	        
	        int left = 0;
	        int right = S.length() - 1;

	        while (left < right) {
	            char leftChar = S.charAt(left);
	            char rightChar = S.charAt(right);

	            
	            if (!Character.isLetterOrDigit(leftChar)) {
	                left++;
	                continue;
	            }
	            
	            if (!Character.isLetterOrDigit(rightChar)) {
	                right--;
	                continue;
	            }

	            
	            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true; 
	    }
	}

	    


