class Solution
{
    public int mySqrt(int x)
    {
        int lo=0,hi = x;
            int res=0; 
            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;
                if((long)mid*mid<=x)
                {
                    res=mid;
                    lo=mid + 1;
                } 
                else
                    hi = mid - 1;
            }
        return res; 
    }
}
