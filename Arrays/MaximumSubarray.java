//Time Complexity:O(n)
//Space  Complexity::O(1)

class MaximumSubarray{
    public int maxSubArray(int[] a) {
       int cursum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++)
       {
        cursum=cursum+a[i];
        if(cursum>maxsum)
        {
          maxsum=cursum;
        }
        if(cursum<0)
    {
        cursum=0;
    }
       }
        return maxsum;
    }
}