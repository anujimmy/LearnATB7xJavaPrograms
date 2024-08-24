package August.ex_Aug182024.aExceptionPassingEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10/0;//unchecked arithmetic
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("e1");
        } catch (Exception e2){
            System.out.println("e2");
        }finally{
            System.out.println("I will be executed anyhow");
        }

        FileReader f = new FileReader(new File("C://a.txt"));


    }
}
