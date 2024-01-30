package JobPreparation.TwoPointers.Recursion;

public class RecursionNto1 {

    static void func(int i, int n){
        
        // Base Condition.
        if(i<1) return;
        System.out.println(i);

        // Function call to print i till i decrements to 1.
        func(i-1,n);

}
public static void main(String[] args) {

   // Here, let’s take the value of n to be 4.
   int n = 4;
   func(n,n);
}
}
