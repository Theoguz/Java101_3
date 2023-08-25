import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Basamak sayisi ters üçgen");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (k = 0; k < (2 * n - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}