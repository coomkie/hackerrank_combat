import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        List<Integer> resultList = (waiter(list, q));
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }

    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> answers = new ArrayList<>();
        List<Integer> primeNos = primes(q);
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        int size;
        for (Integer item : number) {
            A.push(item);
        }
        for (int i = 0; i < q; i++) {
            Stack<Integer> temp = new Stack<>();
            for (size = A.size(); size > 0; size--) {
                Integer item = A.pop();
                if (item % primeNos.get(i) == 0) {
                    B.push(item);
                } else {
                    temp.push(item);
                }
            }
            if (!B.isEmpty()) {
                for (size = B.size(); size > 0; size--) {
                    answers.add(B.pop());
                }
            }
            A = temp;
        }
        if (!A.isEmpty()) {
            size = A.size();
            while (size > 0) {
                answers.add(A.pop());
                size--;
            }
        }
        return answers;
    }

    public static List<Integer> primes(int itr) {
        int count = 0;
        int digit = 2;
        List<Integer> primeList = new ArrayList<>();
        while (count < itr) {
            if (isPrime(digit)) {
                primeList.add(digit);
                count++;
            }
            digit++;
        }
        return primeList;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
