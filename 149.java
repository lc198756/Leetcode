/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if(points.length==0||points==null) return 0;
        if(points.length==1) return 1;
        int max=1;
        for(int i=0;i<points.length;i++){
            HashMap<Float,Integer> map=new HashMap<>();
            int same=0;
            int localmax=1;
            for(int j=0;j<points.length;j++){
                if(i==j){
                    continue;
                }
                if(points[i].x==points[j].x&&points[i].y==points[j].y){
                    same++;
                    continue;
                }
                float slope = ((float)(points[i].y - points[j].y))/(points[i].x - points[j].x);
                if (map.containsKey(slope)){
                    map.put(slope,map.get(slope)+1);
                }
                else{
                    map.put(slope,2);
                }

            }
            for(int a:map.values()){
                    localmax=Math.max(localmax,a);
                }
                localmax+=same;
                max=Math.max(localmax,max);
        }
        return max;
    }
}
