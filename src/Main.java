import OOP.Insan;
import OOP.Lamba;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Insan ilkInsan=new Insan();
        ilkInsan.konsolaYazdir();

        System.out.println("----------------------------");

        Lamba salonLambasi=new Lamba("salon");
        salonLambasi.lambaDurumu();

        Lamba yatakLambasi=new Lamba("yatak odasi");
        yatakLambasi.durumu=true;
        yatakLambasi.lambaDurumu();
        yatakLambasi.durumu=false;
        yatakLambasi.lambaDurumu();
        yatakLambasi.durumu=true;
        yatakLambasi.lambaDurumu();
    }
}