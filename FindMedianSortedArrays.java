class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
       int l=nums1.length+nums2.length;
        int[] n=new int[l];
        System.arraycopy(nums1,0,n,0,nums1.length);
        System.arraycopy(nums2,0,n,nums1.length,nums2.length);
        Arrays.sort(n);
        int z=n.length;
        int h=z/2;
        if(z%2!=0)
        return n[h];
        else
         return (n[h-1]+n[h])/2.0;
    }
}
