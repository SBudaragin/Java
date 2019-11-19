import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Введите число рублей");
                double r = new Scanner(System.in).nextDouble();
                System.out.println("Введите курс");
                double k = new Scanner(System.in).nextDouble();
                System.out.println((double) Math.round(r / k * 100) / 100 + "$");
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректные числа \n" + e);
            }
        }


    }
}
