class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(')');
            }
            else if(ch=='{')
            {
                st.push('}');
            }
            else if(ch=='[')
            {
                st.push(']');
            }
            else if( st.isEmpty() || st.pop()!=ch )
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}