import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), column = sc.nextInt();
        System.out.println(strangeGrid(row,column));
    }

    static int strangeGrid(int row, int col) {
        int[] odd_row = {0, 2, 4, 6, 8};
        int[] even_row = {1, 3, 5, 7, 9};

        int result;
        if (row % 2 == 0){
            result =  10*(row / 2 - 1) + even_row[col - 1];

        }else{
            result =  10*(row / 2) + odd_row[col - 1];

        }
        return result;
    }
}
