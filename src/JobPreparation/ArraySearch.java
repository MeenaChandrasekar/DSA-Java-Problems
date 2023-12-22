package JobPreparation;



class ArraySearch {

    // Method to search for an element in the array
    static int searchElement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;  // Return the index if the element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        // Test case
        int[] arr = {1, 2, 3, 4};
        int elementToSearch = 3;

        // Search for the element in the array
        int resultIndex = searchElement(arr, elementToSearch);

        // Display the result
        if (resultIndex != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array");
        }
    }
}
