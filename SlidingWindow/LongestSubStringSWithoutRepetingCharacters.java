//Time Complexity:o(n)
//Space Complexity:o(k)

import java.util.HashSet;
import java.util.Set;

class LongestSubStringSWithoutRepetingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
     int max=0;
     int left=0;
     for(int right=0;right<s.length();right++)
     {
        while(set.contains(s.charAt(right)))
        {
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        max=Math.max(max,right-left+1);
     }
     return max;
    }
}
