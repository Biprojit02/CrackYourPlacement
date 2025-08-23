class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c1 = s.toCharArray();
            Arrays.sort(c1);
            String newWord = new String(c1);
            if(!map.containsKey(newWord)){
                map.put(newWord, new ArrayList<>());
            }
            map.get(newWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}