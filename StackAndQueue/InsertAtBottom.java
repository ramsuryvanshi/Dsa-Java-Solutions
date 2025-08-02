//Time Complexity:O(N)
//Space Complexity:O(N)

import java.util.*;

class SInsertAtBottom {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
  
        if (st.isEmpty()) {
            st.push(x);
            return st;
        }

        // Step 1: Pop the top element
        int top = st.pop();

        // Step 2: Recurse to the bottom
        insertAtBottom(st, x);

        // Step 3: Push the top element back
        st.push(top);

        return st;
    }
}
