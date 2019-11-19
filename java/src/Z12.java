import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        String b = new Scanner(System.in).nextLine();
        System.out.format("Введенная строка без пробелов: %s", b.replace(" ", ""));
    }
}
