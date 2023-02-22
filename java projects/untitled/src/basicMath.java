import java.util.Scanner;

public class basicMath {
//    public static void main(String args[]) {
//        System.out.println("Пример 1:");
//        Scanner word = new Scanner(System.in);
//        String str = word.nextLine();
//        String[] subStr;
//        String delimeter = "-"; // Разделитель
//        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
//        // Вывод результата на экран
//        for (int i = 0; i < subStr.length; i++) {
//            System.out.println(subStr[i]);
//        }
//    }
    public static void main (String [] args){
        Scanner wok = new Scanner(System.in);
        String str = wok.nextLine();
        String[] subStr;
        String delimeter = " ";

        subStr = str.split(delimeter);

        for(int i = 0; i != subStr.length; i++){
            System.out.print(subStr[i]);
        }
    }
}

