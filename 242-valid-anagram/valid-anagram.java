class Solution {
    public boolean isAnagram(String s, String t) {
        //store the frequency of s string in the hashmap
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();
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
        //now traverse in the t string
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