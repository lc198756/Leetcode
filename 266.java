public class Solution {
    public boolean canPermutePalindrome(String s) {
        int len = s.length();
        if (len <= 1) return true;
        boolean[] isodd = new boolean[256];
        int odds = 0;
        for ( char c: s.toCharArray() ) {
            isodd[c] = !isodd[c];
            if ( isodd[c] ) {
                odds++;
            } else {
                odds--;
            }
        }
        return odds <=1 ;
    }

}
//2
public class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            // 出现的第偶数次，将其从Set中移出
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            } else {
            // 出现的第奇数次，将其加入Set中
                set.add(s.charAt(i));
            }
        }
        // 最多只能有一个奇数次字符
        return set.size() <= 1;
    }
}
