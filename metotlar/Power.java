package metotlar;
import java.util.Scanner;

public class Power {

    static int power(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        else {
            return base * power(base,exponent-1);
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exponent = scan.nextInt();

        System.out.print("Sonuç : " + power(base,exponent));
    }
}
