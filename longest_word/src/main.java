import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLine();
        }
        System.out.println(longestWord(list));
    }
    static String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> list = new HashSet<>();
        String result = "";
        for(int i=0; i<words.length; i++){
            String s = words[i];
            if(s.length()==1 || list.contains(s.substring(0,s.length()-1))){
                if(s.length()>result.length()){
                    result = s;
                }
                list.add(s);
            }
        }
        return result;
    }
}
