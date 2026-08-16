class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)zeros++;
            else if(nums[i]==1)ones++;
            else twos++;
        }
        int index=0;
        for(int i=0;i<zeros;i++)
        {
            nums[index++]=0;
        }
        for(int i=zeros;i<ones+zeros;i++)
        {
            nums[index++]=1;
        }
        for(int i=ones+zeros;i<nums.length;i++)
        {
            nums[index++]=2;
        }
    }
}