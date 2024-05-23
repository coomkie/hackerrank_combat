import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(int[][] arr) {
        int s1 = 0;
        int s2 = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    s1 += arr[i][j];
                }
                if (i + j == size - 1) {
                    s2 += arr[i][j];
                }
            }
        }
        int diff = Math.abs(s1 - s2);
        return diff;
    }
}
