class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int maxCount = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else if(c == ')'){
                if(!st.isEmpty()){
                    st.pop();
                    count--;
                }
            }
        }
        return maxCount;
    }
}