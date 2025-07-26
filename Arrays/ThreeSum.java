//Time Complexity:O(n^2)
//Space  Complexity::O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
           {
            int sum=nums[j]+nums[k];
            if(sum==-nums[i])
            {
                res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
            }
            else if(sum>-nums[i])k--;
            else if(sum<-nums[i])j++;
           }
        }
           return new ArrayList<>(res);
    }
}
