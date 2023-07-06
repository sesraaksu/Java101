package metotlar;
import java.util.Scanner;

public class AsalSayi {

    public static boolean asalMi(int n, int bolen){
        if (n < 2) {
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % bolen == 0) {
            return false;
        }
        if (bolen * bolen > n){
            return true;
        }
        return asalMi(n, bolen +1);
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayiıgiriniz : ");
        int n = scan.nextInt();

        if (asalMi(n,2)){
            System.out.println(n + " asal bir sayıdır.");
        } else {
            System.out.println(n + " asal bir sayı değildir.");
        }


    }
}
