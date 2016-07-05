//0,1,6,8,9
public class Solution {
   public boolean isStrobogrammatic(String num) {
        if(num==null) return false;
        if(num.length()==1){
            if(num.indexOf("0")!=-1||num.indexOf("1")!=-1||num.indexOf("8")!=-1){
                return true;
            }
            return false;
        }
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int i=0;
        int j=num.length()-1;
        while(i<=j){
            char last=num.charAt(i);
            char first=num.charAt(j);
            if(!map.containsKey(last)||first!=map.get(last) ){
                return false;
            }
            i++;
            j--;
        }
        return true;

   }
}
