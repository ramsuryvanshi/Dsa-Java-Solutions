//Time complexity: O(log n)
//Space complexity: O(1)

class  KthmisingPosNo {
    public int findKthPositive(int[] a, int k) {
        int st=0;
        int end=a.length;
        while(st<end)
        {
            int mid=(st+end)/2;
            if(a[mid]-mid-1<k)
            {
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        return st+k;
    }
}