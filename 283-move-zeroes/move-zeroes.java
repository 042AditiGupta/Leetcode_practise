class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)nums[index++]=nums[i];
            else 
            {
                zeros++;
            }
        }
        for(int i=index;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}