public class WhileLoopDemo {
    public static void main(String[] args) {
        // i 1 den 5 kadar deger alabilirdi
        // i degerlerini konsola yazdir

        for (int i = 1;i <= 5; i++){
            System.out.println("For loop u ile " + i);
        }

        System.out.println("-------------------");

        int j = 1;
        while (j <=5){
            System.out.println("While loop ile sayimiz " +j);
            j++;
        }

        System.out.println("--------------------");

        int k =1;
        do {
            System.out.println("Do while loop ile sayimiz " +k);
            k++;
        } while (k <=5);
    }
}
