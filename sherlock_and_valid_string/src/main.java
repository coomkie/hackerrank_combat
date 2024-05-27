import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isValid(input));
    }
    static String isValid(String s){
            String[] sArray = s.split("");
            List<String> stringList = Arrays.asList(sArray);
            Set<String> chars = new HashSet<String>(stringList);

            List<Integer> appearances = new ArrayList<>();
            TreeSet<Integer> counter = new TreeSet<>();

            for (String text : chars) {
                int fre = Collections.frequency(stringList, text);
                appearances.add(fre);
                counter.add(fre);
            }

            if(counter.size() > 2) return "NO";

            int higer = counter.last();
            int lower = counter.first();

            if(higer == lower) return "YES";
            if(Collections.frequency(appearances,lower) == 1) return "YES";

            if(higer-1 != lower) return "NO";
            if(Collections.frequency(appearances,higer) > 1  ) return "NO";

            return "YES";
        }
    }
