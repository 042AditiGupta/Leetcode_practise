class Solution {
    public int findKthPositive(int[] arr, int k) {
        int freq[]=new int[10000];
        int index=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==0)
            {
                ans.add(i);
            }
        }
        System.out.print(ans);
        return ans.get(k-1);
    }
}