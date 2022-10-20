package vehicles;

public class Vehicles {

    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void makeNoise(){
        System.out.println("honk honk");
    }


    // Constructors
    public Vehicles() {
        this.name = name;
    }




} // End of vehicles


// Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest. Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

// Create a method in the subclass of the Vehicle class that overrides the superclass makeNoise method.