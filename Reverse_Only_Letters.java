class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        String res = "";
        for(int i=s.length()-1;i>=0;i--)
            if(Character.isLetter(s.charAt(i)))
                res+=s.charAt(i);
        String ans="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
                ans+=res.charAt(k++);
            else
                ans+=s.charAt(i);
        }
        return ans;
    }
}
