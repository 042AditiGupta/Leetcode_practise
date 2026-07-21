class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [][]numsIndex=new int[n][2];
        for(int i=0;i<n;i++)
        {
            numsIndex[i][0]=nums[i];
            numsIndex[i][1]=i;
        }
        //sort the 2d array based on values
        Arrays.sort(numsIndex,(a,b)->Integer.compare(a[0],b[0]));

        //two pointer approach
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int sum=numsIndex[left][0]+numsIndex[right][0];
            if(sum==target)
            {
                return new int[]{numsIndex[left][1],numsIndex[right][1]};
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return new int[]{-1,-1};
    }
}