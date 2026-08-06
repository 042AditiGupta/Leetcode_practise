class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //using freq aray
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        int []freq=new int[n+1];
        for(int  ele:nums)
        {
            freq[ele]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==2)ans.add(i);
        }
        return ans;
    }
}