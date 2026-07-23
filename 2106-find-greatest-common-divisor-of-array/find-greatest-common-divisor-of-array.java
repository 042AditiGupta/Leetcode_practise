class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        //first, finding min and max value
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        return gcd(max,min);
    }
    public int gcd(int max,int min)
    {
        if(max%min==0)return min;
        return gcd(min,max%min);
    }
}