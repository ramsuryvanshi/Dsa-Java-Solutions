//Time Complexity:O(n)
//Space  Complexity::O(n)

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int component=target-nums[i];
            if(map.containsKey(component))
            {
              return new int[]{map.get(component),i};
            }

            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no found");
    }
}