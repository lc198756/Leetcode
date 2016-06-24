//242. Valid Anagram
public class Solution {
    public boolean isAnagram(String s, String t) {
       if (s==null || t==null ||s.length() !=t.length()){
           return false;
       }
       char [] charListS=s.toCharArray();
       char [] charListT=t.toCharArray();
       Arrays.sort(charListS);
       Arrays.sort(charListT);
       for (int i=0; i<charListS.length;i++){
           if(charListS[i] !=charListT[i]){
               return false;
           }

       }
       return true;
    }
}
//2
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> a=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!a.containsKey(s.charAt(i))){
                a.put(s.charAt(i),1);
            }else
            a.put(s.charAt(i),a.get(s.charAt(i))+1);
        }
        for(int j=0;j<s.length();j++){
            if(a.containsKey(t.charAt(j))){
                a.put(t.charAt(j), a.get(t.charAt(j)) - 1);
            }else
                return false;

        }
        boolean ans=true;
        for(int i=97; i<=122; i++) {
        if(a.containsKey((char)i) && (a.get((char)i) != 0)) {
           ans = false;
        }
     }
    return ans;

    }
}
