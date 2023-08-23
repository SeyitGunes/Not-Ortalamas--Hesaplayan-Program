import java.util.Scanner;

public class ortalamaHesaplayici {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlayalım
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        //kullanıcıdan isteğimizi söyleyelim
        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
         mat = input.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
         fizik = input.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
         kimya = input.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
         turkce = input.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Giriniz: ");
         tarih = input.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
         muzik = input.nextInt();

         // Ortalama tanımlaması yapıyoruz

        int ortalama = (mat+fizik+kimya+turkce+tarih+muzik) / 6;
        double sonuc = ortalama;



        String gectimi= (sonuc >= 60) ? "geçti" : "kaldı";


        System.out.println(sonuc);
        System.out.println(gectimi);
    }
}
