public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        if(strs==null||strs.length==0) return null;
        HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
        for(String i:strs){
            char[] temp=i.toCharArray();
            Arrays.sort(temp);
            String tempStr=new String(temp);
            if(hm.containsKey(tempStr)){
                hm.get(tempStr).add(i);
            }else{
                ArrayList<String> v=new ArrayList<String>();
                v.add(i);
                hm.put(tempStr,v);
            }
        }
        list.addAll(hm.values());
        return list;
    }
}
