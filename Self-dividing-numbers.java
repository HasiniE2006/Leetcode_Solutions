class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int n=i;
            while(n>0 && n%10!=0 && i%(n%10)==0)
                n/=10;
            if(n==0)
                res.add(i);
        }
        return res;
    }
}
