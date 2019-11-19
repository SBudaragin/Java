import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        String s = "";
        String t;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("java/src/input.txt"))) {
            while ((t = br.readLine()) != null) {
                s += t + "\n";
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Необходимо ввести строк:" + count);


        try (FileWriter fw = new FileWriter("java/src/input.txt")) {
            for (int i = 1; i <= count; i++) {
                System.out.println("Введите строку номер " + i);
                s = scanner.nextLine();
                fw.write(s + "\r\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


