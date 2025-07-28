//Time complexity: O(log n)
//Space complexity: O(1)

class PeakElement {
    public int findPeakElement(int[] a) {
      int n=a.length;
      if(n==1)
      {
        return 0;
      }
      if(a[0]>a[1])
      {
        return 0;
      }
      if(a[n-1]>a[n-2])
      {
        return n-1;
      }
      int st=1;
      int end=n-2;
      while(st<=end)
      {
        int mid=(st+end)/2;
        if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
        {
            return mid;
        }
        if(a[mid]<a[mid+1])
        {
            st=mid+1;
        }
        else{
            end=mid-1;
        }
      }
      return 0;
    }
}