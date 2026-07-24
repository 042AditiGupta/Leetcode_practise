class Solution {
    public void  helper(int[] nums, List<List<Integer>> res, int i,List<Integer> ans)
    {
        
        if (i == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }
        helper(nums, res, i + 1,ans);
        ans.add(nums[i]);
        helper(nums, res, i + 1,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(nums, res, 0,ans);
        return res;
    }

    
}