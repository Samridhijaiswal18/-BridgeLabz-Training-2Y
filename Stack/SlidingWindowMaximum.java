import java.util.*;

class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove elements outside window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current index
            dq.offer(i);

            // Store result when window is valid
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}