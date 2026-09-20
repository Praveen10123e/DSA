class Solution {
    public long reqcap(int[] weights,long n){
        int len = weights.length;
        int sum =0;
        long count = 1;
        for(int  i =0 ;i<len;i++)
        {
            if(weights[i]+sum>n ){
                sum=0;
                count++;
            }
            sum+=weights[i];
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ans = 0;
        for(int i =0 ;i<n;i++)
        {
            if(max<weights[i]){
                max= weights[i];
            }
            sum+=weights[i];
        }

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low+(high-low)/2;
            long cap = reqcap(weights,mid);
            System.out.print(cap);
            if(cap<=days)
            {
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}