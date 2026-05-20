class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force approach
        if(s.length()==0)return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                if(sb.indexOf(String.valueOf(s.charAt(j))) == -1)
                {
                    sb.append(s.charAt(j));
                    max=Math.max(sb.length(),max);
                }
                else
                {
                   
                    break;
                }
            }
        }
        return max;
    }
}