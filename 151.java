public class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0)return "";
         s=s.trim();
        if(s.length()<2) return s;
        String[] ss=s.split(" +");
        int i=0;
        int j=ss.length-1;
        StringBuilder str=new StringBuilder(ss[j]);
        j--;
        while(j>=0){
            str=str.append(" ").append(ss[j]);
            j--;
        }
        return str.toString();

    }
}
