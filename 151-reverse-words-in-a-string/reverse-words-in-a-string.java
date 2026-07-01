class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        int j=str.length-1;
        int i=0;
        if(s.length()==1)return s;
        while(i<j)
        {
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String ans="";
        for(int k=0;k<str.length;k++)
        {
            ans+=str[k];
            if(k!=str.length-1)ans+=" ";
        }
        return ans;
    }
}