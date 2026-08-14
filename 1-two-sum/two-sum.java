class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int []res=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            if(map.containsKey(rem))
            {
                res[0]=i;
                res[1]=map.get(rem);            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return res;
    }    
}