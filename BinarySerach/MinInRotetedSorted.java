//Time complexity: O(log n)
//Space complexity: O(1)


class Solution {
    public int findMin(int[] a) {
       int st=0;int end=a.length-1;
       while(st<end)
       {
        int mid=st+(end-st)/2;
        if(a[mid]>a[end])
        {
            st=mid+1;
        }
        else{
            end=mid;
        }

       }
       return a[st];
    }
}