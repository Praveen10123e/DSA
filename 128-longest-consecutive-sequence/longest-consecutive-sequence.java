class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        int curr = 0;
        int count = 0;
        int max=0;
        for(int i =0;i<n;i++){
            map.add(nums[i]);
        }
        for(int num : map)
        {
            if(!map.contains(num-1)){
                curr = num;
                count = 1;
            }
            while(map.contains(curr+1)){
                count++;
                curr++;
            }
            max = Math.max(max,count);
        }
        return max;

        }
    }
