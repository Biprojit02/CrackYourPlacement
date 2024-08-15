class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int m = s.length();
        int n = t.length();

        int i = 0; 
        int j = 0;

        if(m < 1){
            return true;
        }
        while(i < n){
            if(c1[j] == c2[i]){
                j++;
            }
            i++;

            if(j == m){
                return true;
            }
        }
        return false;
    }
}