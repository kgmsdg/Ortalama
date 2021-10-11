import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int mat,fzk,kmy,trk,trh,mzk;

     Scanner input = new Scanner(System.in);
     System.out.print("Matematik Notunuzu Girin : " );
     mat = input.nextInt();
        System.out.print("Fizik Notunuzu Girin : " );
        fzk = input.nextInt();
        System.out.print("Kimya Notunuzu Girin : " );
        kmy = input.nextInt();
        System.out.print("Türkçe Notunuzu Girin : " );
        trk = input.nextInt();
        System.out.print("Tarih Notunuzu Girin : " );
        trh = input.nextInt();
        System.out.print("Müzik Notunuzu Girin : " );
        mzk = input.nextInt();

        int toplam = (mat + fzk + kmy + trk + trh + mzk);
        double sonuc = toplam / 6.0;
        boolean kosul1 = sonuc >= 60;
        String str = kosul1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız : " + sonuc);
        System.out.println(str);


    }
    }
