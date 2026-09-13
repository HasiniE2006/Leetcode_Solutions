import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for(int i=0;i<arr.length;i++) a[i]=arr[i];

        Arrays.sort(a,(x,y)->{
            int bx=Integer.bitCount(x), by=Integer.bitCount(y);
            return bx==by ? x-y : bx-by;
        });

        for(int i=0;i<arr.length;i++) arr[i]=a[i];
        return arr;
    }
}
