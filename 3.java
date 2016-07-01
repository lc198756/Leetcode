//1
/*hashmap<char,s.charAt[i]>
max=0
for
    length++;
    if hashmap has s.charAt[i]
        if length>max,replace,clear hashmap,i=i-1. else clear hashmap,i=i-1;
    else map.put
return max
**/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int length=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                max=Math.max(max,length);
                length=0;
                i=map.get(s.charAt(i));
                map.clear();

            }
            else{
                map.put(s.charAt(i),i);
                length++;
            }

        }
        if(length>max){
            return length;
        }
        return max;
    }
}
//2
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
//3
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
