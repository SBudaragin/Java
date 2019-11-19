import java.io.BufferedReader;
import java.io.FileReader;

public class Z16 {
    public static void main(String[] args) {
        String s = "";
        String t;

        try (BufferedReader br = new BufferedReader(new FileReader("java/src/input.txt"))) {
            while ((t = br.readLine()) != null)
                s += t + "\n";
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(s);
    }
}


