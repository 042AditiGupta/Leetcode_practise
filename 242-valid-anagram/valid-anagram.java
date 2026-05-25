class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        //storing the occurence of all the characters in string
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        //traversing in t string
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
               map.put(t.charAt(i),map.get(t.charAt(i))-1);

            }
        }
        boolean flag=true;
        for(int val:map.values())
        {
            if(val!=0)return false;

        }
        return flag;
    }
}