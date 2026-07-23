class Solution {
    public int uniquePaths(int m, int n) { 
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return unique(m,n,1,1,dp);
    }
    public int unique(int m,int n,int row,int column,int[][]dp)
    {
        if(row==m || column==n)return 1;
        if(dp[row][column]!=-1)return dp[row][column];
        return dp[row][column]=unique(m,n,row+1,column,dp)+unique(m,n,row,column+1,dp);
    }
}