class Solution {
    public int[] sortedSquares(int[] nums) {
        //optimized approach
        int n=nums.length;
        int left=0;
        int right=n-1;
        int index=n-1;
        int []ans=new int[n];
        while(left<=right)
        {
            if(Math.abs(nums[right])>Math.abs(nums[left]))
            {
                ans[index--]=nums[right]*nums[right];
                right--;
            }
            else if(Math.abs(nums[left])==Math.abs(nums[right]))
            {
                ans[index--]=nums[left]*nums[left];
                left++;
            }
            else
            {
                ans[index--]=nums[left]*nums[left];
                left++;
            }
        }
        return ans;
    }
}