import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solve(str));
    }
    static String solve(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(sb.reverse().toString().equals(str)){
            return "Yes";
        }
        return "No";
    }
}
