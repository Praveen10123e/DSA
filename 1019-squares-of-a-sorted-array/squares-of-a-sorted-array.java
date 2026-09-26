class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int l = 0;
        int r = n-1;
        int idx = n-1;
        
        while(l<=r){
            int ls = nums[l]*nums[l];
            int rs = nums[r]*nums[r];
            if(ls>rs){
                ans[idx]=ls;
                l++;
            }
            else{
                ans[idx]=rs;
                r--;
            }
            idx--;
        }
        return ans;
    }
}