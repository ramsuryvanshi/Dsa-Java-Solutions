//Time Complexity:o(n)
//Space Complexity:o(1)

public class SmallestSubarrayWithSumGreaterThanX {
    
     public static int smallestSubWithSum(int x, int[] arr) {
      int minwindow=Integer.MAX_VALUE;
      int sum=0;
      int i=0,j=0;
     while(j<arr.length)
      {
           sum=sum+arr[j];
          j++;
          while(sum>=x)
          {
              int cursize=j-i;
              minwindow=Math.min(minwindow,cursize);
              sum=sum-arr[i];
              i++;
          }
      }
      return minwindow==Integer.MAX_VALUE?0:minwindow;
    }

}
