package OOP;

public class GirisSayfasi implements Sayfa,Menu{

    @Override
    public void tusaBas() {
        System.out.println("Tuşa basıldı!");
    }

    @Override
    public void elementBul() {
        System.out.println("Element bulundu!");
    }

    @Override
    public void widget() {
        System.out.println("Widget mevcut!");
    }
}
