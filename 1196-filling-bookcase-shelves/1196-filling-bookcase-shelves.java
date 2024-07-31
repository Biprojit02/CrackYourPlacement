class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            int w = books[i - 1][0];
            int h = books[i - 1][1];
            arr[i] = arr[i - 1] + h;
            for (int j = i - 1; j > 0; --j) {
                w += books[j - 1][0];
                if (w > shelfWidth) {
                    break;
                }
                h = Math.max(h, books[j - 1][1]);
                arr[i] = Math.min(arr[i], arr[j - 1] + h);
            }
        }
        return arr[n];
    }
}