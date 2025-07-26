//Time Complexity:O(n)
//Space  Complexity::O(1)

class Solution {
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void sortColors(int[] a) {
        int low=0,mid=0,high=a.length-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                swap(a,low,mid);
                mid++;
                low++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else{
                swap(a,high,mid);
                {
                    high--;
                }
            }
        }
        
    }

}