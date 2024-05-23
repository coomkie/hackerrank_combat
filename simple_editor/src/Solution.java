import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
            int amountOfOperations = Integer.parseInt(br.readLine().trim());
            Stack<UndoOperation> history = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < amountOfOperations; i++) {
                String[] parts = br.readLine().trim().split(" ");
                Operation operation;

                switch (parts[0]) {
                    case "1":
                        operation = new Append(parts[1]);
                        break;
                    case "2":
                        operation = new Delete(Integer.parseInt(parts[1]));
                        break;
                    case "3":
                        operation = new Print(Integer.parseInt(parts[1]) - 1);
                        break;
                    case "4":
                        operation = new Undo(history);
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operation");
                }

                operation.operation(sb);
                if (operation instanceof UndoOperation) {
                    history.add((UndoOperation) operation);
                }
            }
        }
    }

    private interface Operation {
        void operation(StringBuilder sb);
    }

    private interface UndoOperation extends Operation {
        void undo(StringBuilder sb);
    }

    public static class Append implements UndoOperation {
        private final String arg;

        public Append(String arg) {
            this.arg = arg;
        }

        @Override
        public void operation(StringBuilder sb) {
            sb.append(arg);
        }

        @Override
        public void undo(StringBuilder sb) {
            sb.delete(sb.length() - arg.length(), sb.length());
        }
    }

    public static class Delete implements UndoOperation {
        private final int arg;
        private String temp;

        public Delete(int arg) {
            this.arg = arg;
        }

        @Override
        public void operation(StringBuilder sb) {
            temp = sb.substring(sb.length() - arg, sb.length());
            sb.delete(sb.length() - arg, sb.length());
        }

        @Override
        public void undo(StringBuilder sb) {
            sb.append(temp);
        }
    }

    public static class Undo implements Operation {
        private final Stack<UndoOperation> history;

        public Undo(Stack<UndoOperation> history) {
            this.history = history;
        }

        @Override
        public void operation(StringBuilder sb) {
            if (!history.empty()) {
                UndoOperation temp = history.pop();
                temp.undo(sb);
            }
        }
    }

    public static class Print implements Operation {
        private final int arg;

        public Print(int arg) {
            this.arg = arg;
        }

        @Override
        public void operation(StringBuilder sb) {
            System.out.println(sb.charAt(arg));
        }
    }

}