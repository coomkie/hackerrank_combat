import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(pangrams(input));
    }

    static String pangrams(String s) {
        s = s.toLowerCase();
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int n1 = s1.length();
        int count = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s1.charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        if (count == 26)
            return "pangram";
        else
            return "not pangram";
    }
}
