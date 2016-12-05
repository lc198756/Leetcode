public class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0)return 0;
        HashSet<Character> set=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                res+=2;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }

        return set.isEmpty()?res:res+1;
    }
}
