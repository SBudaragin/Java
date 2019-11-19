import java.util.Scanner;

public class Z9 {
    private static int[] array;

    public static void main(String[] args) {
        boolean flag = true;
        int x = 0;
        System.out.println("Введите число элементов массива");
        while (flag) {
            try {
                x = new Scanner(System.in).nextInt();
                array = new int[x];
                for (int i = 0; i < x; i++) {
                    array[i] = new Scanner(System.in).nextInt();
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректные данные \n" + e);
            }
        }

        for (int i : array) {
            System.out.println(i*2);
        }


    }
}
