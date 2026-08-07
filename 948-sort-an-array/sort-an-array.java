class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums);

    }
    public int [] mergesort(int []nums)
    {
        int n=nums.length;
        //base case
        if(n<=1)return nums;
        int []a=new int[n/2];
        int []b=new int[n-n/2];
        for(int i=0;i<n/2;i++)
        {
            a[i]=nums[i];
        }
        for(int i=0;i<n-n/2;i++)
        {
            b[i]=nums[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        return merge(a,b,nums);
    }
    public int [] merge(int []a,int[]b,int []c)
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                c[k++]=a[i++];
            }
            else
            {
                c[k++]=b[j++];
            }
        }
        while(i<a.length)c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];
        return c;
    }

}