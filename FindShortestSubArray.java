class Solution
{
    public int findShortestSubArray(int[] nums)
    {
        Map<Integer,Integer> freq=new HashMap<>();
        Map<Integer,Integer> first=new HashMap<>();
        Map<Integer,Integer> last=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            freq.put(num,freq.getOrDefault(num,0)+1);
            first.putIfAbsent(num, i);
            last.put(num,i);
        }
        int degree=0;
        for(int f:freq.values()) 
            degree=Math.max(degree,f);
        int ans=nums.length;
        for(int num:freq.keySet())
        {
            if(freq.get(num)==degree)
                ans=Math.min(ans,last.get(num)-first.get(num)+1);
        }
        return ans;
    }
}
