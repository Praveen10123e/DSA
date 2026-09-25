class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
 if (nums.length == 0) return 0;
        
        int l = 0; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[l]) { 
                l++;           
                nums[l] = nums[i];
            }
        }
        
        return l + 1; 
    }
}