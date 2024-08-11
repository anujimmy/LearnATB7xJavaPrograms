package ex_July202024;

public class Lab100 {
    public static void main(String[] args) {
        char code = 'Z';
        int val = switch(code){
            case 'A':
                yield 65; // to return values IN FUTURE
            case 'B':
                yield 66;
            case 'C':
                yield 67;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
