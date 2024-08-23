package August.ex_Aug182024.ExceptionPassingEx;

public class Lab225 {
    public static void main(String[] args) {
        try{
            String s1 = null;
            if (s1.isEmpty()){
                throw new Exception("String is null, Add a proper string");
            }
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
