//Time Complexity:O(n log n);
//Space  Complexity::O(1)

import java.util.Arrays;

class KthLargestElement {
    public int findKthLargest(int[] a, int k) {
        Arrays.sort(a);
        int n=a.length;
        int ans=a[n-k];
        return ans;
    }
}
