class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<strs.length; i++){
            String word = strs[i];
            char[] c1 = word.toCharArray();
            Arrays.sort(c1);
            String newWord = new String(c1);
            if(!map.containsKey(newWord)){
                map.put(newWord, new ArrayList<>());
            }
            map.get(newWord).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}