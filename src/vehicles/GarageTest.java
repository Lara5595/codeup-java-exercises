package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car dailyCommuter = new Car("Toyota Echo");
        Car truck = new Car("Tacoma");              // We are creating the cars for the array
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lexus is500");

        Vehicles[] garageVehicles = {dailyCommuter, truck, muscleCar, luxuryVehicle}; // This creates a array with 4 vehicles
        garage.setVehicles(garageVehicles); // this get garage and sets the vehicles in the array
        garage.alarmCascade(); // this calls the loop for the alarms

        garage.getVehicles()[0] = new Motorcycle("Honda");  // replacing [0] with a motorcycle
        System.out.println(garage.getVehicles()[0].getName());

    } // end of main
} // end of garagetest
