class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String reversedString = "";
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedString += reversedWord + " ";
        }
        return reversedString.trim();
    }
} 
    
