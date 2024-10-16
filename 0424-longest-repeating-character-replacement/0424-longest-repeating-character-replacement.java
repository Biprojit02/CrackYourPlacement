class Solution {
    public int characterReplacement(String s, int k) {
       int l = 0, r = 0, maxFrequency = 0, maxLength = 0;
       int arr[] = new int[26];
       for(r = 0; r<s.length(); r++){
            arr[s.charAt(r) - 'A']++;
            maxFrequency = Math.max(maxFrequency, arr[s.charAt(r) - 'A']);
            
            if((r - l + 1) - maxFrequency> k){
                arr[s.charAt(l) - 'A']--;
                l = l + 1;
            }
            maxLength = Math.max(maxLength, r - l + 1);
       } 
       return maxLength;
    }
}