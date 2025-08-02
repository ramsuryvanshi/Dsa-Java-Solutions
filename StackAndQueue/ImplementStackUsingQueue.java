//Time Complexity:O(N)
//Space Complexity:O(N)

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueue {

    private Queue<Integer> q;

    public ImplementStackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}