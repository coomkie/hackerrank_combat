import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr
                = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            int j = 0;
            int d = sc.nextInt();
            while(d-- > 0){
                int value = sc.nextInt();
                arr.get(i).add(j,value);
                j++;
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }}


    }
}
