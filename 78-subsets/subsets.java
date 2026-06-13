class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        helper(nums,ans,0,result);
        return result;
    }
    public void helper(int[] nums,List<Integer>ans,int i,List<List<Integer>>result)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        helper(nums,ans,i+1,result);
        ans.add(nums[i]);
        helper(nums,ans,i+1,result);
        ans.remove(ans.size()-1);
    }
}