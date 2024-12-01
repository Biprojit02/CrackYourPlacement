class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Initialize indices for both strings
        int indexFirst = 0;
        int indexSecond = 0;
        // Use StringBuilder to efficiently build the merged string
        StringBuilder mergedString = new StringBuilder();
        
        // Alternate adding characters from both strings
        while (indexFirst < word1.length() && indexSecond < word2.length()) {
            mergedString.append(word1.charAt(indexFirst)); // Append character from word1
            mergedString.append(word2.charAt(indexSecond)); // Append character from word2
            indexFirst++; // Move to the next character in word1
            indexSecond++; // Move to the next character in word2
        } 
        
        // Append remaining characters from word1, if any
        while (indexFirst < word1.length()) {
            mergedString.append(word1.charAt(indexFirst));
            indexFirst++; // Move to the next character in word1
        }
        
        // Append remaining characters from word2, if any
        while (indexSecond < word2.length()) {
            mergedString.append(word2.charAt(indexSecond));
            indexSecond++; // Move to the next character in word2
        }
        
        // Return the final merged string
        return mergedString.toString();
    }
}
