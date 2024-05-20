import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            input += solve(a, b, n) + ":";
        }
        String[] split = input.split("\\:+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    static String solve(int a, int b, int n) {
        String rs = "";
        for (int i = 0; i < n; i++) {
            a = a + (int) Math.pow(2, i) * b;
            rs += a + " ";
        }
        return rs;
    }
}
