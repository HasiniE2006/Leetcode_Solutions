class Solution
{
    public List<Integer> findDuplicates(int[] nums)
    {
        Arrays.sort(nums);
        int x=nums.length-1;
        List<Integer> n=new ArrayList<Integer>();
        for(int i=0;i<x;i++)
        {
            if(nums[i]==nums[i+1])
            n.add(nums[i]);
        }
        return n;
    }
}
