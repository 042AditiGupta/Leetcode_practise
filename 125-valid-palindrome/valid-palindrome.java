class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
         s=s.toLowerCase();
         if(s.length()<=1)return true;
        for(int i=0;i<s.length();i++)
        {
            int ascii=(int)s.charAt(i);
            if(ascii>=97 && ascii<122 || Character.isLetterOrDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        int i=0,j=sb.length()-1;
        while(i<=j)
        {
            if(sb.charAt(i)!=sb.charAt(j))return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}