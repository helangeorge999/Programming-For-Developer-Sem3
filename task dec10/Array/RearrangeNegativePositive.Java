import java.util.ArrayList;

public class RearrangeNegativePositive {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 5, -3, 7};

        // Separate negative and positive numbers
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
        }

        // Combine the lists back into the array
        int index = 0;
        for (int num : negatives) {
            arr[index++] = num;
        }
        for (int num : positives) {
            arr[index++] = num;
        }

        // Print the rearranged array
        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
