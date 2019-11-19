import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        boolean flag = true;
        double d = 0;
        System.out.println("Введите число");
        while (flag) {
            try {
                d = Float.parseFloat(new Scanner(System.in).nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректное число \n" + e);
            }
        }

        System.out.println("Произведение 1 и " + d + " равно: " + d * 1);
        System.out.println("Произведение 2 и " + d + " равно: " + d * 2);
        System.out.println("Произведение 3 и " + d + " равно: " + d * 3);
        System.out.println("Произведение 4 и " + d + " равно: " + d * 4);
        System.out.println("Произведение 5 и " + d + " равно: " + d * 5);
        System.out.println("Произведение 6 и " + d + " равно: " + d * 6);
        System.out.println("Произведение 7 и " + d + " равно: " + d * 7);
        System.out.println("Произведение 8 и " + d + " равно: " + d * 8);
        System.out.println("Произведение 9 и " + d + " равно: " + d * 9);

    }
}
