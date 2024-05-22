import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < test; i++) {
            list.add(sc.nextLong());
        }
        System.out.println(solve(list));
    }
    static long solve(List<Long> list){
        long result = 0;
        for (int i = 0; i < list.size(); i++) {
            result+= list.get(i);
        }
        return result;
    }
}
