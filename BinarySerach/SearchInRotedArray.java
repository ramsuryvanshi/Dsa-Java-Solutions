//Time complexity: O(log n)
//Space complexity: O(1)

class SearchInRotedArray {
    public int search(int[] a, int target) {
        int st=0;int end=a.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(target==a[mid])
            {
                return mid;
            }
            else if(a[mid]<a[end])
            {
                if(target>a[mid]&& target<=a[end])
                {
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>=a[st]&& target<a[mid])
                {
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
}