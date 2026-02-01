class Solution {
    public int minimumCost(int[] nums) {
        int subarray=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                    subarray=nums[0]+nums[i]+nums[j];
                    min=Math.min(min,subarray);
            }
        }
        return min;
    }
}