//Time Complexity:O(N)
//Space Complexity:O(1)


public class MaxSumSubarrayOfSizeK{
    int MaxSumSubarrayOfSizeK(int a[],int k)
    {
    int wsum=0;
    for(int i=0;i<k;i++)
    {
       wsum=wsum+a[i];
    }
    int maxsum=wsum;
    for(int i=k;i<a.length;i++)
    {
        wsum=wsum-a[i-k]+a[i];
        maxsum=Math.max(maxsum,wsum);
    }
    return maxsum;
}

}