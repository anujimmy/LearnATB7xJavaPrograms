package ex_July282024_OOPs;

public class Lab155 {
    public static void main(String[] args) {
        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using

        Builder DLF = new Builder();
        DLF.name = "DLF pvt ltd";
        DLF.address = "abc def";
        DLF.color = "grey";
        DLF.noOfFlats = 250;

        DLF.useLift();

        Builder Prestige = new Builder();
        Prestige.name = "Prestige pvt ltd";
        Prestige.address = "abc def";
        Prestige.color = "blue";
        Prestige.noOfFlats = 10;
    }
}
