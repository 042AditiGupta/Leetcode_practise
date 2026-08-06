class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
               int freq=map.get(nums[i])+1;
                map.put(nums[i],freq);
                if(freq==2)ans.add(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        return ans;
    }
}