package corejava.arrays;

public class MaxElementFinder {

    public static int findMax(int[] arr) {
        int max = arr[0];  // Start with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 11, 17,17};
        System.out.println("Maximum element is: " + findMax(arr));
    }
}
