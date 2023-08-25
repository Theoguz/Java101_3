import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("sayi giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("mukemmel sayidir");
        } else {
            System.out.println("mukemmel sayi degildir");
        }
    }
}