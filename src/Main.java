import OOP.Insan;
import OOP.Lamba;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Insan ilkInsan=new Insan();
        ilkInsan.konsolaYazdir();

        System.out.println("----------------------------");

        Lamba salonLambasi=new Lamba();
        salonLambasi.lambaDurumu("Salon");

        Lamba yatakLambasi=new Lamba();
        yatakLambasi.durumu=true;
        yatakLambasi.lambaDurumu("Yatak odası");
        yatakLambasi.durumu=false;
        yatakLambasi.lambaDurumu("Yatak odası yeni");
        yatakLambasi.durumu=true;
        yatakLambasi.lambaDurumu("Yatak odası son durum");
    }
}