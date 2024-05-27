import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            HashMap<String,Integer> strings = new HashMap<String,Integer>();
            int c;
            for(int i=0; i < n; i++){
                String str = in.next();
                if(strings.get(str) == null){
                    c = 0;
                }else{
                    c = strings.get(str);
                }
                strings.put(str, c + 1);
            }
            int q = in.nextInt();
            for(int i=0; i < q; i++){
                String query = in.next();
                if(strings.get(query) == null){
                    System.out.println(0);
                }else{
                    System.out.println(strings.get(query));
                }
            }
        }
    }
