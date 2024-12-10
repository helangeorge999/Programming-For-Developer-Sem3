import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 19, 3, 17};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        Arrays.sort(arr);

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        // Find second smallest
        for (int num : arr) {
            if (num > smallest) {
                secondSmallest = num;
                break;
            }
        }

        // Find second largest
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second Smallest Element: " + secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
