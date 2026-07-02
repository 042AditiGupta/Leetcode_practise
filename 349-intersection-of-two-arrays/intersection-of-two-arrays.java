class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //brute force approach
        // ArrayList<Integer>arr=new ArrayList<>();
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {
        //         if(nums1[i]==nums2[j])
        //         {
        //             if(!arr.contains(nums1[i]))arr.add(nums1[i]);
        //         }
        //     }
        // }

        // int []ans=new int[arr.size()];
        // for(int k=0;k<arr.size();k++)
        // {
        //     ans[k]=arr.get(k);
        // }
        // return ans;

        HashSet<Integer>set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                ans.add(nums2[i]);
            }
        }
        int res[]=new int[ans.size()];
        int index=0;
        for(int ele:ans)
        {
            res[index++]=ele;
        }
        return res;
    }

}

//Time complexity is o(n^2)
// space complexity is o(n)