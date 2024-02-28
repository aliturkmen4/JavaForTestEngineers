package OOP;

public class Inheritance {
    public static void main(String[] args) {
        Kopek ilkkopegim=new Kopek("Zeytin","Sivas Kangalı",7);
        System.out.println("Köpeğimin adı: "+ilkkopegim.getIsim());
        System.out.println("Köpeğimin cinsi: "+ilkkopegim.getCins());
        System.out.println("Köpeğimin yaşı: "+ilkkopegim.getYas());
        ilkkopegim.sesCikar();
        ilkkopegim.uyku();
    }
}
