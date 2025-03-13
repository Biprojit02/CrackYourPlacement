class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int w1 = 0;
        int w2 = 0;
        while(w1 < word1.length() && w2 < word2.length()){
            str.append(word1.charAt(w1));
            str.append(word2.charAt(w2));
            w1++;
            w2++;
        }

        while(w1 < word1.length()){
            str.append(word1.charAt(w1));
            w1++;
        }

        while(w2 < word2.length()){
            str.append(word2.charAt(w2));
            w2++;

        }
        return str.toString();
    }
}