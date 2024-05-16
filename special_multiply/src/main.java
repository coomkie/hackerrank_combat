import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(specialMultiply(list.get(i)));
        }
    }

    static int specialMultiply(int number) {
        int result = 0;
        for (int i = 0; i < 100000; i++) {
            if (checkCondition(i) && i % number == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static boolean checkCondition(int number) {
        if(number == 0){
            return false;
        }
        String numString = Integer.toString(number);
        for (int j = 0; j < numString.length(); j++) {
            char digit = numString.charAt(j);
            if (digit != '0' && digit != '9') {
                return false;
            }

        }
        return true;
    }
}
