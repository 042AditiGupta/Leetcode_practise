class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int rem=0;
        String str="";
        String ne="";
        while(n!=0)
        {
            rem=n%2;
            str=rem+str;
            n=n/2;
        }
        //System.out.println(str);
        String complement= decimal(str,"");
        int ans=0;
        int power=0;
       for(int i=complement.length()-1;i>=0;i--)
       {
            
            ans+=(complement.charAt(i)-'0')*Math.pow(2,power);
            power++;
       }
        return ans;
    }
    public String decimal(String str,String ne)
    {
        
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)=='1')
            {
                ne+=0;
            }
            else
            {
                ne=ne+1;
            }
            i++;
        }
       return ne;
    }
}