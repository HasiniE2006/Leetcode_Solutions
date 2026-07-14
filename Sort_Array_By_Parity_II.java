class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0,odd=1,n=nums.length;
        while(even<n && odd<n)
        {
            if(nums[even]% 2 == 1 && nums[odd]%2 == 0) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
            if(nums[even] % 2 == 0) even += 2;
            if(nums[odd] % 2 == 1) odd += 2;
        }
        return nums;
    }
}
