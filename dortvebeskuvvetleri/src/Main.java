import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int n = scanner.nextInt();

        for(int j = 1; j <= n; j*=4){
            System.out.println(j);
        }
        for (int i = 1; i <= n; i*=5) {
            System.out.println(i);
        }

    }
}