import java.util.Scanner;

public class praktika2 {
    public static void main (String [] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Введите день недели используя число");
        int x = a.nextInt();

        switch (x) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wenesday");
                break;
            case 4 :
                System.out.println("Foursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Мужик, в неделе 7 дней.");
        }
    }
}
