class Solution 
{
    public int balancedStringSplit(String s)
    {
        char[] c=s.toCharArray();
        int count=0;
        int bal=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='L') bal++;
            else bal--;
            if(bal==0)
            count++;
        }
        return count;
    }
}
