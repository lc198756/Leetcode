public class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0||nums==null) return "";
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,new comp());
        String res="";
        for(String i:str){
            res=res.concat(i);
        }
        int i=0;
        while(i<res.length()&&res.charAt(i)=='0'){
            i++;
        }
        if(i==res.length())return "0";
        return res.substring(i);

    }
    class comp implements Comparator<String>{
    @Override
    public int compare(String a, String b) {
        String ab = a.concat(b);
        String ba = b.concat(a);
        return ba.compareTo(ab);
    }
}
}
