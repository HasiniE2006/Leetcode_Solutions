class Solution {
    public boolean isPalindrome(int x) {
       int temp=x;
       int a=0,digit=0;
       while(x!=0 && x>0)
       {
        a=temp%10;
        digit= digit*10+digit;
        temp=temp/10;
       }
       return x==digit;
    
    }
}
