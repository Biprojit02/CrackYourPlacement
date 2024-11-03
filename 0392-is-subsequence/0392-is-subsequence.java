class Solution {
    public boolean isSubsequence(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();
        int indexS = 0;
        int indexT = 0;
        while(indexS < lengthS && indexT < lengthT){
            if(s.charAt(indexS) == t.charAt(indexT)){
                indexS++;
            }
            indexT++;
        }
        return indexS == lengthS;
    }
}