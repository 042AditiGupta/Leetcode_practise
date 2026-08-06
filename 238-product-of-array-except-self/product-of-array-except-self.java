class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int j=n-2;j>=0;j--)
        {
            suffix*=nums[j+1];
            prefix[j]*=suffix;
        }
        return prefix;
    }
}