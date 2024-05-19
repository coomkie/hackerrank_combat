import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (!stack.contains(str.charAt(i))) {
                stack.push(str.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result.reverse().toString());
    }
}


