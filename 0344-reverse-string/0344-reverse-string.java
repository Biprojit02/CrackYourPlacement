class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        helper(start, end, s);
    }

    public void helper(int start, int end, char[] s){
        if(start > end) return;
        swap(start, end, s);
        helper(start+1, end-1, s);
    }

    public void swap(int start, int end, char[] s){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}

/*
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
*/