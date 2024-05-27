import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String str = sc.next();
        int rotate = sc.nextInt();
        System.out.println(caesar(str, rotate));
    }

    static String caesar(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                sb.append((char) (((s.charAt(i) - 'a') + k) % 26 + 97));
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                sb.append((char) (((s.charAt(i) - 'A') + k) % 26 + 65));
            else
                sb.append(s.charAt(i));
        return sb.toString();
    }
}
