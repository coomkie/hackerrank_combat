import java.util.*;
public class main {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            map.put(name, phone);
        }
        while (sc.hasNext()) {
            String s = sc.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }

        }
        sc.close();
    }
}
