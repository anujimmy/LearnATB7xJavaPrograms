package ex_Aug102024.Encapsulation;

public class Bank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public Bank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getUserName(){
        return name;
    }
    public void setUserName(boolean IsAdm, String newName){
        if (IsAdm) {
            this.name =  newName;
            System.out.println("this is allowed");
        } else {
            System.out.println("this is not allowed");
        }
    }

    public long getBal(boolean IsAdm) {
        if (IsAdm) {
            return bal;
        } else {
            return 0;
        }
    }
    public void setBal(boolean IsAdm, long newBal) {
        if (IsAdm) {
            this.bal =  newBal;
            System.out.println("this is allowed");
        } else {
            System.out.println("this is not allowed");
        }
    }

}
