class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left =0;
        int right =0;
        int countzeros =0;
        int finalMax =0;

        for(right = left;right<n;right++)
        {
           if(nums[right]==0){
            countzeros++;
           }

           while(countzeros>1){
            if(nums[left]==0){
                countzeros--;
            }
            left++;
           }
           finalMax = Math.max(finalMax,right-left);
        }
        return finalMax;
    }
}