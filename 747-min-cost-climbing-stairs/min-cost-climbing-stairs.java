class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(dp,cost,n-1),helper(dp,cost,n-2));
    }
    public int helper(int []dp,int []cost,int i)
    {   
        if(i==0 || i==1)return cost[i];
        if(dp[i]!=-1)return dp[i];
        return dp[i]=cost[i]+Math.min(helper(dp,cost,i-1),helper(dp,cost,i-2));
    }
}