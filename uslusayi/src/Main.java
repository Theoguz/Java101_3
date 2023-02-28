import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k,l;
        System.out.println("Üstü alıncak sayiyi giriniz");
        k = scanner.nextInt();
        System.out.println("Üssü giriniz");
        l = scanner.nextInt();
        int total=1;
        for (int i=1; i<=l; i++){
            total=total*k;
        }
        System.out.println("sonuç: " + total  );
    }
}