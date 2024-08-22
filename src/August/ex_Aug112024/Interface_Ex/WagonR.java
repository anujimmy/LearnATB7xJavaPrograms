package August.ex_Aug112024.Interface_Ex;

public class WagonR implements Engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Wagor R is started");

    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R is stopped");
    }


}
