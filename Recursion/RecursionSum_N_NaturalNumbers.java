package JobPreparation.TwoPointers.Recursion;

public class RecursionSum_N_NaturalNumbers {

	    static void func(int i, int sum){
	        
	            // Base Condition.
	            if(i<1){
	                
	                System.out.println(sum);
	                return;
	            }
	            
	            // Function call to increment sum by i till i decrements to 1.
	            func(i-1,sum+i);
	            

	    }
	    public static void main(String[] args) {

	       // Here, let’s take the value of n to be 3.
	       int n = 3;
	       func(n,0);
	    }
	
}

/*Parameterized way
 * Recursion Tree
 func(3,0)
 func(2,3)
 func(1,5)
 func(0,6)
 */


