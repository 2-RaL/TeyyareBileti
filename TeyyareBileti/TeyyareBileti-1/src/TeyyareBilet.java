import java.util.Scanner;

public class TeyyareBilet {
    public static void main(String[] args) {

 /*       Scanner scan = new Scanner(System.in);
        int km, yas, tip, usaq;
        System.out.println("5 yaşa kadar çocuk sayısını girin: ");
        usaq = scan.nextInt();
        System.out.println("Gideceğiniz yolun km'sini girin:");
        km = scan.nextInt();
        System.out.println("Yaşınızı girin:");
        yas = scan.nextInt();
        System.out.println("Tipi girin: 1-Gidiş; 2-Gidiş-Dönüş");
        tip = scan.nextInt();

        double normalQiymet = km * 0.10;
        double yasEndirimi = 0;

        if (yas < 5) {
            System.out.println("5 yaşa kadar çocuklar için bilet ücretsizdir.");
        } else if (yas >= 5 && yas <= 12) {
            yasEndirimi = normalQiymet * 0.20;
        } else if (yas >= 65) {
            yasEndirimi = normalQiymet * 0.40;
        } else {
            System.out.println("Hatalı bilgi girdiniz.");
        }

        normalQiymet -= yasEndirimi;

        if (tip == 2) {
            double tipEndirimi = normalQiymet * 0.50;
            normalQiymet = (normalQiymet - tipEndirimi) * 2;
        }

        System.out.println("Bilet fiyatı: " + normalQiymet + "$");


  */



                Scanner scanner = new Scanner(System.in);

                System.out.print("Kilometre: ");
                double kilometre = scanner.nextDouble();

                System.out.print("Çocuk sayısı: ");
                int cocukSayisi = scanner.nextInt();

                System.out.print("Büyük sayı: ");
                int buyukSayi = scanner.nextInt();

                System.out.print("Emekli misiniz? (true/false): ");
                boolean emekli = scanner.nextBoolean();

                System.out.print("Yaşınız: ");
                int yas = scanner.nextInt();

                System.out.print("Gidiş (true) ya da gidiş-dönüş (false) bilet mi istiyorsunuz? ");
                boolean gidisDonus = scanner.nextBoolean();

                double indirimliFiyat = 0.0;

                if (kilometre > 100 && cocukSayisi > 0) {
                    indirimliFiyat = kilometre * 0.8;
                } else if (buyukSayi >= 2) {
                    indirimliFiyat = kilometre * 0.9;
                } else if (emekli || yas >= 65) {
                    indirimliFiyat = kilometre * 0.7;
                } else {
                    indirimliFiyat = kilometre;
                }

                if (gidisDonus) {
                    indirimliFiyat *= 2;
                }

                System.out.println("Toplam indirimli fiyat: " + indirimliFiyat);


    }
}
