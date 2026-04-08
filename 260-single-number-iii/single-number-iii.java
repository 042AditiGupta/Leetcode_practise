class Solution {
    public int[] singleNumber(int[] nums) {
        //brute force
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
          
            if(map.containsKey(nums[i]))
            {
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int i=0;
        for(int ele:map.keySet())
        {
            if(map.get(ele)==1)
            {
                ans[i++]=ele;
            }
        }
        return ans;
    }
}