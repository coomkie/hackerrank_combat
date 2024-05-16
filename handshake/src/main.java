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
            System.out.println(shakeHand(list.get(i)));
        }
    }

    static int shakeHand(int numberOfPeople) {
        int result = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            result += i;
        }
        return result;
    }
}
