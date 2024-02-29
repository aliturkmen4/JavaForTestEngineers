package OtomasyonJavaFonksiyonlari;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> isimlerListesi=new ArrayList<>();
        isimlerListesi.add("Ali");
        isimlerListesi.add("Resul");
        System.out.println(isimlerListesi);
        isimlerListesi.add("Sinem");
        isimlerListesi.add("Tarçın(sevgilim)");
        System.out.println(isimlerListesi);
        String ilkEleman=isimlerListesi.get(0);
        System.out.println(ilkEleman);
        isimlerListesi.remove(3); //index 3 teki ismi sil!
        System.out.println(isimlerListesi);
        isimlerListesi.add("Emin");
        isimlerListesi.add("Neslihan");
        int listeBoyutu=isimlerListesi.size();
        System.out.println(listeBoyutu);
        System.out.println(isimlerListesi.isEmpty()); //liste boş mu?
        System.out.println(isimlerListesi.contains("Ali")); //liste Ali içeriyor mu?

        for(String isim:isimlerListesi){
            System.out.println(isim);
        }
    }
}
