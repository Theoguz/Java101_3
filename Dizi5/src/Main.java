import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz : ");

        int diziBoyutu = scanner.nextInt();
        int[] arr = new int[diziBoyutu];

        System.out.println("Dizinin boyutu: " + diziBoyutu);
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < diziBoyutu; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Dizinin elemanları: ");
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print(arr[i] + "  ");
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }
}
