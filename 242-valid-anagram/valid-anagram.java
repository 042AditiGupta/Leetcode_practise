class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                int freq=map.get(t.charAt(i));
                map.put(t.charAt(i),freq-1);
            }
            else
            {
                map.put(t.charAt(i),1);
            }
        }
        for(int ele:map.values())
        {
            if(ele!=0)return false;
        }
        return true;
    }
}