class Solution {
    public boolean backspaceCompare(String s, String t) {
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        int p = checkString(c1);  
        int q = checkString(c2);

        if(p != q) return false;

        for(int i = 0; i<p; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }  
        return true;
    }

    public int checkString(char[] chars){
        int k = 0;
        for(int i = 0; i<chars.length; i++){
            if(chars[i] != '#'){
                chars[k] = chars[i];
                k++;
            }
            else if(k > 0){
                k--;
            }
        }
        return k;
    }
}