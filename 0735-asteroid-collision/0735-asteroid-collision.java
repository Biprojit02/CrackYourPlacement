class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            while(!st.isEmpty() && a < 0 && st.peek() > 0){
                int sum = a + st.peek();

                if(sum < 0){
                    st.pop();
                }
                else if(sum > 0){
                    a = 0;
                }
                else{
                    st.pop();
                    a = 0;
                }
            }
            if(a != 0){
                st.push(a);
            }
        } 
        int ans[] = new int[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}