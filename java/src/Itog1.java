import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
        boolean flag = true;
        int x = 0;
        int b;
        String s = "";

        System.out.println("Введите число в бинарном формате");
        while (flag) {
            try {
                b = new Scanner(System.in).nextInt();
                s = String.valueOf(b);
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректное число \n" + e);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            x <<= 1;
            if (s.charAt(i) == '1') x++;
        }

        System.out.println(x);
    }
}
