import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayi gireceksiniz: ");
        int sayiAdedi = scanner.nextInt();
        int[] array = new int[sayiAdedi];
        System.out.println("Sayıları giriniz: ");
        for (int i = 0; i < sayiAdedi; i++) {

            System.out.println((i + 1) + ". sayıyı giriniz: ");
            array[i] = scanner.nextInt();

        }

        int enBuyuk = array[0];
        int enKucuk = array[0];

        for (int i = 0; i < sayiAdedi; i++) {
            if (array[i] > enBuyuk) {
                enBuyuk = array[i];

            }
            if (array[i] < enKucuk) {
                enKucuk = array[i];
            }
        }
        System.out.println(enBuyuk +"en büyük sayıdır");
        System.out.println(enKucuk +"en küçük sayıdır");

    }
}