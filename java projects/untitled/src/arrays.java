public class arrays {
    public static void main (String [] args ) {
        int a = 10; //примитивный тип данных
        String b = "Hello"; //ссылочный типа данных. условно, numbers --> [массив] (ссылается)
        String c = new String ("Anither Hello"); // то же самое, что и строка выше
        int[] numbers = new int[5]; // объявление массива, в [] - размер массива

//        numbers[0] = 10; - пример объявления элементов массива
//        numbers[1] = 20;

        // int[] numbers1 = {1,2,3}

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;                      // заполнение ячеек массива с помощью цикла
            }
        for(int i = 0; i < numbers.length; i++){    // вывод данных массива
            System.out.println(numbers[i]);
        }
    }
}
