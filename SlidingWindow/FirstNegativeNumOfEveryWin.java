//Time Complexity:O(N)
//Space Complexity:O(K)



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumOfEveryWin {
   static List<Integer> firstNegInt(int arr[], int k) {
        int i = 0, j = 0;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        while (j < arr.length) {
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Window size reached
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(q.peek());
                    if (arr[i] == q.peek()) {
                        q.poll();
                    }
                }
                i++;
                j++;
            }
        }
        return result;
    }
}


