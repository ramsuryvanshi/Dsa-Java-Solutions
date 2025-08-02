//Time Complexity:O(N^2)
//Space Complexity:O(N)

import java.util.Stack;

class ReverseStack {

    // Function to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    // Recursive function to reverse the stack
    static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }
}