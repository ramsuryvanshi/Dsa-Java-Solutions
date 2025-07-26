//Time Complexity:O(n);
//Space  Complexity::O(1)

class RotateArrayByK {
    static void swap(int a[],int i,int j)
    {
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] a, int k) {
        k = k % a.length; 
        
        // Step 1: Reverse the whole array
        swap(a,0,a.length-1);
        // Step 2: Reverse first k elements
        swap(a,0,k-1);
        // Step 3: Reverse remaining elements
        swap(a,k,a.length-1);
    }
}