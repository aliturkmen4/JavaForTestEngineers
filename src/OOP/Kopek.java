package OOP;

public class Kopek {
    private String isim;
    private String cins;
    private int yas;

    public Kopek(String isim,String cins,int yas){
        this.isim=isim; //this ile ilk kullandığım değişkenin sınıf içerisinden bir değşken olduğunu belirtiyorum!
        this.cins=cins;
        this.yas=yas;
    }

    //okuma methodları oluşturuyorum! public olduğu için diğer sınıflar tarafından da kullanılabilecek!

    public String getIsim(){
        return this.isim;
    }

    public String getCins(){
        return this.cins;
    }

    public int getYas(){
        return this.yas;
    }

    //Yazma methodu

    public String setIsim(String isim) {
       return this.isim = isim;
    }
}
