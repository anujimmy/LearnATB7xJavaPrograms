package August.ex_Aug112024.Abstract_Ex.exCar;

public class Tesla extends Car{
    public void drive(){
        openCar();
        start();
        partGear();
        stop();
    }
    int maxspeed ;
    @Override
    void speed() {
        this.maxspeed = 220;
    }

    @Override
    void start() {
//        super.start();
        System.out.println("starting tesla");
    }

    @Override
    void stop() {
        System.out.println("stopping tesla");
    }

    @Override
    void partGear() {
        System.out.println("no gear - electric");
    }

    @Override
    void openCar() {
        System.out.println("opening the car");
    }
}
