import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        System.out.println(encrypt(ip));
    }

    static String encrypt(String str) {
        String[] split = str.split("\\.+");
        String result = "";
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                result += split[i];
            } else {
                result += split[i] + "[.]";
            }
        }
        return result;
    }
}
