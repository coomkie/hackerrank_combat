import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solve(num));
    }

    static String solve(int n) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += n + " x " + i + " = " + (n * i) + "\n";
        }
        return result;
    }
}
