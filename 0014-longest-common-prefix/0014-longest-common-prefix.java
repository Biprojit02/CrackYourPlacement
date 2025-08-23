class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i = 0; i<first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}