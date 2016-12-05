public class Solution {
    public char findTheDifference(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i=0;i<t.length()-1;i++){
            if(array1[i]!=array2[i]) return array2[i];
        }
        return array2[array2.length-1];
    }
}
