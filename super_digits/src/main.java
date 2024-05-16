import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }while(num1 < 1 || num2 < 1);
        System.out.println(superDigit(num1,num2));
    }
    static int multiplyNumber(int a, int b) {
        String result_raw ="";
        int result;
            for (int i = 0; i < b; i++){
                result_raw += a;
            }
            return Integer.parseInt(result_raw);
    }

    static int superDigit(int a, int b){
        int number = multiplyNumber(a,b);
        int calculate = 0;

        String str = number+"";
        char[] split = str.toCharArray();
        for (int i = 0; i< split.length; i++){
            calculate += Integer.parseInt(split[i]+"");
        }
        String calculateToStr =calculate+"";
        if(calculateToStr.length()==1){
            return calculate;
        }else{
            return superDigit(calculate,1);
        }
    }
}
