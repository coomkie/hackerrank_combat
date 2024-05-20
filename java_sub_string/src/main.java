import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(solve(str,start,end));
    }
    static String solve(String input, int start, int end){
        return input.substring(start, end);
    }
}
