import java.util.Scanner;

public class codewars_task {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] size = new int[x];
        int res = 0;

        for (int i = 0; i != size.length; i++){
            size[i] = i + 1;
            res += size[i];
        }

        System.out.println("(" + x + " --> " + res + ")");

        for (int i = 0; i != size.length; i++){
            if (i == 0){
                System.out.print("");
            } else {
                System.out.print(" + ");
            }
            System.out.print(size[i]);
        }
    }
}
