class Solution {
    public boolean backspaceCompare(String s, String t) {
        return usingStack(s).equals(usingStack(t));
    }

    public String usingStack(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                stack.push(str.charAt(i));
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return stack.toString();
    }
}