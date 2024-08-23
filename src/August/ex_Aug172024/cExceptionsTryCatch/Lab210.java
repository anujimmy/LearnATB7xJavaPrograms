package August.ex_Aug172024.cExceptionsTryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("C://file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            int a = 10;
            int b = a/0;
            System.out.println(b);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Error division by zero");
        }
        System.out.println("End of program");
    }
}
