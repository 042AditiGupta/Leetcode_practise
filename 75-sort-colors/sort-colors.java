class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeros=0;
        int ones=0;
        int twos=0;
        int index=0;
        if(n==1)return ;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)zeros++;
            else if(nums[i]==1)ones++;
            else twos++;
        }
        for(int i=0;i<zeros;i++)
        {
            nums[index++]=0;
        }
        for(int j=zeros;j<zeros+ones;j++)
        {
            nums[index++]=1;
        }
        for(int j=zeros+ones;j<n;j++)
        {
            nums[index++]=2;
        }
    }
}