import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;

        Scanner imput = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        sayi1 = imput.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        sayi2 = imput.nextInt();
        System.out.print("yapmak istediğiniz işlemi seçiniz :\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\n");
        secim = imput.nextInt();

        switch (secim){
            case 1:
                System.out.print(sayi1+sayi2);
                break;
            case 2:
                System.out.print(sayi1-sayi2);
                break;
            case 3:
                System.out.print(sayi1*sayi2);
                break;
            case 4:
                System.out.print(sayi1/sayi2);
                break;
        }
    }
}
