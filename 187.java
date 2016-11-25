public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s==null||s.length()==0) return new ArrayList<String>();
        List<String> res=new ArrayList<String>();
        Set<String> set=new HashSet<String>();
        for(int i=0;i<=s.length()-10;i++){
            String tmp=s.substring(i,i+10);
            if(set.contains(tmp)) {
                if(!res.contains(tmp))
                    res.add(tmp);
            }
            else set.add(tmp);
        }
        return res;
    }
}
