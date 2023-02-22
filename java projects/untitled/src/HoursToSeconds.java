import java.util.Scanner;

public class HoursToSeconds {
    public static void main(String[] args) {
        Time hours = new Time();
        hours.name = "h";
        Scanner hour1 = new Scanner(System.in);
        hours.speak();
        int h = hour1.nextInt();
        if (h > 23){
            System.out.println("Invalid");
            return;
        }

        Time min = new Time();
        min.name = "m";
        Scanner min1 = new Scanner(System.in);
        min.speak();
        int m = min1.nextInt();
        if (m > 60){
            System.out.println("Invalid");
            return;
        }

        Time sec = new Time();
        sec.name = "s";
        Scanner sec1 = new Scanner(System.in);
        sec.speak();
        int s = sec1.nextInt();
        if (s > 60){
            System.out.println("Invalid");
            return;
        }

        int res = (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000);
        System.out.println("result = " + res);
    }

}
class Time {
    String name;
    void speak() {
        System.out.print(name + " = ");
    }

}
