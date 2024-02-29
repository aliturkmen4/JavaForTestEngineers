package OtomasyonJavaFonksiyonlari;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> ogrenciNotu=new HashMap<>(); //int ilkel veri tipi olduğu için Integer kullan!
        ogrenciNotu.put("Ali",85); //değer atamayı sağlar (arraylistteki add gibi)
        ogrenciNotu.put("Yıldız",100);
        ogrenciNotu.put("Efe",98);
        ogrenciNotu.put("Tercan",72);
        System.out.println(ogrenciNotu);
        int not=ogrenciNotu.get("Ali"); //Ali nin notunu verir!
        System.out.println(not);
        System.out.println("Bütün anahtar değerleri: "+ogrenciNotu.keySet());
        System.out.println("Bütün değerler: "+ogrenciNotu.values());
        System.out.println("Bütün girdi çiftleri: "+ogrenciNotu.entrySet());

        ogrenciNotu.replace("Ali",30);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Yıldız"); //Yıldız a ait satırı sildim.
        System.out.println(ogrenciNotu);

        System.out.println(ogrenciNotu.size());

    }
}
