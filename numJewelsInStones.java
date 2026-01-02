class Solution{
    public int numJewelsInStones(String jewels, String stones)
    {
        int count=0;
        char[] c=stones.toCharArray();
        for (int j = 0; j < jewels.length(); j++) {
        char s=jewels.charAt(j);
        for(int i=0;i<stones.length();i++)
        {
            s=jewels.charAt(j);
            if(s==c[i])
            count++;
        }
        }
        return count;
    }
}
