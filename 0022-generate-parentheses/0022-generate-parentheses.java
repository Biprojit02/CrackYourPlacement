class Solution {
    public boolean isValid(String str){
        int sum = 0;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                sum++;
            }
            else{
                sum--;
            }
            if(sum < 0){
                return false;
            }
        }
        return sum == 0;
    }

    public void generateParanthesis(String curr, int n,  int length, List<String> result){
        if(length == 2 * n){
            if(isValid(curr)){
                result.add(curr);
            }
        return; 
        }

        curr += '(';
        generateParanthesis(curr, n, length + 1, result);
        curr = curr.substring(0, curr.length() - 1);

        curr += ')';
        generateParanthesis(curr, n, length + 1, result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParanthesis("", n, 0, result);
        return result;
    }
}
