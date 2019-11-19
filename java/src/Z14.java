import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        boolean flag = true;
        String s = null;
        System.out.println("Введите число");
        while (flag) {
            try {
                s = String.valueOf(new Scanner(System.in).nextInt());
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректное число \n" + e);
            }
        }

        int x = Integer.parseInt(s);
        double y = (double) x;

        System.out.println("String: " + s);
        System.out.println("int: " + x);
        System.out.println("double: " + y);
    }
}
