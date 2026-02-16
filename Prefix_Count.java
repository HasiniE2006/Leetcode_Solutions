class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int j=0;
        for(String k:words)
        {
            if(k.length()>=pref.length() && k.substring(0,pref.length()).equals(pref))
            {
                j++;
            }
        }
        return j;
    }
}
