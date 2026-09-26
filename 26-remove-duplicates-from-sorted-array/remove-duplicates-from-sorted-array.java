class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        if(nums.length == 0) return 0;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[l]!=nums[i])
            {
                l++;
                nums[l] = nums[i];
            }
            
        }
        return l+1;
    }
}