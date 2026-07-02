class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //brute force approach
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    if(!arr.contains(nums1[i]))arr.add(nums1[i]);
                }
            }
        }

        int []ans=new int[arr.size()];
        for(int k=0;k<arr.size();k++)
        {
            ans[k]=arr.get(k);
        }
        return ans;
    }
}