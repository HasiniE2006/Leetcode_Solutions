class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        // Count characters in chars
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }
        int ans = 0;
        for (String word : words) {
            int[] temp = new int[26];
            boolean ok = true;
            // Count characters of current word
            for (char c : word.toCharArray()) {
                temp[c - 'a']++;
                if (temp[c - 'a'] > count[c - 'a']) {
                    ok = false;
                    break;
                }
            }
            if (ok)
                ans += word.length();
        }
        return ans;
    }
}
