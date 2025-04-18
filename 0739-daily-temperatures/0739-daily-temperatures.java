class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()]){
                int index = st.pop();
                ans[index] = i - index;
            }
            st.push(i);
        }
        return ans;
    }
}