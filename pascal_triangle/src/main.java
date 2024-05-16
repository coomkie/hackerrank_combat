import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        do{
        row = scanner.nextInt();
        }while(2<=row && row <=10);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(expression(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int expression(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return expression(n - 1, k - 1) + expression(n - 1, k);
        }
    }
}
