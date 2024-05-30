import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            String str = sc.nextLine();
            System.out.println(sherlockAndAnagrams(str));
        }
    }
    //abba
    public static int sherlockAndAnagrams(String s) {
        int count=0;
        HashMap<String ,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length() ;j++){
                char sub1[]=s.substring(i,j+1).toCharArray();
                Arrays.sort(sub1);
                String sub=new String(sub1);
                map.put(sub, map.getOrDefault(sub,0)+1);
            }
        }
        // here we r using formaula to calcutate distinct pair  n(n-1)/2
        for (int a:map.values()){
            count+=a*(a-1)/2;
        }
        return count;
    }
}
