import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2022, 50.0);
        Vehicle car2 = new Vehicle("Honda", "Accord", 2021, 45.0);

        // Create rental agency
        RentalAgency rentalAgency = new RentalAgency("MuscatRentals");

        // Add vehicles to the agency
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(car2);

        // Display available vehicles
        rentalAgency.displayAvailableVehicles();

        // Rent a vehicle
        car1.rent();

        // Attempt to rent the same vehicle again
        car1.rent();

        // Return the rented vehicle
        car1.returnVehicle();

        // Rent a vehicle for a specific period
        RentalTransaction rentalTransaction = new RentalTransaction(car2, LocalDate.now(), LocalDate.now().plusDays(5));

        // Display rental receipt
        rentalTransaction.displayReceipt();
    }
}
