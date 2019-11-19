import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        final int CONST1 = 8;
        final int CONST2 = 5;
        final int CONST3 = 12;
        boolean flag = true;
        int x = 0;
        System.out.println("Введите число");
        while (flag) {
            try {
                x = new Scanner(System.in).nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректное число \n" + e);
            }
        }

        switch (x) {
            case CONST1:
                System.out.println("Данное значение имеется в константах");
                break;
            case CONST2:
                System.out.println("Данное значение имеется в константах");
                break;
            case CONST3:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }


    }
}
