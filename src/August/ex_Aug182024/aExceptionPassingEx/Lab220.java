package August.ex_Aug182024.aExceptionPassingEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
    public static void readFile() throws FileNotFoundException, ArithmeticException {
        System.out.println("Hello Anu");
        String path = "C:\\Users\\Admin\\Desktop\\1.png";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        System.out.println("end of program");
        int a = 10/0;
    }
}
