package donguler;
import java.util.Scanner;

public class UstelKuvvet2 {
    public static void main(String[] args) {

        int total = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        int n = scanner.nextInt();
        System.out.print("üs olacak sayı : ");
        int k = scanner.nextInt();

        for (int i = 1; i <= k; i++){
            total = total * n;
        }
        System.out.print("cevap : " + total);
    }
}
