import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(stringConstruction(str));
    }
    public static int stringConstruction(String s) {
        HashSet<Character>list = new HashSet<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list.size();
    }
}
