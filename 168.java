public class Solution {
    public String convertToTitle(int n) {
        HashMap <Integer,Character> map=new HashMap<Integer,Character>();
        if(n<1) return "";
        StringBuilder res=new StringBuilder();
        for(int i=1;i<27;i++){
            map.put(i,(char)('A'+i-1));
        }
        while(n>0){
            if(n%26!=0){
                res.insert(0, map.get(n % 26));
                n=n/26;
            }
            else{
                res.insert(0,'Z');
                n=n/27;
            }
        }
        return res.toString();
    }
}
