class Solution {
    public int fib(int n) {
        int []dp=new int[n+1]; //dp of size of n+1
         return fibo(n,dp);
    }
    public int fibo(int n,int []dp)
    {
        if(n==0 || n==1)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    } 
}