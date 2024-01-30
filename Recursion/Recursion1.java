package JobPreparation.TwoPointers.Recursion;

public class Recursion1 {
	    
	    static void func(int i, int n){
	        
	            // Base Condition.
	            if(i>n) return;
	            System.out.println("Meena");

	            // Function call to print till i increments.
	            func(i+1,n);

	    }
	    public static void main(String[] args) {

	       // Here, let’s take the value of n to be 6.
	       int n = 6;
	       func(1,n);
	    }
	}

/*
T.C - N(N)
S.C - O(N)
*/