package August.ex_Aug172024.WrapperClassEx;

public class Lab200 {
    public static void main(String[] args) {
        APIAutoamtion api = new APIAutoamtion();
        //SIB - called only 1 time
        //IIB - when object is created
    }
}
class APIAutoamtion{
    static{ //SIB
        System.out.println("Loaded data from the mySQL");
    }
    {//IIB
        System.out.println("Loaded data from the CSV");
    }
}