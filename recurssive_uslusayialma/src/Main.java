import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("taban değerini giriniz");
        Scanner scanner = new Scanner(System.in);
        int taban = scanner.nextInt();
        System.out.println("üs değerini giriniz");
        int us = scanner.nextInt();
        System.out.println(uslusayi(taban,us));

    }
    static int uslusayi(int taban, int us){
        if(us==0){
            return 1;
        }
        else{
            return taban*uslusayi(taban,us-1);
        }
    }
}