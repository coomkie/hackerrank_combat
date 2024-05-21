import java.math.BigInteger;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInt = new BigInteger(sc.nextLine());
     System.out.println(bigInt.isProbablePrime(1) ? "prime" : "not prime");;
    }
}
