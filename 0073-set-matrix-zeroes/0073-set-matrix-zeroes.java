class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstCol = false;
        boolean firstRow = false;

        for(int col = 0; col<matrix.length; col++){
            for(int row = 0; row<matrix[0].length; row++){
                if(matrix[col][row] == 0){
                    if(col == 0) firstRow = true;
                    if(row == 0) firstCol = true;

                    matrix[0][row] = 0;
                    matrix[col][0] = 0;
                }
            }
        }

        for(int col = 1; col<matrix.length; col++){
            for(int row = 1; row<matrix[0].length; row++){
                if(matrix[0][row] == 0 || matrix[col][0] == 0){
                    matrix[col][row] = 0;
                    
                }
            }
        }

        if(firstCol){
            for(int col = 0; col<matrix.length; col++){
                matrix[col][0] = 0;
            }
        }
        if(firstRow){
            for(int row = 0; row<matrix[0].length; row++){
                matrix[0][row] = 0;
            } 
        }
    }
}
