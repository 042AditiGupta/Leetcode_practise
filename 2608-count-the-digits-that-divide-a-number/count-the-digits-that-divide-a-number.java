class Solution {
    public int countDigits(int num) {
        int count=0;
        int s=num;
        while(num!=0)
        {
            int r=num%10;
            if(s%r==0)count++;
            num=num/10;
        }
        return count;
    }
}