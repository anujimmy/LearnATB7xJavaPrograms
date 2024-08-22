package August.ex_Aug112024.Abstract_Ex.exCar;

abstract class Car extends Engine{
    // hide the implementation & complexity
    //only important parts are available to user.


    //engine
    //gearbox
    //keys
    int maxspeed;
    @Override
    void start() {
        System.out.println("start the car");
    }

    @Override
    void stop() {
        System.out.println("stopping the car");
    }

    @Override
    void partGear() {
        System.out.println("part of gearbox");
    }

    @Override
    void openCar() {
        System.out.println("Open the car with keys");
    }
}
