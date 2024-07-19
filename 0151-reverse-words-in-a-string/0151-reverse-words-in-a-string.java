class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        Stack<String> bucket = new Stack<>();

        for(String word : str){
            bucket.push(word);
        }

        StringBuilder reverse = new StringBuilder();
        while(!bucket.isEmpty()){
            reverse.append(bucket.pop());
            if(!bucket.isEmpty()){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}

/*
import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        // Remove leading and trailing spaces, and split the string into words
        String[] words = s.trim().split("\\s+");

        // Create a stack to store the words in reverse order
        Stack<String> stack = new Stack<>();

        // Push each word onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop words from the stack to build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }
}
*/