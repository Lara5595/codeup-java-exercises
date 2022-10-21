package vehicles;

public class Motorcycle extends Vehicles{

    public void breakDown() {
        super.makeNoise();
        System.out.println("krrcckkklunnnnk");
    }



    // Constructors
    public Motorcycle() {
    }

    public Motorcycle(String name) {
        super(name);
    }
}
