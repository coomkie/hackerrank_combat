import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < test; i++) {
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();
           System.out.println(solve(s1,s2));
        }
    }
    public static String solve(String s1, String s2) {
        HashSet<String> string1 = new HashSet<>(Arrays.asList(s1.split("")));
        HashSet<String> string2 = new HashSet<>(Arrays.asList(s2.split("")));
        string1.retainAll(string2);
        return string1.size() > 0 ? "YES" : "NO";
    }
}
