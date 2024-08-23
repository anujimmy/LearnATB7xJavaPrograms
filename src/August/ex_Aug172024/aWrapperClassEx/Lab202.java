package August.ex_Aug172024.aWrapperClassEx;

public class Lab202 {
    public static void main(String[] args) {
        Car c = new Car("Zen");
        c.drive();
        Car.Gearbox c2 = c.new Gearbox();
        c2.m2();
    }

}

class Car{
    private String make;
    public Car(String make1){
        this.make = make1;
    }
    void drive(){
        System.out.println("Pls drive the car");
    }
    class Gearbox{
        void m2(){
            System.out.println("m2");
            System.out.println(make);
        }
        class NutBolts{

        }
    }
}
