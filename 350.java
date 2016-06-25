//350. Intersection of Two Arrays II
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0||nums2==null||nums2.length==0) return new int[0];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        /**for (int i : nums1) {
                    map.put(i, 1 + map.getOrDefault(i, 0));
                }
        */
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else map.put(nums1[i],1);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])&& map.get(nums2[i]) > 0){
                map.put(nums2[i],map.get(nums2[i])-1);
                list.add(nums2[i]);
            }

        }
        int [] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
