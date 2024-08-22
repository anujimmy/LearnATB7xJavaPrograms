package July.ex_July212024_LoopsNConditions;

public class Lab136 {
    public static void main(String[] args) {
        // Block of code which we can reuse.
        // Pre-built
        // User created / defined

//        2 components of the function
//        define the function
//        call the function

//        // 1.Without Parameters and Without Return Type
//        // 2.Without Parameters but With Return Type
//        // 3.With Parameters and Without Return Type
//        // 4. With Parameters and With Return Type
        function_type1();
        System.out.println("**********************");
        String name1 = function_type2();
        System.out.println(name1);
        System.out.println("**********************");
        function_type3("Jack & Jill");
        System.out.println("**********************");
        name1 = function_type4("Tom Tom Tom");
        System.out.println(name1);
    }

    //  1.Without Parameters and Without Return Type
    static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }
    // 2.Without Parameters but With Return Type
    static String function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return "Anu";
    }
    // 3.With Parameters and Without Return Type
    static void function_type3(String name){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);
    }
    // 4. With Parameters and With Return Type
    static String function_type4(String name1){
        System.out.println("4.With Parameters and With Return Type");
        System.out.println("You have shared -> " + name1);
        return name1+"Join";
    }

}
