//Time complexity: O(N)
//Space complexity: O(1)

import javax.swing.tree.TreeNode;

class KthSmallestElement {
    // Works on the logic that inorder traversal provides nodes in sorted order.
    public int kthSmallest(TreeNode root, int k) {
        int[] smallest = new int[] { -1 };
        int[] counter = new int[] { 0 };

        inOrder(root, k, counter, smallest);
        return smallest[0];
    }

    // Inorder: Left - Root - Right
    private void inOrder(TreeNode root, int k, int[] count, int[] min) {
        if (root == null || count[0] >= k)
            return;

        // Left
        inOrder(root.left, k, count, min);

        // Root 
        count[0]++;
        if (count[0] == k) {
            min[0] = root.val;
            return;
        }

        // Right
        inOrder(root.right, k, count, min);
    }
}

