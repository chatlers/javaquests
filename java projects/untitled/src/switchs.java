import java.util.Scanner;

public class switchs {
    public static void main(String [] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = a.nextInt();

        switch(age) {
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("ты школьник");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default :
                System.out.println("Ни одно из условий не прошло");
        }
    }
}
