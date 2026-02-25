class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int ans=0;
        int sum=0;
        int low=1;
        int high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}