class Solution {
    public void reverseString(char[] s)
    {
    int l=0;
    int h=s.length-1;
    char temp;
    while(l<h)
    {
        temp=s[l];
        s[l]=s[h];
        s[h]=temp;
        l++;
        h--;
    }
    }
}
