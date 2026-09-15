class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int left =0;
        int right=n-1;
        int maxarea=0;
        while(left<right)
        {
            int width = right-left;
            int h = Math.min(arr[left],arr[right]);
            int area = width *h;
            maxarea=Math.max(maxarea,area);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        
        return maxarea;
    }
}