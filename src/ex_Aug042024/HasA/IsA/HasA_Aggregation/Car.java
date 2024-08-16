package ex_Aug042024.HasA.IsA.HasA_Aggregation;

public class Car {
    public void Startthecar(){
        new Engine().Start();
        new Tyres().rolling();
    }

    public static void main(String[] args) {
        new Car().Startthecar();
    }
}
