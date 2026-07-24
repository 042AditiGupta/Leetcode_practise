class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
    public int minCost(int []cost,int index,int[]dp)
    {
        if(index==0 || index==1)return cost[index];
        if(dp[index]!=-1)return dp[index];
        return dp[index]=cost[index]+Math.min(minCost(cost,index-1,dp),minCost(cost,index-2,dp));
        
    }
}