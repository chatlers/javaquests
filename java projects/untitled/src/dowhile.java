import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class dowhile {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int value;

        do {
            System.out.println("Print 5");
            value = in.nextInt();
        } while (value != 5);
        System.out.println("you are print 5");
    }

}
