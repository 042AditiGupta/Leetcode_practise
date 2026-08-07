class Solution {
    public boolean isValid(String s) {
        char []ch =s.toCharArray();
        Stack<Character>st=new Stack<>();
        if(s.length()==1)return false;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='[' || ch[i]=='(' || ch[i]=='{')
            {
                st.push(ch[i]);
            }
            else 
            {
                if(st.isEmpty())return false;
                if(ch[i]==']' && st.peek()== '[')st.pop();
                else if(ch[i]=='}' && st.peek()== '{')st.pop();
                else if(ch[i]==')' && st.peek()== '(')st.pop();
                else return false;
            }    
        }
        return st.isEmpty();
    }
}