class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int[] dq = new int[n]; // acts like deque
        int front = 0;
        int back = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside window
            if (front < back && dq[front] <= i - k) {
                front++;
            }

            // Remove smaller elements from back
            while (front < back && nums[dq[back - 1]] <= nums[i]) {
                back--;
            }

            // Add current index
            dq[back++] = i;

            // Window formed
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq[front]];
            }
        }

        return ans;
    }
}