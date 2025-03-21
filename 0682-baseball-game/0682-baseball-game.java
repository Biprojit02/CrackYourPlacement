class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(op.equals("D")){
                if(!stack.isEmpty()){
                    int num = stack.peek() * 2;
                    stack.push(num);
                }
            }
            else if(op.equals("+")){
                if(stack.size() >= 2){
                    int last = stack.pop();
                    int secondLast = stack.pop();
                    int res = last + secondLast;
                    stack.push(secondLast);
                    stack.push(last);
                    stack.push(res);
                }
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int st : stack){
            sum += st;
        }
        return sum;
    }
}