import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int result = 0;
        int basvalue;
        int sayac = 0;
        int tempnumber = number;


        number = tempnumber;
        System.out.println(number);
        while (number != 0) {
            basvalue = number % 10;
            result += basvalue;
            number = number / 10;
        }
        System.out.println("Basamakların toplamı: " + result);
    }
}
