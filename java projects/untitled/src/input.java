import java.util.Scanner;

public class input {
    public static void main(String [] args){
        Scanner man = new Scanner(System.in); //создаем сканер
        System.out.println("Введите что-нибудь: ");
        String manAnswer = man.nextLine(); //считываем сканер
        System.out.println("Мужик сказал: " + manAnswer);
    }
}
