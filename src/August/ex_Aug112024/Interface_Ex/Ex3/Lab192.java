package August.ex_Aug112024.Interface_Ex.Ex3;

public class Lab192 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.m1();
    }
}

interface Eng{
    void start();
    default void m1(){
        System.out.println("OLD M1");
    }
    default void checkBrake(){
        System.out.println("check brake");
    }
}

interface Gearbox extends Eng{
    void gear();
}

interface Keys extends Gearbox{
    void openCar();
}

class Car implements Keys{
    @Override
    public void openCar() {
        System.out.println("opening the car");
    }

    @Override
    public void gear() {
        System.out.println("gear box part1");
    }

    @Override
    public void start() {
        System.out.println("starting the car");
    }
}