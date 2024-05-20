import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkCondition(num));
    }

    static String checkCondition(int num) {
        if (num % 2 == 0) {
        if(num >= 2 && num <= 5){
            return "Not Weird";
        }else if( num >= 6 && num <= 20){
            return "Weird";
        }else if( num > 20) {
            return "Not Weird";
        }
        } else {
            return "Weird";
        }
        return "Weird";
    }
}
