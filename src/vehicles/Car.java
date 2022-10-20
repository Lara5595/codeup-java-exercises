package vehicles;

public class Car  extends Vehicles{
    public Car(String name){
        this.setName(name);  // we cant use this.name because our getter is on Vehicles so we get it with this.setname(name)
    }

}
