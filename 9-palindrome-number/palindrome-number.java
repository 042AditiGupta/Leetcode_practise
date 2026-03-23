class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int sum=0;
        while(x>0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum==original)return true;
        return false;
    }
}