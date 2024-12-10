public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;

        int xorRange = 0;
        for (int i = 1; i <= n; i++) {
            xorRange ^= i;
        }

        int xorArray = 0;
        for (int num : arr) {
            xorArray ^= num;
        }

        int missingNumber = xorRange ^ xorArray;
        System.out.println("Missing Number: " + missingNumber);
    }
}
