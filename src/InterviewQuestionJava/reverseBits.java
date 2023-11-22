package InterviewQuestionJava;

public class reverseBits
{
	    public int reverseBits(int n) {
	        int result = 0;
	        for (int i = 0; i < 32; i++) {
	            result = (result << 1) | (n & 1);
	            n >>>= 1; // Use unsigned right shift to fill with zeros
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        reverseBits reverseBitsObj = new reverseBits();
	        
	        // Example usage:
	        int input = 43261596;  // Binary: 00000010100101000001111010011100
	        int output = reverseBitsObj.reverseBits(input);
	        
	        System.out.println("Input:    " + Integer.toBinaryString(input));
	        System.out.println("Output:   " + Integer.toBinaryString(output));
	        System.out.println("Reversed: " + output);
	    }
	}
