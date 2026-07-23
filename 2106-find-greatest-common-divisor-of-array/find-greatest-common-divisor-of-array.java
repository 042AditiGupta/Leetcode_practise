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
        for(int i=min;i>=1;i--)
        {
            if(max%i==0 && min%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}