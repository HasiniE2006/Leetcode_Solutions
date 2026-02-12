class Solution 
{
    public String toHex(int num) 
    {
        if(num==0)
            return "0";
        StringBuilder sb=new StringBuilder();
        while(num!=0)
        {
            int hex=num&15;  
            if(hex<10)
                sb.append(hex);
            else
                sb.append((char)('a'+hex-10));
            num >>>= 4;  
        }
        return sb.reverse().toString();
    }
}
