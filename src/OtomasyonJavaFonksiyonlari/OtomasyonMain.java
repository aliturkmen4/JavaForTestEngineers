package OtomasyonJavaFonksiyonlari;

import java.sql.SQLOutput;

public class OtomasyonMain {
    public static void main(String[] args) {
        Araba ilkAraba=new Araba();
        ilkAraba.setArabaModeli("Volvo");
        System.out.println("İlk arabanın modeli: "+ilkAraba.getArabaModeli()+" ve fiyatı: "+ilkAraba.arabaFiyatı);
        ilkAraba.arabaFiyatı=450000;
        System.out.println("İlk arabanın modeli: "+ilkAraba.getArabaModeli()+" ve fiyatı: "+ilkAraba.arabaFiyatı);

        Araba ikinciAraba=new Araba();
        ikinciAraba.setArabaModeli("BMW");
        System.out.println("İkinci arabanın modeli: "+ikinciAraba.getArabaModeli()+" ve fiyatı: "+ikinciAraba.arabaFiyatı);

        Araba ucuncuAraba = new Araba();
        ucuncuAraba.setArabaModeli("Opel");
        System.out.println("Ucuncu arabanın modeli " + ucuncuAraba.getArabaModeli() + " ve fiyati " + ucuncuAraba.arabaFiyatı);
    }
}
