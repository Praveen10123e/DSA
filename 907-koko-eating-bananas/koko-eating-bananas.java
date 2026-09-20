class Solution {
    public long timereq(int[] piles,long n){
        long hour = 0;
        for(int pile:piles)
        {
            hour += Math.ceil((pile+n-1)/n);
        }
        return hour;
    }




    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int low = 1;
        int high = max;
        int ans = 0;
        
        while(low<=high)
        {
            
            int mid = low +(high - low)/2;
            long hour = timereq(piles,mid);
            if(hour<=h){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }
        return ans;
        
    }
}