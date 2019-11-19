import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        boolean flag = true;
        int temp, j;
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

        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
