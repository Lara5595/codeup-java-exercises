package vehicles;

public class VehiclesTest {
    public static void main(String[] args) {
        Vehicles car = new Vehicles();
        car.setName("Hyndai");
        System.out.print(car.getName() + " goes ");
        car.makeNoise();

        Tractor JohnDeere = new Tractor();
        JohnDeere.setName("John Deere");
        System.out.print(JohnDeere.getName() + " goes ");
        JohnDeere.makeNoise();
        JohnDeere.breakDown();

    } // end of main
} // end of vehicles test
