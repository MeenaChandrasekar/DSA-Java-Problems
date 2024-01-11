package JobPreparation.TwoPointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFinder {

    public static void main(String[] args) {
        // Example arrays
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};

        // Convert arrays to lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        // Use retainAll to keep only common elements
        list1.retainAll(list2);

        // Convert the result back to an array
        Integer[] commonElements = list1.toArray(new Integer[0]);

        // Print the common elements
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }
}
