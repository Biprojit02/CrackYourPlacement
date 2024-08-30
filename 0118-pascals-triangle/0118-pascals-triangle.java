class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<= numRows; i++){
            ans.add(pascalTri(i));
        }

        return ans;
    }
    public List<Integer> pascalTri(int row){
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i<row; i++){
            ans = ans * (row - i);
            ans = ans/i;
            list.add(ans);
        }
        return list;
    }
}