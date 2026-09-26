class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        for(int fst=2;fst<nums.length;fst++){
            if(nums[fst]!=nums[slow-2]){
                nums[slow]=nums[fst];
                slow++;
            }
        }
        return slow;
        
    }
}