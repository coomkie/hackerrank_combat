import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(birthdayCakeCandles(list));
    }

    static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            }else if(candles.get(i) == max) {
                count++;
            }
        }
        return count;
    }
}

