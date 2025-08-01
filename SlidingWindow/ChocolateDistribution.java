//Time Complexity:o(n log n)
//Space Complexity:o(1)

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m,int n) {
      Collections.sort(arr);
      int result=Integer.MAX_VALUE;
      for(int i=0;i<n-m+1;i++)
      {
          int min=arr.get(i);
          int max=arr.get(i+m-1);
          result=Math.min(result,max-min);
      }
      return result;
    }
}
