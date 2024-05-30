import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number of queries
        int q = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        // Process the queries
        for (int i = 0; i < q; i++) {
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    // Enqueue operation
                    int element = sc.nextInt();
                    queue.add(element);
                    break;
                case 2:
                    // Dequeue operation
                    if (!queue.isEmpty()) {
                        queue.poll()    ;
                    }
                    break;
                case 3:
                    // Print front element
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peek());
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
