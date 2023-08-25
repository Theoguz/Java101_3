public class Main {
    public static void main(String[] args) {
        int sayi;
        int sayac = 0;
        for (sayi = 2; sayi <= 100; sayi++) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(sayi);
            }
            sayac = 0;
        }


    }
}