class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
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
        for(int ele:map.keySet())
        {
            if(map.get(ele)>n/3)
            {
                ans.add(ele);
            }
        }
        return ans;
    }
}