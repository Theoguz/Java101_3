import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while(sayi % 2 == 0) {
            System.out.print("sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("toplam: " + toplam);

    }
}