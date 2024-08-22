package July.ex_July272024_Arrays_StringBuilderStringBuffer;

public class Lab145 {
    public static void main(String[] args) {
//        args are saved in configuration of .java file
        if (args.length > 0){
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);
            }
        }else{
            System.out.println("no arguments given in config file");
        }

    }
}
