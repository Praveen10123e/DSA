class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length * 2 ;i++){
            int index = i%nums.length;
            while(!st.isEmpty()&&nums[st.peek()]<nums[index]){
                ans[st.pop()] = nums[index];
            }
            if(i<nums.length){
                st.push(index);
            }
        }
        
        return ans;
    }
}