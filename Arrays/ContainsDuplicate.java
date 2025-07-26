//Time Complexity:O(n)
//Space  Complexity::O(n)

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>seen=new HashSet<>();
        for(int num:nums)
        {
            if(seen.contains(num))
            {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}