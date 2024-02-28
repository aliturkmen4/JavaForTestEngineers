package OOPHomework;

public class HomeworkMain {
    public static void main(String[] args) {
        Sedan sedan=new Sedan("Opel",7200,800000,4);

        System.out.println("Aracımın modeli: "+sedan.getModel());
        System.out.println("Aracımın kullanilan km si: "+sedan.getKullanilanKm());
        System.out.println("Aracımın fiyatı: "+sedan.getFiyat());
        System.out.println("Aracımın kapisi: "+sedan.getKapi());
        sedan.arabayiSur(3000);
        sedan.satisFiyati(700000);

        System.out.println("---------------------------");

        System.out.println("Aracımın modeli: "+sedan.getModel());
        System.out.println("Aracımın kullanilan km si: "+sedan.getKullanilanKm());
        System.out.println("Aracımın fiyatı: "+sedan.getFiyat());
        System.out.println("Aracımın kapisi: "+sedan.getKapi());

        System.out.println("---------------------------");

        Hatchback hatchback=new Hatchback("TOGG",5000,1000000,4);
        System.out.println("Aracımın modeli: "+hatchback.getModel());
        System.out.println("Aracımın kullanilan km si: "+hatchback.getKullanilanKm());
        System.out.println("Aracımın fiyatı: "+hatchback.getFiyat());
        System.out.println("Aracımın kapisi: "+hatchback.getKapi());
        hatchback.arabayiSur(10000);
        hatchback.satisFiyati(890000);

        System.out.println("---------------------------");

        System.out.println("Aracımın modeli: "+hatchback.getModel());
        System.out.println("Aracımın kullanilan km si: "+hatchback.getKullanilanKm());
        System.out.println("Aracımın fiyatı: "+hatchback.getFiyat());
        System.out.println("Aracımın kapisi: "+hatchback.getKapi());
    }
}
