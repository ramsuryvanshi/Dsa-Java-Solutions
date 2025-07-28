//Time complexity: O(log n)
//Space complexity: O(1)


class FirstandLastPos {
    public int[] searchRange(int[] nums, int target) {
        int left = leftbound(nums, target);
        int right = rightbound(nums, target);
        return new int[]{left, right}; 
    }

    private int leftbound(int[] nums, int target) {
        int idx = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            if (nums[mid] == target) {
                idx = mid;            // record possible leftmost index
                high = mid - 1;       // search more on left side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return idx;
    }

    private int rightbound(int[] nums, int target) {
        int idx = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            if (nums[mid] == target) {
                idx = mid;            // record possible rightmost index
                low = mid + 1;        // search more on right side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return idx;
    }
}
