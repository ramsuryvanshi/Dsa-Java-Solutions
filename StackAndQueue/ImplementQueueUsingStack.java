//Time Complexity:O(N)
//Space Complexity:O(N)

import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public ImplementQueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

