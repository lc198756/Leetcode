public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens==null || tokens.length==0) return 0;
        int res=0;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else if(tokens[i].equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
