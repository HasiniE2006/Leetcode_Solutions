class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok = new boolean[26];
        // Mark allowed characters
        for (int i = 0; i < allowed.length(); i++) {
            ok[allowed.charAt(i) - 'a'] = true;
        }
        int count = 0;
        // Check each word
        for (String word : words) {
            boolean valid = true;
            for (int i = 0; i < word.length(); i++) {
                if (!ok[word.charAt(i) - 'a']) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                count++;
        }
        return count;
    }
}
