class Solution {
    public String multiply(String num1, String num2) {
        final int m = num1.length();
        final int n = num2.length();
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
        int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = product + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (final int p : pos) {
            if (p > 0 || sb.length() > 0) {
                sb.append(p);
            }
        }
        return sb.toString();
    }
}
