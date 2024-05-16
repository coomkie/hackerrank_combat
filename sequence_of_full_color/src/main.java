import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        String[] colors = new String[arr_size];
        sc.nextLine();
        for (int i = 0; i < colors.length; i++) {
            colors[i] = sc.nextLine();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(checkCondition(colors[i]));
        }
    }

    public static boolean checkCondition(String sequence) {
        int redCount = 0, greenCount = 0, yellowCount = 0, blueCount = 0;

        for (char c : sequence.toUpperCase().toCharArray()) {
            switch (c) {
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
        return redCount == greenCount && yellowCount == blueCount;
    }
}
