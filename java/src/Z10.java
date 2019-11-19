import java.util.Scanner;

public class Z10 {
    private static int[][] array;

    public static void main(String[] args) {
        boolean flag = true;
        int x = 0, y = 0;
        while (flag) {
            try {
                System.out.println("Введите число строк и столбцов массива");
                x = new Scanner(System.in).nextInt();
                y = new Scanner(System.in).nextInt();
                array = new int[x][y];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {

                        array[i][j] = new Scanner(System.in).nextInt();
                    }
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректные данные \n" + e);
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < y; i++) {
            System.out.print(array[0][i] * 3 + " ");
        }


    }
}
