class Solution {
    public int singleNumber(int[] nums) {
       int xor = 0,a=0;
        for (int num : nums)
        {
            xor ^= num;
        }
        int diffBit = xor & -xor;
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a^= num; 
            } else {
                a ^= num; 
            }
        }

        return a;
    }
}
