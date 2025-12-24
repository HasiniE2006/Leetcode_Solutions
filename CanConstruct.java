class Solution
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        for(char c:ransomNote.toCharArray())
        {
            if(!magazine.contains(c + ""))
                return false;
            magazine=magazine.replaceFirst(c+"","");
        }
        return true;
    }
}
