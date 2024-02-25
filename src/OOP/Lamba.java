package OOP;

public class Lamba {
    public boolean durumu=false;

    public void lambaDurumu(String konum){
        if(durumu){
            System.out.println(konum+ " lambasi açık!");
        }
        else{
            System.out.println(konum+" lambasi kapalı!");
        }
    }
}
