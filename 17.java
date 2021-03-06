public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        String[] dic = {" ","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ret = new ArrayList<String>();
        if(digits==null||digits.length()==0)return ret;
        StringBuilder temp = new StringBuilder();
        dfs(digits, dic, 0, temp, ret);
        return ret;
    }
    public void dfs(String digits, String[] dic, int deep, StringBuilder temp, ArrayList<String> ret){
        if(deep == digits.length()){
            ret.add(temp.toString());
            return;
        }
        else{
            for(int i = 0; i < dic[digits.charAt(deep) - '0'].length(); i++){
                temp.append(dic[digits.charAt(deep) - '0'].charAt(i));
                dfs(digits, dic, deep+1, temp, ret);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
