import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
        String b;
        System.out.println("Введите число в бинарном формате");
        while (flag) {
            try {
                b = new Scanner(System.in).nextLine();
                i = Integer.parseInt(b, 2);
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректное число \n" + e);
            }
        }


        System.out.println(i);
    }
}
