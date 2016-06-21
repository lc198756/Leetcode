//349. Intersection of Two Arrays
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> s = new HashSet<>();
    List<Integer> l = new ArrayList<Integer>();
    for (int i:nums1) if(s.add(i)) s.add(i);
    for (int i:nums2) if(s.contains(i) && !l.contains(i)) l.add(i);
    int[] result = new int[l.size()];
    for (int i = 0; i < l.size();i++) {
        result[i] = l.get(i);
    }
    return result;
    }
}
