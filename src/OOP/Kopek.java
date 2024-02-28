package OOP;

public class Kopek extends Hayvan{

    //Kopek Hayvan ın subclass ı olduğu için Hayvan daki constructor ı burada etkinleştirdim!
    public Kopek(String isim, String cins, int yas) {
        super(isim, cins, yas);
    }

    //okuma methodları oluşturuyorum! public olduğu için diğer sınıflar tarafından da kullanılabilecek!


    @Override
    void sesCikar() {
        System.out.println("HavHav");
    }

    @Override //Hyavan class ın daki methodu override ettiğimi (geçersiz kıldığımı) söylüyorum!
    public void uyku(){
        super.uyku(); //ana class taki uyku methodunu çağırdım! (ZzZ)
        System.out.println("Köpek uyurken horluyor!");
    }
}
