public class TwoSum {
    HashMap<Integer, Integer> map = new HashMap<>();
public void add(int number) {
    map.put(number, map.getOrDefault(number,0)+1);
}

public boolean find(int value) {

    for (int n1:map.keySet()) {
        int n2 = value - n1;
        if (map.containsKey(n2) && (n1 != n2 || map.get(n1) > 1))
            return true;
    }
    return false;
}
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);
