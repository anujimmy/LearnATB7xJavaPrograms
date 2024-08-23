package August.ex_Aug182024.ExceptionPassingEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219_throws {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C://file.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        /*try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception - " + e.getMessage());
//            throw new RuntimeException(e);
        } */
    }
}
