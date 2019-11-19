import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("java/src/input1.txt")) {
            while (true) {
                System.out.println("Введите следующую строку или введите stop для завершения");
                s = scanner.nextLine();
                if (s.equals("stop")) break;
                fw.write(s + "\r\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


