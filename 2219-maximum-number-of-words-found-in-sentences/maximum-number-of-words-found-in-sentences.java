class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max_words=0;
        int max=0;
        for(int i=0;i<sentences.length;i++){
            max_words=0;
            String ele=sentences[i];
            for(int j=0;j<ele.length();j++){
                int ascii=(int)ele.charAt(j);
                if(ascii==32){
                    max_words++;
                }
            }
            max_words+=1;
            max=Math.max(max_words,max);
        }
        return max;
    }
}