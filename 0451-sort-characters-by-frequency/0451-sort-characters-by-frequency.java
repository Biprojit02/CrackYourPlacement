class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b)->(map.get(b) - map.get(a)));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            for(int i = 0; i<map.get(c); i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}