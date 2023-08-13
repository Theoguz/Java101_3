import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        int price = 1000;


        int right = 3;
        System.out.println("Welcome to the bank application");
        System.out.println("Kullanıcı Oluşturunuz");
        System.out.println("Kullanıcı Adı : ");
        userName = scanner.nextLine();
        System.out.println("Şifre : ");
        password = scanner.nextLine();
        System.out.println("Kullanıcı Oluşturuldu");

        while (right > 0){
            System.out.println("Kullanıcı Adı : ");
            String userName2 = scanner.nextLine();
            System.out.println("Şifre : ");
            String password2 = scanner.nextLine();
            if (userName.equals(userName2) &&password.equals(password2)){
                System.out.println("Giriş Başarılı");
                System.out.printf("Hoşgeldiniz %s\n",userName);
                System.out.println("1-Para yatırma\n" +
                                   "2-Para Çekme\n" +
                                   "3-Bakiye Sorgula\n" +
                                   "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                int select = scanner.nextInt();
                while (true) {
                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz tutar : ");
                            int price2 = scanner.nextInt();
                            System.out.printf("Yeni bakiyeniz : %d", price + price2);
                            price = price2;
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz tutar : ");
                            int price3 = scanner.nextInt();
                            System.out.printf("Yeni bakiyeniz : %d", price - price3);
                            price = price3;
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + price + " TL");
                        case 4 -> System.out.println("Çıkış Yapıldı");
                        default -> System.out.println("Hatalı Seçim");
                    }
                    break;
                }
            }
            else{
                right--;
                System.out.println("Giriş Başarısız");
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
