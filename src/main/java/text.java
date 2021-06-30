import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class text{
    public static void main(String[] args) {
        text demo = new text();
        System.out.println(demo.aMethod());
    }
    public int aMethod() {
        try {
            FileInputStream fis = new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("NO such file found");
            return -1;
        }finally {
            System.out.println("Doing finally");
        }
        return 0;
    }
}