class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        length = len(grid)
        map1 = { }
        map2 = { }

        for i in range(length):
            s = []
            for j in range(length):
                s.append(str(grid[i][j]))
                s.append(":")
            str_row = "".join(s)
            map1[str_row] = map1.get(str_row, 0) + 1

        for i in range(length):
            s = []
            for j in range(length):
                s.append(str(grid[j][i]))
                s.append(":")
            str_col = "".join(s)
            map2[str_col] = map2.get(str_col, 0)+1
        
        ans = 0
        for s in map1.keys():
            if s in map2:
                ans += map1[s] * map2[s]

        return ans
        


