import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(romanToInt(str));
    }
    static int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < arr.length - 1; i++) {
            if (map.get(arr[i]) < map.get(arr[i+1])) {
                ans -= map.get(arr[i]);
            } else {
                ans += map.get(arr[i]);
            }
        }
        ans += map.get(arr[arr.length - 1]);
        return ans;
    }
}
