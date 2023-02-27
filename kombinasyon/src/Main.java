import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int total = 1;
        int total2 = 1;
        int total3 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("kombinasyonu girilecek sayıları veriniz");
        int n = scan.nextInt();
        int r = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int i = 1; i <= r; i++) {
            total2 = total2 * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            total3 = total3 * i;
        }
        int comb = total / (total2 * total3);
        System.out.println(comb);
        }
}