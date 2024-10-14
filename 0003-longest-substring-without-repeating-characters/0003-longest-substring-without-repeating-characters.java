class Solution {
    public int lengthOfLongestSubstring(String s) {
        //create a HashSet
        HashSet<Character> set = new HashSet<>();
        //Store the max length
        int maxLength = 0;

        int i = 0;
        //Ittrate over the string
        for(int j = 0; j<s.length(); j++){
            //check the letter is exists in the set or not 
            while(set.contains(s.charAt(j))){
                //if present than remove
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}

