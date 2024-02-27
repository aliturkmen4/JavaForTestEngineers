package OOP;

public class Encapsulation {
    public static void main(String[] args) {
        Kopek ilkkopegim=new Kopek("Berduş","Golden",7);
        System.out.println("Köpeğimin adı: "+ilkkopegim.getIsim());
        System.out.println("Köpeğimin cinsi: "+ilkkopegim.getCins());
        System.out.println("Köpeğimin yaşı: "+ilkkopegim.getYas());
        ilkkopegim.setIsim("Pırasa");
        System.out.println("----------------------");
        System.out.println("Köğemin yeni ismi: "+ilkkopegim.getIsim());
        System.out.println("Köpeğimin cinsi: "+ilkkopegim.getCins());
        System.out.println("Köpeğimin yaşı: "+ilkkopegim.getYas());
        System.out.println("----------------------");
        Kopek ikinciKopegim=new Kopek("Ares","Golden",15);
        System.out.println("Köpeğimin adı: "+ikinciKopegim.getIsim());
        System.out.println("Köpeğimin cinsi: "+ikinciKopegim.getCins());
        System.out.println("Köpeğimin yaşı: "+ikinciKopegim.getYas());
    }
}
