class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        String res="";
        helper(ans,res,n,0,0);
        return ans;

    }
    public List<String> helper(List<String>ans,String res,int n,int open,int close)
    {
        if(res.length()==2*n)
        {
            ans.add(res);
        }
        if(open<n)helper(ans,res+"(",n,open+1,close);
        if(close<open)helper(ans,res+")",n,open,close+1);
        return ans;
        
    }
}