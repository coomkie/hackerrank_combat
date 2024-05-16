import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        char[] split = input.toCharArray();
        String result = "";
        for (int i = 0; i < split.length; i++) {
            int count = 0;
            for (int j = i + 1; j < split.length; j++) {
                if (split[i] == split[j]) {
                    count++;
                }
            }
            if (count > 0 && !result.contains((split[i])+"")) {
                result += split[i];
            }
        }
    if(result == ""){
        result = input;
    }
        System.out.println(result);
    }
    }

