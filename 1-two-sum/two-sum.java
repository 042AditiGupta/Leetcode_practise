class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach
        // int []ans=new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int  j=i;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target && i!=j)
        //         {
        //             ans[0]=i;
        //             ans[1]=j;
        //         }
        //     }
        // }
        // return ans;

        HashMap<Integer,Integer>map=new HashMap<>();
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
           int rem=target-nums[i];
           if(map.containsKey(rem))
           {
                ans[0]=i;
                ans[1]=map.get(rem);
           }
           else
           {
            map.put(nums[i],i);
           }
        }
        return ans;
    }
}