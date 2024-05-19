import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        List<String> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < arr_size; i++) {
            //String str = sc.nextLine();
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(checkCondition(list.get(i)));
        }
    }

    public static boolean checkCondition(String sequence) {
        int redCount = 0, greenCount = 0, yellowCount = 0, blueCount = 0;
        char[] arr = sequence.toUpperCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'R':
                    redCount++;
                    break;
                case 'G':
                    greenCount++;
                    break;
                case 'Y':
                    yellowCount++;
                    break;
                case 'B':
                    blueCount++;
                    break;
                default:
                    return false;
            }
            if (Math.abs(redCount - greenCount) > 1 || Math.abs(yellowCount - blueCount) > 1) {
                return false;
            }
        }
        return redCount==greenCount && yellowCount == blueCount;
    }
}
