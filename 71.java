public class Solution {
    public String simplifyPath(String path) {
        if(path==null ||path.length()==0) return null;
        Stack<String> stack=new Stack<String>();
        String[] s=path.split("/");
        for(int i=0;i<s.length;i++){
            if(s[i].length()==0||s[i].equals(".")) continue;
            if(s[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else stack.push(s[i]);
        }
        Stack<String> rev=new Stack<String>();
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()) rev.push(stack.pop());
        while(!rev.isEmpty()) sb.append("/"+rev.pop());
        if(sb.length()==0) sb.append("/");
        return sb.toString();
    }
}
