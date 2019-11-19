import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        boolean flag = true;
        double x = 0, y = 0, z = 0, s = 0;
        System.out.println("Введите 3 числа");
        while (flag) {
            try {
                x = new Scanner(System.in).nextDouble();
                y = new Scanner(System.in).nextDouble();
                z = new Scanner(System.in).nextDouble();
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректные числа \n" + e);
            }
        }
        s = (x + y + z) / 3;
        System.out.println("Среднее арифметическое трех чисел = " + s);
        if (s / 2 > 3) System.out.println("Программа выполнена корректно");


    }
}
