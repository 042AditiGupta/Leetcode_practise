class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[nonzero++]=nums[i];
            }
        }
        for(int i=nonzero;i<n;i++)
        {
            nums[i]=0;
        }
    }
}