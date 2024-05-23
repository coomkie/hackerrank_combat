import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rotateTime = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        list = rotateLeft(rotateTime, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }

    public static List<Integer> rotateLeft(int time, List<Integer> arr) {
        LinkedList<Integer> linkedList = new LinkedList<>(arr);
        for (int i=0; i<time; i++) {
            linkedList.addLast(linkedList.pop());
        }
        return linkedList;
    }
}
