import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int sayac = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                sayac++;
            } else {
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar edildi.");
                sayac = 1;
            }

        }
    }
}