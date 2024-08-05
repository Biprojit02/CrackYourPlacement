class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int l = 0;
        int r = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(l < m && r<n){
            if(s[l] >= g[r]){
                r++;
            }
            l++;
        }
        return r;
    }
}