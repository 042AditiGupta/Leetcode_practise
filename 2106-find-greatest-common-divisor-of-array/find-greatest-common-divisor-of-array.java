class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        // for(int i=min;i>=1;i--)
        // {
        //     if(min % i==0 && max % i==0)
        //     {
        //         return i;
        //     }
        // }
        // return 1;
        return gcd(min,max);
    }
    public int gcd(int a,int b)
    {
        if(b % a==0)return a;
        return gcd(b%a,a);
    }
}