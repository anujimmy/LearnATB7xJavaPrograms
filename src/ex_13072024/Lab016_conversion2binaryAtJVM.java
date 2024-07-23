package ex_13072024;

public class Lab016_conversion2binaryAtJVM {
    public static void main(String[] args) {
        //        byte b = 128;

//        byte b can hold 128 compiler will throw incompatible types as byte can handle only -128 to 127

//        Characters are 2 types
//            ASCII - every character has a decimal value associated with it
//                Capital A has Decimal value - 65 & this decimal is converted to binary

//            Unicode - characters - different mandarin values symbols like indian rupee british pounds etc
//                Smileys also has unicode characters
//      System.out.println("B - " +  b); //- If we print b we get error java: incompatible types: possible lossy conversion from int to byte
        byte b= -127;
        System.out.println("B - " +  b);

    }
}
