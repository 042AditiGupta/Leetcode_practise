class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer>map=new  LinkedHashMap<>();
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
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch)==1)
            {
                return i;
            }
           
        }
        return -1;
    }
}