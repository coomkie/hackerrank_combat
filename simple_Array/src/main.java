import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        int result = 0;
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            result+= arr[i];
        }
        System.out.println(result);
    }
}
