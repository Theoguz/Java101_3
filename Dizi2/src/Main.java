import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int maxSayi = 0;
        int minSayi= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi;
        sayi = scanner.nextInt();
        System.out.println("diziyi sırala");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            if (sayi < i) {
                maxSayi = i;
                break;
            }
        }               //maksayi 12

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < sayi) {
                minSayi = arr[i];
                break;
            }

        }
        System.out.println(maxSayi);
        System.out.println(minSayi);
    }
}