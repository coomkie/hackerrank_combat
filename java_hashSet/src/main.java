import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            set.add(line);
            System.out.println(set.size());
        }
    }
}
