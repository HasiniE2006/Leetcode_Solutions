  class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                rev.append(Character.toLowerCase(c));
            }
        }
        String filteredStr = rev.toString();
        String reversedStr = rev.reverse().toString();
        return filteredStr.equals(reversedStr);
    }
}
  
