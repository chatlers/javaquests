import java.util.Scanner;

public class acrossTheLessons {
    public static void main(String [] args) {
        // сделаю калькулятор
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = x.nextInt();

        Scanner y = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int secondNumber = y.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.println("Выберите действие: ");
        String doing = d.nextLine();

        double res;

        switch (doing) {
            case "/" :
                res = firstNumber / secondNumber;
                System.out.println(res);
                break;
            case "*" :
                res = firstNumber * secondNumber;
                System.out.println(res);
                break;
            case "+" :
                res = firstNumber + secondNumber;
                System.out.println(res);
                break;
            case "-" :
                res = firstNumber - secondNumber;
                System.out.println(res);
                break;
            default:
                System.out.println("Вы ввели неверное значение");
        }
    }
}
