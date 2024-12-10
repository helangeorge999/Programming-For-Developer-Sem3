import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 4, 3, 5, 3};

        // Use a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count the occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Element frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + ": " + frequencyMap.get(key) + " times");
        }
    }
}
