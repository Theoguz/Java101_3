import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("fibonacci serisi elaman sayisini giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c ;

        for (int i = 2; i < sayi; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

    }
}