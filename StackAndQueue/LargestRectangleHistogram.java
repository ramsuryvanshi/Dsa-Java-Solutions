//Time Complexity:O(N)
//Space Complexity:O(N)

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleHistogram {
   
    public int largestRectangleArea(int[] heights) {
          Stack<Integer> stack = new Stack<>();
        int max = 0;
        int[] h = Arrays.copyOf(heights, heights.length + 1); // add sentinel 0

        for (int i = 0; i < h.length; i++) {
            while (!stack.isEmpty() && h[i] < h[stack.peek()]) {
                int height = h[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }

        return max;
    } 
    }


