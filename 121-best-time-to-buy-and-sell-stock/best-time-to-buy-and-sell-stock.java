class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxdiff=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(prices[i],min);
            maxdiff=Math.max(maxdiff,prices[i]-min);
        }
        return maxdiff;
    }
}