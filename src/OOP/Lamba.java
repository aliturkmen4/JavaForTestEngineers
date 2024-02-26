package OOP;

public class Lamba {
    public boolean durumu=false;

    private String konum;

    public Lamba(String odaninKonumu){
        konum=odaninKonumu;
        System.out.println("odanizin konumu: "+konum);
    }

    public void lambaDurumu(){
        if(durumu){
            System.out.println(konum+ " lambasi açık!");
        }
        else{
            System.out.println(konum+" lambasi kapalı!");
        }
    }
}
