public class Solution {
    public int myAtoi(String str) {
        if(str==null || str.length()==0) return 0;
        str=str.trim();
        int p=0;
        boolean pos=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+'){
                p++;
            }
            else if(str.charAt(i)=='-'){
                pos=false;
                p++;
            }
            if (p==2) return 0;
        }
        double tmp = 0.0;
        for (; p < str.length(); p++) {
            int digit = str.charAt(p) - '0';

            if (digit < 0 || digit > 9) break;
            if (pos) {
                tmp = 10*tmp + digit;
                if (tmp > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            } else {
                tmp = 10*tmp - digit;
                if (tmp < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }
       int ret = (int)tmp;
        return ret;
    }
}
