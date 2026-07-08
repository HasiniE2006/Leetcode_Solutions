class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()) {
            int val = c - 'a' + 1;
            sb.append(val);
        }
        String numStr = sb.toString();
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = 0;
            for (char digit : numStr.toCharArray()) {
                result += digit - '0'; 
            }
            numStr = String.valueOf(result); 
        }
        return result;
    }
}
