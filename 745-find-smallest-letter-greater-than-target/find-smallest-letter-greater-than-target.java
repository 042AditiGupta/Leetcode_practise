class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ascii=(int)target;
        for(int i=0;i<letters.length;i++)
        {
            int letters_ascii=(int)letters[i];
            if(letters_ascii>ascii)
            {
                char res=(char)letters_ascii;
                return res;
            }
        }
        return letters[0];
    }
}