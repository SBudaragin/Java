import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                Pattern pattern = Pattern.compile("[0-1]+?");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.matches()) throw new Exception("Введенно не двоичное число.");
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
