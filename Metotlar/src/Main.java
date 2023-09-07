import java.util.Scanner;

public class Main {
    static int isPolindrom(int num) {
        int temp = num, reverse = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }
        if (num == reverse) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = isPolindrom(num);
        if (result == 1) {
            System.out.println(num + " Polindrom sayıdır.");
        } else {
            System.out.println(num + " Polindrom sayı değildir.");
        }

    }

}
