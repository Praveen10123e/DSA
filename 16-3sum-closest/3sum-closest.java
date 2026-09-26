class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Initialize with the first valid triplet sum
        int closestSum = nums[0] + nums[1] + nums[2];

        // Stop at n - 2 to leave room for left and right pointers
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                // Use assignment (=) instead of accumulation (+=)
                int currentSum = nums[i] + nums[l] + nums[r];
                
                // If we hit target perfectly, return it immediately
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Track if this currentSum is closer than our absolute best so far
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move pointers intelligently based on comparison to target
                if (currentSum < target) {
                    l++; // Sum is too small, make it bigger
                } else {
                    r--; // Sum is too big, make it smaller
                }
            }
        }
        return closestSum;       
      
    }
}