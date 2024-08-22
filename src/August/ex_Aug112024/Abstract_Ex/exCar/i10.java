package August.ex_Aug112024.Abstract_Ex.exCar;

public class i10 extends Car {
    void drivei10(){
        openCar();
        start();
        partGear();
        speed();
        stop();
    }
    int maxspeed;
    @Override
    void speed() {
        this.maxspeed = 100;
    }
}
