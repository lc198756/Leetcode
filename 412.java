public class Solution {
    public List<String> fizzBuzz(int n) {
        if(n==0) return new ArrayList<>();
        List<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0) res.add("FizzBuzz");
            else if(i%3==0) res.add("Fizz");
            else if(i%5==0) res.add("Buzz");
            else res.add(Integer.toString(i));
        }
        return res;
    }
}
