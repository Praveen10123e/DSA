class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map =new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int e : nums2){
            while(!st.isEmpty() && st.peek() < e){
                map.put(st.pop(),e);
            }
            st.push(e);   
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        for(int i=0 ;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}