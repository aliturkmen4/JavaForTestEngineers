package OOP;

abstract class Hayvan {
    protected String isim; //kedi subclass ından erişebilmek için protected yaptım!
    private String cins;
    private int yas;

    public Hayvan(String isim,String cins,int yas){
        this.isim=isim; //this ile ilk kullandığım değişkenin sınıf içerisinden bir değşken olduğunu belirtiyorum!
        this.cins=cins;
        this.yas=yas;
    }
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
    abstract void sesCikar();

    public void uyku(){
        System.out.println("ZzZ");
    }

}
