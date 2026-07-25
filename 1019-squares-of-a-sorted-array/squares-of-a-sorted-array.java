class Solution {
    public int[] sortedSquares(int[] nums) {
        int index=0;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[index]=(int)Math.pow(nums[i],2);
            index++;
        }
        Arrays.sort(ans);
        return ans;
    }
}