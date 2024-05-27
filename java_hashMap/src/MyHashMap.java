import java.util.Arrays;

public class MyHashMap {
    int[] map = new int[(int)Math.pow(10, 6) + 1];
    public MyHashMap() {
        Arrays.fill(map, -1);
    }
    public void put(int key, int value) {
        map[key] = value;
    }
    public int get(int key) {
        return map[key];
    }
    public void remove(int key) {
        map[key] = -1;
    }
}
