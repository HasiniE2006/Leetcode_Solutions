class Solution
{
    public int addDigits(int num)
    {
        int dig=0;
        int val=0;
        while(num>0)
        {
            dig=num%10;
            val=dig+val;
            num/=10;
        }
            if(val>9)
              return addDigits(val);
        return val;
    }
}
