public class Solution
{
    public static int thirdMax(int[] nums)
    {
        Arrays.sort(nums);
        int count=1;
        int current=nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] != current)
            {
                count++;
                current = nums[i];
            }
            if (count == 3) return current;
        }
        return nums[nums.length - 1];
    }
}


    
