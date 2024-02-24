public class OperatorsHomework {
    public static void main(String[] args) {
        // 2 adet integer 85 ve 45
        // Değişkenleri kullanarak iki sayısının toplamını ve çarpımını yazdır!
        // Eğer sayıların çarpımı 3000 den büyük ve 4000 den küçük ise konsola sayıların çarpım değerini yazdır!

        int a=85;
        int b=45;
        int toplam=a+b;
        int çarpım=a*b;
        System.out.println("Sayıların çarpımı: "+çarpım);
        System.out.println("Sayıların toplamı: "+toplam);

        if(çarpım>3000 && çarpım<4000){
            System.out.println("Çarpım değeri: "+çarpım);
        }
    }
}
