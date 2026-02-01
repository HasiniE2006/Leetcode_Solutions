class Solution
{
    public int dominantIndex(int[] nums)
    {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int n=arr.length;
        if(arr[n-1]<2*arr[n-2])
            return -1;
        int max=arr[n-1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
                return i;
        }
        return -1;
    }
}

    
       
