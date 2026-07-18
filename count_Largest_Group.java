class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count numbers with same digit sum
        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int max = 0;

        // Find largest group size
        for (int value : map.values()) {
            if (value > max)
                max = value;
        }

        int count = 0;

        // Count groups having largest size
        for (int value : map.values()) {
            if (value == max)
                count++;
        }
        return count;
    }
}
