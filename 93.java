public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<String>();
        if(s.length()<4||s.length()>12)return res;
        String item=new String();
        dfs(s,item,res,0);
        return res;
    }
    private void dfs(String s,String item,List<String> res, int start){
        if(start==3&&isValid(s)){
            res.add(item+s);
            return;
        }
        for(int i=0;i<3&&i<s.length()-1;i++){
            if(isValid(s.substring(0,i+1))){
                dfs(s.substring(i+1,s.length()),item+s.substring(0,i+1)+".",res,start+1);
            }
        }
    }
    private boolean isValid(String s){
        if(s.charAt(0)=='0')return s.equals("0");
        int num=Integer.parseInt(s);
        if(num>255||num<0)return false;
        else return true;
    }
}
