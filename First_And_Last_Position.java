import java.util.*;
class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        Vector<Integer> vec=new Vector<>();
        vec.add(-1);  
        vec.add(-1);  
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(vec.get(0)==-1)
                vec.set(0, i); 
                vec.set(1, i);                      
            }
        }
        int[] result=new int[2];
        result[0]=vec.get(0);
        result[1]=vec.get(1);
        return result;
    }
}
