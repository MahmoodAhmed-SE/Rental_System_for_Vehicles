import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    // this variable will store the agency name
    private String name; 
    
    // this variable will store the agency available vehicles
    private List<Vehicle> vehicles; 

    /*
    this class constructor will make an object for the rental agency with required
    argument: 'name' of the agency. It will also initialize an empty arrayList object
    for storing the collection of vehicles the agency have.
    */
    public RentalAgency(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    /* 
    addVehicle method is used to add a vehicle to the collection of vehicles
    the agency have.
    */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /*
    displayAvailableVehicles method will display the name of the agency 
    and all available vehicles. Each in a seperate line with all of the vehicle information.
    */
    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles at " + name + ":");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getIsAvailable()) {
                System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " (" + vehicle.getYear() + ")");
            }
        }
    }
}
