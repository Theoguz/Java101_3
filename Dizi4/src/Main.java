import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8};
        Arrays.sort(arr);
        int evennumber = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i + 1]) && (arr[i] % 2 == 0)) {
                evennumber = arr[i];
                System.out.println("Tekrar eden çift sayı: " + evennumber);
            }

        }
    }
}
