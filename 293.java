public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res=new ArrayList<String>();
        for(int i=0;i<s.length()-1;i++){
            if(s.substring(i,i+2).equals("++")){
              //res.add(s.substring(0,i)+"--"+s.substring(i+2));
                StringBuilder a=new StringBuilder(s.substring(0,i)).append("--").append(s.substring(i+2));
                res.add(a.toString());
            }
        }
        return res;
    }
}
