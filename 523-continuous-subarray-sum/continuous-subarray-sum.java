class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //prefix sum
        if(nums.length==1)return false;
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
             
             int rem=nums[i]%k;
            if(!map.containsKey(rem))
            {
                map.put(rem,i);
            }
            else
            {
               if(i-map.get(rem)>=2)return true;
            }
        }
        return false;
    }
}