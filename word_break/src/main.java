import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> dict = new ArrayList<>();
        while(dict.size() < 3){
            dict.add(sc.nextLine());
        }
        System.out.println(wordBreak(str,dict));
    }
    static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] wordBreakTracker = new boolean[s.length() + 1];
        wordBreakTracker[0] = true;
        for (int i = 1; i <= s.length(); ++i) {
            for (int j = 0; j < i; ++j) {
                if (wordBreakTracker[j] && wordSet.contains(s.substring(j, i))) {
                    wordBreakTracker[i] = true;
                    break;
                }
            }
        }
        return wordBreakTracker[s.length()];
    }
}
