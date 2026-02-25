class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)max=piles[i];
        }
        int low=1;
        int high=max;
        int sum=0;
        int ans=1;
        //binary search solution
        while(low<=high){

            int mid=low+(high-low)/2;
            sum=0;
            for(int i=0;i<piles.length;i++)
            {
             sum+=Math.ceil((double)piles[i]/mid);
            }
            if(sum<=h)
            {
                ans=mid;
                high=mid-1;
              
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}

// tc is 0(n)* log(max_ele)