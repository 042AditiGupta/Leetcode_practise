class Solution {
    public int maxProfit(int[] prices) {
        //brute force approach
        // int n=prices.length;
        // int diff=0;
        // int max=0;
        // for(int i=0;i<n;i++)
        // {
        //     diff=0;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         diff=prices[j]-prices[i];
        //         max=Math.max(diff,max);
        //     }
        // }
        // return max;

        int n=prices.length;
        int maxdiff=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(prices[i],min);
            maxdiff=Math.max(maxdiff,prices[i]-min);
        }
        return maxdiff;
    }
}