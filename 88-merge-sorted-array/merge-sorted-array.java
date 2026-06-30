class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []nums3=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i==m)
        {
            while(j<nums2.length)
            {
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(j==nums2.length)
        {
            while(i<m)
            {
                nums3[k]=nums1[i];
                i++;
                k++;
            }
        }
        for(int l=0;l<nums3.length;l++)
        {
           if(l<nums1.length)
           {
             nums1[l]=nums3[l];
           }
        }
        
    }
}