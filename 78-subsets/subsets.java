class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
         helper(nums,0,res,ans);
         return res;
    }
    public void helper(int []nums,int i,List<List<Integer>>res, List<Integer>ans)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        helper(nums,i+1,res,ans);
        ans.add(nums[i]);
        helper(nums,i+1,res,ans);
        ans.remove(ans.size()-1);
    }
}