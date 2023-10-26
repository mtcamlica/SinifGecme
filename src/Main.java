import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kullanacağımız değişkenleri integer cinsinde tanımladık
        int mat, fiz, tur, kim, muz;
        int toplam = 0;
        int sayac = 0;

        //kullanıcıdan bilgi alacağız
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik : ");
        mat = input.nextInt();

        System.out.print("Fizik : ");
        fiz = input.nextInt();

        System.out.print("Türkçe : ");
        tur = input.nextInt();

        System.out.print("Kimya : ");
        kim = input.nextInt();

        System.out.print("Müzik : ");
        muz = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            toplam +=mat;
            sayac++;
        }
        if (fiz >= 0 && fiz <= 100) {
            toplam +=fiz;
            sayac++;
        }
        if (tur >= 0 && tur <= 100) {
            toplam +=tur;
            sayac++;
        }
        if (kim >= 0 && kim <= 100) {
            toplam +=kim;
            sayac++;
        }
        if (muz >= 0 && muz <= 100) {
            toplam +=muz;
            sayac++;
        }
        int ortalama = (toplam / sayac);
        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz");
        }else{
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
