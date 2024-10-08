class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
                result = Math.max(result, count);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return result;
    }
}