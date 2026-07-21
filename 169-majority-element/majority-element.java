class Solution {
    public int majorityElement(int[] nums) {
        //optimal approach -> best approach is boyer moore voting algorithm
        int count=0;
        int candidate=0;
        for(int ele:nums)
        {
            if(count==0)
            {
                 candidate=ele;
                 count++;
            }
            else if( candidate==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return  candidate;
    }
}