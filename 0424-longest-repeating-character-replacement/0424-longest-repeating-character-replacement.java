class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        int[] arr = new int[26];
        for(r = 0; r<s.length(); r++){
            arr[s.charAt(r) - 'A']++;
            maxFrequency = Math.max(maxFrequency, arr[s.charAt(r) - 'A']);

            if((r - l + 1) - maxFrequency > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}