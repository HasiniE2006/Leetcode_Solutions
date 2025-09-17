class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length;
       for(int i=0;i<j;i++)
       {
         if(nums[i]!=i)
          j=i;
       } 
       return j;
    }
}
