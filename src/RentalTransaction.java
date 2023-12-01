import java.time.LocalDate;

public class RentalTransaction {
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public RentalTransaction(Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        calculateTotalCost();
    }
    
    /*
    calculateRentalDays method takes the vehicle renting start date and subtract it
    with the rental end date. So, the returned value is the number of days the vehicle has been rented.
    */
    private long calculateRentalDays() {
        return endDate.toEpochDay() - startDate.toEpochDay();
    }
    
    
    private void calculateTotalCost() {
        // Calculate total cost based on rental duration and vehicle rental rate
        totalCost = vehicle.getRentalRate() * calculateRentalDays();
    }

    

    public void displayReceipt() {
        System.out.println("Rental Receipt:");
        System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
        System.out.println("Rental Period: " + startDate + " to " + endDate);
        System.out.println("Total Cost: $" + totalCost);
    }
}
