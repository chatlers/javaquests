public class mnogomernuy_massiv {
    public static void main (String [] args) {

        int[] number = {1, 2, 5};
        int[] nums = new int[5]; // -- это одномерный массив, потому что можем обращаться к индексу
        System.out.println(number[1]); //пример обращения к индексу

        /**
         * 1, 2, 3, 4 - одномерный массив
         *
         * 150
         * 378 -- матрица, двумерный массив
         * 312 -- чтобы обратитьсяк индексу, нужно указать его расположение (условно - 3[1]2 - [2][1] (сначала столбец, потом строка))
         */

        int[][] matrix = {{1,2,3,4,1},
                         {5}, // создание двумерного массива
                         {7,8,2}};

        String[][] words = new String[2][3];
        words[0][1] = "Привет";

        System.out.println(words[0][1]);

        System.out.println(matrix[2][1]); //вывод, !!СНАЧАЛА СТОЛБЕЦ, ПОТОМ СТРОКА!!

        for(int i = 0; i < matrix.length; i++){ //в Matrix length равно трем, поскольку он состоит из 3 одномерных массивов
            for(int j = 0; j < matrix[i].length; j++){ //внешний цикл проходит по строкам, а внутренний по элементам
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        for(int a = 0; a < matrix.length; a++){
            for(int u = 0; u < matrix[a].length; u++){
                System.out.print(matrix[a][u] + " ");
            }
            System.out.println();
        }

    }
}
