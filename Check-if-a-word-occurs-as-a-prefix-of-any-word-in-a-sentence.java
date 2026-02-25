class Solution 
{
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        String[] s=sentence.split("\\s+");
        int count=0;
        for(int i=0;i<s.length;i++)
        {
           if (s[i].length()>=searchWord.length())
            {
                String x=s[i].substring(0,searchWord.length());
                if(searchWord.equals(x))
                    return i+1;   
            }
        }
        return -1;
    }
}
