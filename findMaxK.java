class Solution
{
    public int findMaxK(int[] nums)
    {
        Set<Integer> set=new HashSet<>();
        int max=-1;
        for(int n:nums)
            set.add(n);
        for(int n:nums)
        {
            if(n>0 && set.contains(-n))
                max=Math.max(max, n);
        }
        return max;
    }
}
