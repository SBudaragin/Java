import java.util.Scanner;

public class Z13 {
    public static void main(String[] args) {
        System.out.println("Введите строку 1");
        String s1 = new Scanner(System.in).nextLine();

        System.out.println("Введите строку 2");
        String s2 = new Scanner(System.in).nextLine();


        if (s1.length() > s2.length())
            System.out.println("Строка 1: " + s1);
        else if (s1.length() < s2.length())
            System.out.println("Строка 2: " + s2);
        else
            System.out.format("Строки равны");
    }
}
