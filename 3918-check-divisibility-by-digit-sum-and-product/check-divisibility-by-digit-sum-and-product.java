class Solution {
    public boolean checkDivisibility(int n) {
        //sum 
        int original=n;
        int sum=0;
        int product=1;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            product*=r;
            n=n/10;
        }
        if(original %(sum+product)==0)return true;
        return false;
    }
}