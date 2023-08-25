import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        int ebob = 1;
        int i = 1;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.printf("Ebob: %d", ebob);

      /*  for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        System.out.printf("Ebob: %d", ebob);

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.printf("\nEkok: %d", ekok);
    */
    }
}