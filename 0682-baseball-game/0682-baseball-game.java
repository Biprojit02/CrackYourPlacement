class Solution {  
    public int calPoints(String[] operations) {  
        Stack<Integer> stack = new Stack<>();  

        for (String op : operations) {  
            if (op.equals("C")) {  
                if (!stack.isEmpty()) {  
                    stack.pop();  
                }  
            } else if (op.equals("D")) {  
                if (!stack.isEmpty()) {  
                    int num = stack.peek() * 2;  
                    stack.push(num);  
                }  
            } else if (op.equals("+")) {  
                if (stack.size() >= 2) {  
                    int last = stack.pop();  
                    int secondLast = stack.pop();  
                    int newScore = last + secondLast;  

                    stack.push(secondLast); // Push second last back  
                    stack.push(last); // Push last back  
                    stack.push(newScore); // Push the sum  
                }  
            } else {  
                stack.push(Integer.parseInt(op));  
            }  
        }  

        // Calculate the total score  
        int sum = 0;  
        for (int score : stack) {  
            sum += score;  
        }  

        return sum;  
    }  
}  