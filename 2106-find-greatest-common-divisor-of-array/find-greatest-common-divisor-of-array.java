class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        return hcf(max,min);
    }
    public int hcf(int a,int b)
    {
        if(b%a==0)return a;
        return hcf(b%a,a);
    }
}