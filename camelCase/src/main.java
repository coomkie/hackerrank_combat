import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
    int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){
               sb.setCharAt(i, ':');
            }
        }
        String[] split = sb.toString().split("\\:+");
        for (int i = 0; i < split.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
