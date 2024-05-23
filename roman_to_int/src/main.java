import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(romanToInt(str));
    }

    static int romanToInt(String s) {
        int prev = 0, num = 0, ans = 0;
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            switch (arr[i]) {
                case 'I':num = 1;   break;
                case 'V':num = 5;   break;
                case 'X':num = 10;  break;
                case 'L':num = 50;  break;
                case 'C':num = 100; break;
                case 'D':num = 500; break;
                case 'M':num = 1000;break;
            }
            if(num < prev) {
                ans -= num;
            }else{
                ans += num;
            }
            prev = num;
        }

        return ans;
    }
}
