import java.util.Scanner;

public class Z15 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        boolean flag = true;
        System.out.println("Введите число элементов массива");
        while (flag) {
            try {
                int x = new Scanner(System.in).nextInt();
                arr = new int[x];
                System.out.println("Введите элементы");
                for (int i = 0; i < x; i++) {
                    arr[i] = new Scanner(System.in).nextInt();
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Введите корректные данные \n" + e);
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}


