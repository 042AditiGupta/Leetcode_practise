class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            xor1^=nums[i];
        }
        for(int i=1;i<n+1;i++)
        {
            xor2^=i;
        }
        return xor2^xor1;
    }
}