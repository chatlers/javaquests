public class arrays_of_strings {
    public static void main (String [] args) {
        int[] numbers = {1, 4, 7};

        System.out.println(numbers[0]);

        String[] word = new String[3];
        word[0] = "Привет";
        word[1] = "Пока";
        word[2] = "Джава";

        System.out.println(word[0]);

        for(int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

        System.out.println();

        for(String name:word){
            System.out.println(name);
        }

        int sum = 0;

        for (int x:numbers){
            sum += x;
        }
            System.out.println(sum);
    }
}
