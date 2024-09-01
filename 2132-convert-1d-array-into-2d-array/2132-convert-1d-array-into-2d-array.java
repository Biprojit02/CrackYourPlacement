class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int l = original.length;
        int[][] matrix = new int[m][n];
        if(l != m*n) return new int[0][0];

        for(int i = 0; i<original.length; i++){
            int nr = i/n;
            int nc = i%n;
            matrix[nr][nc] = original[i];
        }
        return matrix;
    }
}
