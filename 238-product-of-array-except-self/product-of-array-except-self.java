class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []prefixsum=new int[n];
        prefixsum[0]=1;
        for(int i=1;i<n;i++)
        {
            prefixsum[i]=nums[i-1]*prefixsum[i-1];
        }
        int []suffixsum=new int[n];
        suffixsum[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            suffixsum[i]=nums[i+1]*suffixsum[i+1];
        }
        for(int i=0;i<n;i++)
        {
            prefixsum[i]=prefixsum[i]*suffixsum[i];
        }
        return prefixsum;
    }
}