import java.util.Scanner;

public class SwitchCaseHomework {
    public static void main(String[] args) {
        //Haftanın 7 günü için konsola yazdır.
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi gündeyiz? ");
        int a=input.nextInt();

        switch (a){
            case 1:
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden Salı");
                break;
            case 3:
                System.out.println("Bugün günlerden Çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden Perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden Cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden Cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden Pazar");
                break;
            default:
                System.out.println("Geçersiz bir gün girdin!");
        }

    }
}
