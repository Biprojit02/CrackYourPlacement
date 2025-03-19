class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

       for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

            if(s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

            if(s.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
       }
       return stack.isEmpty();
    }
}