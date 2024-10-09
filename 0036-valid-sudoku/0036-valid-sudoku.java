class Solution {
    public boolean isValid(char[][] board, int rs, int re, int cs, int ce){
        HashSet<Character> set = new HashSet<>(); 
        for(int row = rs; row <= re; row++){
            for(int col = cs; col <= ce; col++){
                char ch = board[row][col];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            HashSet<Character> set = new HashSet<>();
            for(int col = 0; col < 9; col++){
                char ch = board[row][col];
                if(ch == '.') continue;
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }

        for(int col = 0; col < 9; col++){
            HashSet<Character> set = new HashSet<>();
            for(int row = 0; row < 9; row++){
                char ch = board[row][col];
                if(ch == '.') continue;
                if(set.contains(ch)){ 
                    return false;
                }
                set.add(ch);
            }
        }

        for(int rs = 0; rs < 9; rs += 3){
            int re = rs + 2;
            for(int cs = 0; cs < 9; cs += 3){
                int ce = cs + 2;
                if(!isValid(board, rs, re, cs, ce)){
                    return false;
                }
            }
        }
        return true;
    }
}

