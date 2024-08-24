class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        int answer = low;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(count(matrix, mid) < k){
                low = mid + 1;
            }
            else{
                answer = mid;
                high = mid - 1;
            }
        }
        return answer;
    }

    private static int count(int[][] matrix, int num){
        int count = 0;
        int n = matrix.length;
        int i = 0;
        int j = n - 1;

        while(j > -1 && i < n){
            if(matrix[i][j] > num){
                j--;
            }
            else{
                count += (j+1);
                i++;
            }
        }
        return count;
    }
}

/*
// Approach one
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                pq.add(matrix[i][j]);

                if(pq.size() > k){
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}
 */