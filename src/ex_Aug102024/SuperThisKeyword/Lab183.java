package ex_Aug102024.SuperThisKeyword;

public class Lab183 {
    public static void main(String[] args) {
        bike b = new bike();
        b.display();
        b.message();
    }
}

class bike extends Vehicle{
    int maxspeed = 250;
    bike(){
        super(); //constructor chaining
        System.out.println("DC of bike");
    }
    public void display(){
        System.out.println("Bike speed is "+ this.maxspeed);
        System.out.println("Vehicle speed is "+ super.maxspeed);
        super.message();
        this.message();
    }
    @Override
    void message(){
        System.out.println("Hello bike");
    }
}
class Vehicle{
    int maxspeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }
    void message(){
        System.out.println("Hello vehicle");
    }
}
