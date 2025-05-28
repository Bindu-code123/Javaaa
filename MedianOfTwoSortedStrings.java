import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int p[]=new int[nums1.length+nums2.length];
        int q=0;
        for(int i=0;i<p.length;)
        {
           if(q<nums1.length)
           {
                p[i]=nums1[q];
                i++;
           }
           if(q<nums2.length)
           {
                p[i]=nums2[q];
                i++;
           }
            q++;
        }
        Arrays.sort(p);
        int a=p.length;
        if(a%2==1)
        return (double)p[a/2];
        else
        return (p[a/2]+p[(a/2)-1])/2.0;
    

    }
}