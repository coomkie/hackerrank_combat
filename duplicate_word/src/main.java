import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <=row ; i++) {
            list.add(scan.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            Set<String> set = new HashSet();
            StringBuilder builder = new StringBuilder();
            String[] split = list.get(i).split("\\s");
            for (String t : split) {
                String temp = t.toLowerCase();
                if (!set.contains(temp)) {
                    builder.append(t).append(" ");
                    set.add(temp);
                }
            }
            System.out.println(builder.toString());

        }
    }
}



