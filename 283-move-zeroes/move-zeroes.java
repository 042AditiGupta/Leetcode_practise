class Solution {
    public void moveZeroes(int[] nums) {
        // int nonzero=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         nums[nonzero++]=nums[i];
        //     }
        // }
        // for(int i=nonzero;i<nums.length;i++)
        // {
            
        //     nums[nonzero++]=0;
        // }
       int zero=0;
       for(int i=0;i<nums.length;i++)
       {
         if(nums[i]!=0)
         {
            int temp=nums[zero];
            nums[zero]=nums[i];
            nums[i]=temp;
            zero++;
         }
       }
    }
}