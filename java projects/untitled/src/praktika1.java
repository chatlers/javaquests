import java.util.Scanner;

public class praktika1 {
    public static void main (String [] args) {
        Scanner date = new Scanner(System.in);

        System.out.println("Введите четное целое число меньше 20");
        int x = date.nextInt();

        if (x <= 20 & x%2==0) {
            System.out.println("Вы ввели верное число");
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }
}
