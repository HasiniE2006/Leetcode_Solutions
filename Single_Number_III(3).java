class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        int[] result = new int[2];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
