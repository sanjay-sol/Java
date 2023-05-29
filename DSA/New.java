public class MissingElement {
    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // Size of original array N
        
        // Calculate the sum of integers from 1 to N
        int sum = (n * (n + 1)) / 2;
        
        // Calculate the sum of elements in the given array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        
        // The missing element is the difference between the expected sum and the actual sum
        int missingElement = sum - arrSum;
        
        return missingElement;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Example array
        
        int missingElement = findMissingElement(arr);
        System.out.println("Missing element: " + missingElement);
    }
}
