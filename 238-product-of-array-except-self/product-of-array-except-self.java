class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []prefixProduct=new int[n];
        int res=1;
        //int []suffixProduct=new int[n];
        // finding the prefixproduct
        prefixProduct[0]=1;
        for(int i=1;i<n;i++)
        {
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
           res*=nums[i+1];
           prefixProduct[i]*=res;
        }
        return prefixProduct;
    }
}