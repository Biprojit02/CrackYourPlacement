class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<n; j++){
                sb.append(grid[i][j]);
                sb.append(":");
            }
            String str = sb.toString();
            map1.put(str, map1.getOrDefault(str, 0)+1);
        }

        for(int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<n; j++){
                sb.append(grid[j][i]);
                sb.append(":");
            }
            String str = sb.toString();
            map2.put(str, map2.getOrDefault(str, 0)+1);
        }

        int ans = 0;
        for(String st : map1.keySet()){
            if(map2.containsKey(st)){
                ans += map1.get(st) * map2.get(st);
            }            
        }
        return ans;
    }
}
