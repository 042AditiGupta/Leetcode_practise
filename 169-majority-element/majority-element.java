class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int freq=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>n/2)return key;
        }
        return -1;
    }
}