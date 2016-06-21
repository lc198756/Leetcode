//344. Reverse String
//#1 4ms
public class Solution {
    public String reverseString(String s) {
      if(s==null) return s;
      char[] ss=new char[s.length()];
      int i=0;
      int j=s.length()-1;
      while(i<s.length()&&j>=0){
          ss[i]=s.charAt(j);
          i++;
          j--;
      }
      return new String(ss);
    }
}

//#2 3ms
public class Solution {
    public String reverseString(String s) {
          char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
