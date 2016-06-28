public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
    int[] map = new int[256];
    int max = 0, dis = 0, left =0;
    for(int i=0; i<s.length(); i++) {
        if(map[s.charAt(i)]++ == 0) dis++;
        while(dis > 2) {
            int pos = s.charAt(left++);
            if(--map[pos] == 0) dis--;
        }
        max= Math.max(max, i-left+1);
    }
    return max;
}
    }
}
