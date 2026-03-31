import java.util.*;

class LongestConsecutive {

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            // Start of sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums)); // Output: 4
    }
}