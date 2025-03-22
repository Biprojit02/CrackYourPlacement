class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        for(int[] edge : edges)
        {
            int x = edge[0], y = edge[1];
            graph[x].add(y);
            graph[y].add(x);
        }
        
        boolean[] vis = new boolean[n];
        int ans = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(!vis[i])
            {
                HashSet<Integer> set = new HashSet<>();
                int count = dfs(i, vis, graph, set);
                if(set.size() == 1 && set.contains(count - 1))
                    ans++;
            }
        }
        
        return ans;
    }
    
    public int dfs(int src, boolean[] vis, ArrayList<Integer>[] graph, HashSet<Integer> set)
    {
        vis[src] = true;
        set.add(graph[src].size());
        int ans = 1;
        for(int nbr : graph[src])
        {
            if(!vis[nbr])
            {
                ans+= dfs(nbr, vis, graph, set);
            }
        }
        return ans;
    }
}