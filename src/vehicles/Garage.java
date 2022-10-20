package vehicles;

public class Garage {

    private Vehicles[] vehicles;

    // Getter
    public Vehicles[] getVehicles() {
        return vehicles;
    }
    // Setter
    public void setVehicles(Vehicles[] vehicles) {
        this.vehicles = vehicles;
    }

    // Methods
    public void alarmCascade(Vehicles[] vehicles){
        for (Vehicles vehicle : vehicles){
            vehicle.alarm();
        }

    }

}
