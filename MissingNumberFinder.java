public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Expected size of the array
        int sumOfAllNumbers = 0;
        int sumOfAllNumbersFrom1ToN = n * (n + 1) / 2;

        // Calculate the sum of all numbers in the array
        for (int num : nums) {
            sumOfAllNumbers += num;
        }

        // Find the missing number
        int missingNumber = sumOfAllNumbersFrom1ToN - sumOfAllNumbers;

        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
