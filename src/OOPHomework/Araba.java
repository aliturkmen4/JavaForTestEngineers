package OOPHomework;

public class Araba {

    private String kasaTipi;

    private String model;

    private int kullanilanKm;

    private int fiyat;

    private int kapi;

    public Araba(String kasaTipi,String model,int kullanilanKm,int fiyat,int kapi){
        this.kasaTipi=kasaTipi;
        this.model=model;
        this.kullanilanKm=kullanilanKm;
        this.fiyat=fiyat;
        this.kapi=kapi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanilanKm() {
        return kullanilanKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public void arabayiSur(int surulenKm){
        this.kullanilanKm += surulenKm;
        System.out.println("Arabanın yeni km si: "+this.kullanilanKm);
    }

    public int satisFiyati(int yeniSatisFiyati){
        return this.fiyat=yeniSatisFiyati;
    }


}
